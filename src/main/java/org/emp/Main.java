package org.emp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context =  new ClassPathXmlApplicationContext("spring-bean.xml");
        System.out.println("Spring container is ready");
        EmployeeDao dao=(EmployeeDao)context.getBean("empDao");

        Employee newEmp = new Employee(3,"Raj",10000);
        dao.saveEmployee(newEmp);

        Employee newEmp2= new Employee(4,"Lo",10000);
        dao.saveEmployee(newEmp2);
        List<Employee> empList = dao.getEmployee();

        for (Employee emp:empList) {
            System.out.println(emp.getName());
        }
    }
}