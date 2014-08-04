package net.shangtech.weixin.commons.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
public class ApplicationStartupListener implements ServletContextListener {

	public void contextDestroyed(ServletContextEvent arg0) {
		
	}

	public void contextInitialized(ServletContextEvent sce) {
		String staticServer = sce.getServletContext().getInitParameter("staticServer");
		sce.getServletContext().setAttribute("staticServer", staticServer);
	}

}
