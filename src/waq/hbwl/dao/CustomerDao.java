package waq.hbwl.dao;

/*
 * customer接口文件
 * */

import waq.hbwl.po.Customer;

public interface CustomerDao {

    // 根据id查询客户信息
    Customer findCustomerById(Integer id);

}
