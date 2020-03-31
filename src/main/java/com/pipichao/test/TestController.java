package com.pipichao.test;

import com.pipichao.dao.BaseCustomerDao;
import com.pipichao.entity.BaseCustomer;
import com.pipichao.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/")
@Controller
public class TestController {
    @Autowired
    private CustomerService customerService;


    @RequestMapping("/test")
    public String index(){
        String baseCustomer=customerService.getCustomerById("KH20200317KH4");
        System.out.println(baseCustomer);
        return "index";
    }


}
