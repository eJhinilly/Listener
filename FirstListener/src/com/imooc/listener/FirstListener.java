package com.imooc.listener; /**
 * Created by localhost on 17-6-20.
 */

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class FirstListener implements ServletContextListener
         {

    // Public constructor is required by servlet spec
    public FirstListener() {
    }

    // -------------------------------------------------------
    // ServletContextListener implementation
    // -------------------------------------------------------
    public void contextInitialized(ServletContextEvent sce) {
      /* This method is called when the servlet context is
         initialized(when the Web application is deployed). 
         You can initialize servlet context related data here.
      */
        String initParam = sce.getServletContext().getInitParameter("init");
        System.out.println("contextInitialized : initParam ="+initParam);

    }

    public void contextDestroyed(ServletContextEvent sce) {
      /* This method is invoked when the Servlet Context 
         (the Web application) is undeployed or 
         Application Server shuts down.
      */
        System.out.println("contextDestroyed");
    }

}
