package org.hejie.chapter1.test;

import org.hejie.chapter1.helper.DatabaseHelper;
import org.hejie.chapter1.model.Customer;
import org.hejie.chapter1.service.CustomerService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by admin on 2016/9/9.
 * CustomerService单元测试
 */
public class CustomerServiceTest {

    private final CustomerService customerService;

    public CustomerServiceTest(){
        customerService = new CustomerService();
    }

    @Before
    public void init() throws IOException{
        DatabaseHelper.executeSqlFile("sql/customer_init.sql");
    }

    @Test
   public void getCustomerListTest() throws Exception{
       List<Customer> customerList = customerService.getCustomerList("");
       Assert.assertEquals(2,customerList.size());
   }


    @Test
    public void getCustomerTest() throws Exception{
        long id = 1;
        Customer customer = customerService.getCustomer(id);
        Assert.assertNotNull(customer);
    }

    @Test
    public void createCustomerTest(){
        Map<String,Object> fieldMap = new HashMap<String,Object>();
        fieldMap.put("name","customer100");
        fieldMap.put("contact","John");
        fieldMap.put("telephone","1354646464");
        boolean result = customerService.createCustomer(fieldMap);
        Assert.assertTrue(result);
    }

    @Test
    public void updateCustomerTest(){
        long id = 1;
        Map<String,Object> fieldMap = new HashMap<String, Object>();
        fieldMap.put("contact","Eric");
        boolean result = customerService.updateCustomer(id, fieldMap);
        Assert.assertTrue(result);
    }


    @Test
    public void deleteCustomerDeleteTest(){
        long id = 1;
        boolean result = customerService.deleteCustomer(id);
        Assert.assertTrue(result);
    }
}
