package com.cathaybk.project.answer.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cathaybk.project.answer.dto.CustomerRequest;
import com.cathaybk.project.answer.dto.CustomerResponse;
import com.cathaybk.project.answer.dto.PrHeader;
import com.cathaybk.project.answer.dto.RequestTemplate;
import com.cathaybk.project.answer.dto.ResponseTemplate;
import com.cathaybk.project.answer.entity.CustomerEntity;
import com.cathaybk.project.answer.exception.DataNotFoundException;
import com.cathaybk.project.answer.exception.ErrorInputException;
import com.cathaybk.project.answer.repository.CustomerRepository;
import com.cathaybk.project.answer.service.CustomerService;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
@Transactional(rollbackFor = Exception.class)
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    /**
     * 查詢顧客
     */
    @Override
    public ResponseTemplate<CustomerResponse> queryCustomer(RequestTemplate<CustomerRequest> req) throws DataNotFoundException {

        // 查詢
        CustomerRequest customerRequest = req.getTranrq();
        Optional<CustomerEntity> optional = customerRepository.findById(customerRequest.getCustomerID());
        if (!optional.isPresent()) {
            throw new DataNotFoundException();
        }
        

        // 組回傳資料格式
        PrHeader prHeaderResponse = new PrHeader();
        ResponseTemplate<CustomerResponse> resp = new ResponseTemplate<>(prHeaderResponse);
        CustomerResponse customerResponse = new CustomerResponse();
        CustomerResponse.Data customerInnerData = new CustomerResponse.Data();

        CustomerEntity customerEntity = optional.get();

//        ObjectMapper
        customerInnerData.setCustomerID(customerEntity.getCustomerID());
        customerInnerData.setName(customerEntity.getName());
        customerInnerData.setId(customerEntity.getID());
        customerInnerData.setBirthDay(customerEntity.getBirthDay());
        customerInnerData.setSex(customerEntity.getSex());

        List<CustomerResponse.Data> list = new ArrayList<>();
        list.add(customerInnerData);
        customerResponse.setDatas(list);

        resp.setMessage("success");
        resp.setTranrs(customerResponse);

        return resp;
    }

    /**
     * 新增顧客
     * @throws ErrorInputException 
     */
    @Override
    public ResponseTemplate<CustomerResponse> insertCustomer(RequestTemplate<CustomerRequest> req) throws ErrorInputException {
        CustomerRequest customerRequest = req.getTranrq();
        CustomerEntity customerEntity = new CustomerEntity();

        if (customerRequest.getCustomerID() == null) {
            throw new ErrorInputException();
        }

        customerEntity.setCustomerID(customerRequest.getCustomerID());
        customerEntity.setName(customerRequest.getName());
        customerEntity.setBirthDay(customerRequest.getBirthDay());
        customerEntity.setID(customerRequest.getID());
        customerEntity.setSex(customerRequest.getSex());

        customerRepository.save(customerEntity);

        PrHeader prHeaderResponse = new PrHeader();
        ResponseTemplate<CustomerResponse> resp = new ResponseTemplate<>(prHeaderResponse);
        resp.setMessage("success");

        return resp;
    }

    /**
     * 更新顧客
     */
    @Override
    public ResponseTemplate<CustomerResponse> updateCustomer(RequestTemplate<CustomerRequest> req) {
        CustomerRequest customerRequest = req.getTranrq();
        CustomerEntity customerEntity = new CustomerEntity();

        customerEntity.setCustomerID(customerRequest.getCustomerID());
        customerEntity.setName(customerRequest.getName());
        customerEntity.setBirthDay(customerRequest.getBirthDay());
        customerEntity.setID(customerRequest.getID());
        customerEntity.setSex(customerRequest.getSex());

        customerRepository.save(customerEntity);

        PrHeader prHeaderResponse = new PrHeader();
        ResponseTemplate<CustomerResponse> resp = new ResponseTemplate<>(prHeaderResponse);
        resp.setMessage("success");

        return resp;
    }

}
