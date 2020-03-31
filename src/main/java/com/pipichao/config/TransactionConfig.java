package com.pipichao.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * 事务配置文件
 * */

//@Configuration
@EnableTransactionManagement
//开启事务注解驱动 相当于在xml配置文件中使用：tx:annotation-driven标签
public class TransactionConfig {
}
