package com.sample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String[] args){
	ApplicationContext ctx = 
		      new AnnotationConfigApplicationContext(HelloWorldConfig.class);
		   
		      HelloWorld helloWorld = (HelloWorld)ctx.getBean(HelloWorld.class);

		      helloWorld.setMessage("Hello my message");
		      helloWorld.getMessage();
	}
}
