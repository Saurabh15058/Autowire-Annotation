package com.websystique.spring.domain;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.websystique.spring.domain.Communication;
import com.websystique.spring.domain.Messaging;
import com.websystique.spring.domain.impl.ActiveMQMessaging;
 
public class AppMain {
    public static void main(String args[]){
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("app-config.xml");
        Communication app = (Communication)context.getBean("communication");
        app.communicate();
        
 /*  Messaging obj2=new ActiveMQMessaging();   
  *    Communication obj=new Communication(obj2);
       
        	
 */       	
        
    }
}