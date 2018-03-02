/**
 * @author: cloudy  Date: 2018/2/22 Time: 11:27
 * @email: 272685110@qq.com
 * @description: 服务下线通知(邮件和短信)
 * @project: micro
 */

package com.hechihan.micro.admin.monitor.filter;

import com.hechihan.micro.admin.monitor.config.MessagesReceiver;
import de.codecentric.boot.admin.event.ClientApplicationEvent;
import de.codecentric.boot.admin.event.ClientApplicationStatusChangedEvent;
import de.codecentric.boot.admin.notify.AbstractStatusChangeNotifier;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.core.RabbitTemplate;

import java.text.SimpleDateFormat;

@Slf4j
@RequiredArgsConstructor()
public class MessageNotifierFilter extends AbstractStatusChangeNotifier {
    public static final String STATUS_CHANGE = "STATUS_CHANGE";
    private RabbitTemplate rabbitTemplate;

    private MessagesReceiver  messagesReceiver;

    public MessageNotifierFilter(MessagesReceiver messagesReceiver, RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
        this.messagesReceiver = messagesReceiver;
    }



    // TODO 根据不同的环境来决定是否发送通知

    /**
     * 判断是否通知
     * @param event 事件
     * @return true or false
     */
    @Override
    protected boolean shouldNotify(ClientApplicationEvent event) {
        boolean statusChange = STATUS_CHANGE.equals(event.getType());
        boolean shouldNotify =  (statusChange && (event.getApplication().getStatusInfo().isOffline())
                || (statusChange &&event.getApplication().getStatusInfo().isDown()) );
        return shouldNotify;
    }

    @Override
    protected void doNotify(ClientApplicationEvent event) throws Exception {
        if(event instanceof ClientApplicationStatusChangedEvent){
            log.info("Application {} ({}) is {}", event.getApplication().getName(),
                    event.getApplication().getId(), ((ClientApplicationStatusChangedEvent) event).getTo().getStatus());
            String text = String.format("应用:%s 服务ID:%s 下线，时间：%s", event.getApplication().getName(), event.getApplication().getId(), new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(event.getTimestamp()));
            // 发送短信
            MobileNotifier(text);
            // 发送邮件
            EmailNotifier(text);
        }else{
            log.info("Application {} ({}) {}", event.getApplication().getName(),
                    event.getApplication().getId(), event.getType());
        }
    }
    public void MobileNotifier(String note){
        rabbitTemplate.convertAndSend("SERVICE_STATUS_CHANGE",
                messagesReceiver.getMobiles(),note );

    }
    public void EmailNotifier(String note){
        rabbitTemplate.convertAndSend("SERVICE_STATUS_CHANGE",
                messagesReceiver.getEmails(),note );
    }
}
