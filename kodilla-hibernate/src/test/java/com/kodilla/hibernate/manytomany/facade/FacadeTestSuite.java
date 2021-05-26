package com.kodilla.hibernate.manytomany.facade;


import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class FacadeTestSuite {

    @Autowired
    Facade facade;

    @Autowired
    CompanyDao companyDao;

    @Autowired
    EmployeeDao employeeDao;

    @Test
    public void getCompanyByNameFragment() {
        //Given
        Company company1 = new Company("ABCDEEFG");
        Company company2 = new Company("OKSLCDEEO");
        Company company3 = new Company("POKDEECMS");

        companyDao.deleteAll();

        //When
        companyDao.save(company1);
        int company1ID = company1.getId();
        companyDao.save(company2);
        int company2ID = company2.getId();
        companyDao.save(company3);
        int company3ID = company3.getId();

        //Then
        assertEquals(3, facade.searchCompanyByNameFrament("EE").size());

        //Clean
        try {
            companyDao.deleteById(company1ID);
            companyDao.deleteById(company2ID);
            companyDao.deleteById(company3ID);
        } catch (Exception e) {

        }
    }

    @Test
    public void getEmployeeByLastNameFragment() {
        //Given
        Employee employee1 = new Employee("Anna", "Nowak");
        Employee employee2 = new Employee("Jan", "Kowalski");
        Employee employee3 = new Employee("Wiktor", "Kolodziejski");

        //When
        employeeDao.save(employee1);
        int employee1Id = employee1.getId();
        employeeDao.save(employee2);
        int employee2Id = employee2.getId();
        employeeDao.save(employee3);
        int employee3Id = employee3.getId();
        List<Employee> companies = facade.searchEmployeeByFragment("sk");

        //Then
        assertEquals(2, companies.size());

        //Clean
        try {
            employeeDao.deleteById(employee1Id);
            employeeDao.deleteById(employee2Id);
            employeeDao.deleteById(employee3Id);
        } catch (Exception e) {

        }
    }
}
