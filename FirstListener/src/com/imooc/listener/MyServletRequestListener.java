package com.imooc.listener; /**
 * Created by localhost on 17-6-20.
 */

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

public class MyServletRequestListener implements ServletRequestListener{

    // Public constructor is required by servlet spec
    public MyServletRequestListener() {
    }

    public void requestDestroyed(ServletRequestEvent servletRequestEvent){
        System.out.println("requestDestroyed");
    }

    public void requestInitialized(ServletRequestEvent servletRequestEvent){
        String name = servletRequestEvent.getServletRequest().getParameter("name");
        System.out.println("requestInitialized name: "+name);
    }
}
