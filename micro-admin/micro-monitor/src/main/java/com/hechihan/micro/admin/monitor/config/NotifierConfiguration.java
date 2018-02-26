/**
 * @author: cloudy  Date: 2018/2/22 Time: 13:09
 * @email: 272685110@qq.com
 * @description: 监控提醒配置
 * @project: micro
 */

package com.hechihan.micro.admin.monitor.config;

import com.hechihan.micro.admin.monitor.filter.MessageNotifierFilter;
import de.codecentric.boot.admin.notify.RemindingNotifier;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.concurrent.TimeUnit;

@Configuration
@EnableScheduling
public class NotifierConfiguration {
    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Autowired
    private MessagesReceiver  messagesReceiver;

    @Bean
    public RemindingNotifier remindingNotifier() {
        RemindingNotifier remindingNotifier = new RemindingNotifier(messageNotifierFilter());
        remindingNotifier.setReminderPeriod(TimeUnit.MINUTES.toMillis(1));
        return remindingNotifier;
    }
    @Scheduled(fixedRate = 60000L)
    public void remind() {
        remindingNotifier().sendReminders();
    }
    @Bean
    public MessageNotifierFilter messageNotifierFilter(){
        return new MessageNotifierFilter(messagesReceiver,rabbitTemplate);
    }
}
