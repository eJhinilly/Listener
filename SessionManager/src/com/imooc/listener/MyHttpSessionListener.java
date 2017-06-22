package com.imooc.listener; /**
 * Created by localhost on 17-6-21.
 */

import com.imooc.entity.User;
import com.imooc.util.SessionUtil;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
import java.util.ArrayList;

@WebListener()
public class MyHttpSessionListener implements HttpSessionListener{

    private int userNumber = 0;

    // Public constructor is required by servlet spec
    public MyHttpSessionListener() {
    }

    // -------------------------------------------------------
    // HttpSessionListener implementation
    // -------------------------------------------------------
    public void sessionCreated(HttpSessionEvent se) {
      /* Session is created. */
        userNumber++;
        se.getSession().getServletContext().setAttribute("userNumber",userNumber);
    }

    public void sessionDestroyed(HttpSessionEvent se) {
      /* Session is destroyed. */
        userNumber--;
        se.getSession().getServletContext().setAttribute("userNumber",userNumber);

        ArrayList<User> userlist =null;

        userlist = (ArrayList<User>) se.getSession().getServletContext().getAttribute("userlist");
        if(SessionUtil.getUserBySessionId(userlist,se.getSession().getId())!=null){
            userlist.remove(SessionUtil.getUserBySessionId(userlist,se.getSession().getId()));
        }

    }

}
