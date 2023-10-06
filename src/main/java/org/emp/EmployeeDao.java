package org.emp;

import java.util.ArrayList;
import java.util.List;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

public class EmployeeDao
{
    private HibernateTemplate session;

    public void setTemplate(HibernateTemplate template) {
        this.session = template;
    }

    @Transactional(readOnly = false)
    public void saveEmployee(Employee emp){
        session.save(emp);
    }

    @Transactional(readOnly = false)
    public void updateEmployee(Employee emp){
        session.update(emp);
    }

    @Transactional(readOnly = false)
    public void deleteEmployee(Employee e){
        session.delete(e);
    }

    public Employee getById(int id){
        Employee emp = (Employee)session.get(Employee.class,id);
        return emp;
    }

    public List<Employee> getEmployees(){
        List<Employee> list=new ArrayList<Employee>();
        list = session.loadAll(Employee.class);
        return list;
    }
}


