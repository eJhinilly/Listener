package com.imooc.listener; /**
 * Created by localhost on 17-6-21.
 */

import com.imooc.entity.User;
import com.imooc.util.SessionUtil;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

@WebListener()
public class MyServletRequestListener implements ServletRequestListener {

    private ArrayList<User> userlist;
    // Public constructor is required by servlet spec
    public MyServletRequestListener() {
    }

    @Override
    public void requestDestroyed(ServletRequestEvent servletRequestEvent) {

    }

    @Override
    public void requestInitialized(ServletRequestEvent servletRequestEvent) {

        userlist = (ArrayList<User>) servletRequestEvent.getServletContext().getAttribute("userlist");

        if(userlist==null){
            userlist = new ArrayList<User>();
        }

        HttpServletRequest request = (HttpServletRequest) servletRequestEvent.getServletRequest();
        String sessionIdString = request.getSession().getId();

        if(SessionUtil.getUserBySessionId(userlist,sessionIdString) == null){
            User user = new User();
            user.setSessionIdString(sessionIdString);
            user.setFirstTimeString(new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
            user.setIpString(request.getRemoteAddr());
            userlist.add(user);
        }
        servletRequestEvent.getServletContext().setAttribute("userlist",userlist);
    }
}
