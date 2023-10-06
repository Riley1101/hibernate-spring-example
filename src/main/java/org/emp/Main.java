package org.emp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context =  new ClassPathXmlApplicationContext("spring-bean.xml");
        System.out.println("Spring container is ready");
        EmployeeDao dao=(EmployeeDao)context.getBean("empDao");
        List<Employee> emps=dao.getEmployees();
        for(int i=0;i<emps.size();i++){
            System.out.println(emps.get(i));
        }


    }
}