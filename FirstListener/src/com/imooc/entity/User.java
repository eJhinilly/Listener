package com.imooc.entity;

import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;
import javax.servlet.http.HttpSessionEvent;
import java.io.Serializable;

/**
 * Created by localhost on 17-6-21.
 */
public class User implements HttpSessionBindingListener,HttpSessionActivationListener,Serializable{

    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public void valueBound(HttpSessionBindingEvent httpSessionBindingEvent) {
        System.out.println("valueBound Name:"+httpSessionBindingEvent.getName());
    }

    @Override
    public void valueUnbound(HttpSessionBindingEvent httpSessionBindingEvent) {
        System.out.println("valueUnbound Name:"+httpSessionBindingEvent.getName());
    }

    //钝化
    public void sessionWillPassivate(HttpSessionEvent httpsessionevent) {
        System.out.println("sessionWillPassivate "+httpsessionevent.getSource());
    }
    //活化
    public void sessionDidActivate(HttpSessionEvent httpsessionevent) {
        System.out.println("sessionDidActivate "+httpsessionevent.getSource());
    }
}
