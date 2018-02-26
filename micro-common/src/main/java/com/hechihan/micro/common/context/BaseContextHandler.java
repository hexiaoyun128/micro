/**
 * @author: cloudy  Date: 2018/1/28 Time: 15:11
 * @email: 272685110@qq.com
 * @description:
 * @project: micro
 */

package com.hechihan.micro.common.context;
import com.hechihan.micro.common.constants.CommonConstants;
import com.hechihan.micro.common.util.StringHelper;
import java.util.HashMap;
import java.util.Map;

public class BaseContextHandler {
    public static ThreadLocal<Map<String,Object>> threadLocal = new ThreadLocal<Map<String,Object>>();
    public static void set(String key,Object value){
         Map<String,Object> map =  threadLocal.get();
         if(map ==null){
             map = new HashMap<String, Object>();
             threadLocal.set(map);
         }
        map.put(key,value);
    }

    public static Object get(String key){
        Map<String,Object> map =  threadLocal.get();
        if(map ==null){
            map = new HashMap<String, Object>();
            threadLocal.set(map);
        }
        return map.get(key);
    }
    public static void init(){
        Map<String,Object> map =  threadLocal.get();
        if(map ==null){
            map = new HashMap<String, Object>();
            threadLocal.set(map);
        }
    }

    public static String getUserID(){
        Object value = get(CommonConstants.CONTEXT_KEY_USER_ID);
        return StringHelper.getObjectValue(value);
    }

    public static String getUsername(){
        Object value = get(CommonConstants.CONTEXT_KEY_USERNAME);
        return StringHelper.getObjectValue(value);
    }

    public static String getName(){
        Object value = get(CommonConstants.CONTEXT_KEY_USER_NAME);
        return StringHelper.getObjectValue(value);
    }

    public static void setUserID(String userID){
        set(CommonConstants.CONTEXT_KEY_USER_ID,userID);
    }

    public static void setUsername(String username){
        set(CommonConstants.CONTEXT_KEY_USERNAME,username);
    }

    public static void setName(String name){set(CommonConstants.CONTEXT_KEY_USER_NAME,name);}

    public static void remove(){
        threadLocal.remove();
    }

}
