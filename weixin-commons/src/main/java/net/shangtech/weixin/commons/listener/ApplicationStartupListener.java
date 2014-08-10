package net.shangtech.weixin.commons.listener;

import java.io.IOException;
import java.util.Properties;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
public class ApplicationStartupListener implements ServletContextListener {

	public void contextDestroyed(ServletContextEvent arg0) {
		
	}

	public void contextInitialized(ServletContextEvent sce) {
		Properties props = new Properties();
		try {
			props.load(ApplicationStartupListener.class.getClassLoader().getResourceAsStream("servers.properties"));
			sce.getServletContext().setAttribute("staticServer", props.getProperty("static.server"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
