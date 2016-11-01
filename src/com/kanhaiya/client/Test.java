package com.kanhaiya.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kanhaiya.model.Employee;
import com.kanhaiya.model.Pancard;


public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
    Employee e1= context.getBean("employee", Employee.class);
    System.out.println(e1.getEmployeeId()+ " \t "+e1.getEmployeeName());
    
    Pancard pancard=e1.getPancard();
    if(pancard!=null)
    {
    	System.out.println(pancard.getPanHolder()+" \t "+pancard.getPanNo());
    }
    else{
    	System.out.println("pancard info not available");
    }
        ((AbstractApplicationContext) context).close();
	}

}
