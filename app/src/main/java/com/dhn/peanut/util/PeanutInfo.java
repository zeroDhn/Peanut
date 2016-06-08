package com.dhn.peanut.util;

/**
 * Created by DHN on 2016/6/4.
 */
public class PeanutInfo {
    public static final String CALLBACK_URL = "http://www.google.com";
    public static final String LOGIN_URL_BASE = "https://dribbble.com/oauth/authorize";
    public static final String MY_INFO_URL = "https://api.dribbble.com/v1/user";
    public static final String TOKEN_URL = "https://dribbble.com/oauth/token";
    public static final String REQUEST_ON_SHOT_URL = "https://api.dribbble.com/v1/shots/";

    public static final String CLIENT_ID = "19188df67f0204b0057b74882021900319ecd4c79cb2fcbb78c0b72b4642fdf9";
    public static final String CLIENT_SECRET = "a09ea1f8d8f6d8e99162719bbc65fc75052b9e43a339c59529ac0f97e447de11";

    public static final String PREFERENCE_TOKEN = "preference_user_token";
    public static final String PREFERENCE_USER_ID = "preference_user_id";
    public static final String PREFERENCE_USER_NAME = "preference_user_name";
    public static final String PREFERENCE_USER_AVATAR = "preference_user_avatar";
    public static final String PREFERENCE_USER_LIKE_URL = "preference_user_like_url";
    public static final String PREFERENCE_USER_LIKES = "preference_user_likes";
    public static final String PREFERENCE_USER_LOGINED = "preference_user_logined";

    public static final String TOKEN_FIELD = "token";
    public static final String HEAD_AUTH_FILED = "Authorization";
    public static final String HEAD_BEAR = " Bearer ";
    public static String mState;

    public static final String LOGIN_URL = LOGIN_URL_BASE + "?" +
                    "client_id=" + CLIENT_ID +
                    "&redirect_uri=" + CALLBACK_URL +
                    "&scope=" + "public write comment upload" +
                    "&state=" + mState;
}