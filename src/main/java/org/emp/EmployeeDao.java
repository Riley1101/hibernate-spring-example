package org.emp;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;

public class EmployeeDao
{
    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    private SessionFactory sessionFactory;


    public void saveEmployee(Employee emp){
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(emp);
        session.getTransaction().commit();
        session.close();
    }
    public  List<Employee> getEmployee(){
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        List<Employee> empList = session.createQuery("from Employee").list();
        session.getTransaction().commit();
        session.close();
        return empList;
    }
}


