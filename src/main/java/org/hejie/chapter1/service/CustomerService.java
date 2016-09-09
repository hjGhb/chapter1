package org.hejie.chapter1.service;

import org.hejie.chapter1.helper.DatabaseHelper;
import org.hejie.chapter1.model.Customer;
import org.hejie.chapter1.util.PropsUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * Created by admin on 2016/9/9.
 */
public class CustomerService {

    private static final Logger LOGGER= LoggerFactory.getLogger(CustomerService.class);


    /**
     * 获取全部客户列表
     * @return
     */
    public List<Customer> getCustomerList(){
        try{
            String sql = "select * FROM customer";
           return DatabaseHelper.queryEntityList(Customer.class,sql);
        }finally {
            DatabaseHelper.closeConnection();
        }
    }

    /**
     * 获取客户列表
     * @param keyWord
     * @return
     */
   public List<Customer> getCustomerList(String keyWord){


       //todo
       return null;
   }

    /**
     * 获取客户
     * @param id
     * @return
     */
    public Customer getCustomer(long id){
        return null;
    }

    /**
     * 创建客户
     * @param fieldMap
     * @return
     */
    public boolean createCustomer(Map<String,Object> fieldMap){
        return DatabaseHelper.insertEntity(Customer.class,fieldMap);
    }

    /**
     * 更新客户
     * @param id
     * @param fieldMap
     * @return
     */
    public boolean updateCustomer(long id,Map<String,Object> fieldMap){
        return DatabaseHelper.updateEntity(Customer.class,id,fieldMap);
    }


    /**
     * 删除客户
     * @param id
     * @return
     */
    public boolean deleteCustomer(long id) {
        return DatabaseHelper.deleteEntity(Customer.class, id);
    }


}

