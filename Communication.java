package com.websystique.spring.domain;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.websystique.spring.domain.*;
import com.websystique.spring.domain.impl.ActiveMQMessaging;
 
public class Communication {
	private Messaging messaging;
    
	public Communication() {
		super();
		System.out.println("in default constr of communication");
	}
     
	
    public Communication(Messaging messaging) {
		super();
		this.messaging = messaging;
		System.out.println(" in para constr");
	}
    
    @Autowired
 	  public void setMessaging(Messaging messaging){
    	
        this.messaging = messaging;
        System.out.println("in setter method");
    }
 
    public void communicate(){
        messaging.sendMessage();
    }
}




