package com.pipichao.service;

import com.pipichao.dao.BaseCustomerDao;
import com.pipichao.entity.BaseCustomer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

//@Service
public class CustomerService {
    @Autowired
    private BaseCustomerDao baseCustomerDao;
    public String getCustomerById(String customerNo){
        return baseCustomerDao.selectByPrimaryKey(customerNo).toString();
    }

    public String addCustomer(){
        baseCustomerDao.insertSelective(new BaseCustomer());
        return "";
    }
//    public static void main(final String[] args) throws Exception {
//        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:spring-config.xml");
//        CustomerService fooService = (CustomerService) ctx.getBean("customerService");
//        fooService.addCustomer();
//    }
}
