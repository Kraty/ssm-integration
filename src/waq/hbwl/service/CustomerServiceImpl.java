package waq.hbwl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import waq.hbwl.dao.CustomerDao;
import waq.hbwl.po.Customer;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

    // 注解注入
    @Autowired
    private CustomerDao customerDao;

    public Customer findCustomerById(Integer id) {
        return customerDao.findCustomerById(id);
    }

}
