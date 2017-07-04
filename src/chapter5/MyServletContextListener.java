package chapter5;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

public class MyServletContextListener implements ServletContextListener {

    public void contextDestroyed(ServletContextEvent event)  { 
         // TODO Auto-generated method stub
    }

    public void contextInitialized(ServletContextEvent event)  { 
         ServletContext sc = event.getServletContext();
         String dogBreed = sc.getInitParameter( "breed" );
         Dog d = new Dog(dogBreed);
         sc.setAttribute( "dog", d );
    }
	
}
