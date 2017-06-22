package com.imooc.listener; /**
 * Created by localhost on 17-6-20.
 */

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class MyHttpSessionListener implements
        HttpSessionListener {

    // Public constructor is required by servlet spec
    public MyHttpSessionListener() {
    }


    // -------------------------------------------------------
    // HttpSessionListener implementation
    // -------------------------------------------------------
    public void sessionCreated(HttpSessionEvent se) {
      /* Session is created. */
        System.out.println("sessionCreated");
    }

    public void sessionDestroyed(HttpSessionEvent se) {
      /* Session is destroyed. */
        System.out.println("sessionDestroyed");
    }

}
