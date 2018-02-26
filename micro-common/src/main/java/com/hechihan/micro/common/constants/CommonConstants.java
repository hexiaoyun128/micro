/**
 * @author: cloudy  Date: 2018/1/28 Time: 14:48
 * @email: 272685110@qq.com
 * @description:
 * @project: micro
 */

package com.hechihan.micro.common.constants;

public class CommonConstants {
    public final static Integer OK = 200;
    public final static String RESOURCE_TYPE_MENU = "menu";
    public final static String RESOURCE_TYPE_BTN = "button";
    public static final Integer EX_TOKEN_ERROR_CODE = 40101;
    // 用户token异常
    public static final Integer EX_USER_INVALID_CODE = 40102;
    // 客户端token异常
    public static final Integer EX_CLIENT_INVALID_CODE = 40131;
    public static final Integer EX_CLIENT_FORBIDDEN_CODE = 40331;
    public static final Integer EX_OTHER_CODE = 500;
    public static final String CONTEXT_KEY_USER_ID = "currentUserId";
    public static final String CONTEXT_KEY_USERNAME = "currentUserName";
    public static final String CONTEXT_KEY_USER_NAME = "currentUser";
    public static final String CONTEXT_KEY_USER_TOKEN = "currentUserToken";
    public static final String JWT_KEY_USER_ID = "userId";
    public static final String JWT_KEY_NAME = "name";


    /**
     * 状态变化事件失败
     */
    public static final Integer EVENT_ERROR = 40100;
}
