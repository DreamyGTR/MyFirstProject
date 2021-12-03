package com.example.demo.util;

import com.example.demo.model.InterfaceName;

import java.util.Locale;
import java.util.ResourceBundle;

public class ConfigFile {
    private static ResourceBundle resourceBundle=ResourceBundle.getBundle("application", Locale.CHINA);
    private static String getUrl(InterfaceName interfaceName){
        String address=resourceBundle.getString("test.url");
        String uri="";
        //最终地址
        String testUrl;
        if (interfaceName.equals(InterfaceName.LOGIN)){
            uri=resourceBundle.getString("login.uri");
        }else if(interfaceName.equals(InterfaceName.GETUSERLIST)){
            uri=resourceBundle.getString("getUserList.uri");
        }else if(interfaceName.equals(InterfaceName.ADDUSERINFO)){
            uri=resourceBundle.getString("addUser.uri");
        }else if(interfaceName.equals(InterfaceName.UPDATEUSERINFO)){
            uri=resourceBundle.getString("updataUserInfo.uri");
        } else if(interfaceName.equals(InterfaceName.GETUSERINFO)){
            uri=resourceBundle.getString("getUserInfo.uri");
        }
        testUrl=address+uri;
         return uri;
    }
}
