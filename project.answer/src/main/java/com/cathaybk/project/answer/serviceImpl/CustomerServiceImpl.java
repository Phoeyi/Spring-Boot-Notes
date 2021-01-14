package com.cathaybk.project.answer.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.cathaybk.project.answer.dto.CustomerRequest;
import com.cathaybk.project.answer.dto.CustomerResponse;
import com.cathaybk.project.answer.entity.CustomerEntity;
import com.cathaybk.project.answer.exception.DataNotFoundException;
import com.cathaybk.project.answer.repository.CustomerRepository;
import com.cathaybk.project.answer.service.CustomerService;

public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	/**
	 * 查詢顧客
	 */
	@Override
	public CustomerResponse queryCustomer(CustomerRequest customerRequest) throws DataNotFoundException{

		// 查詢
		Optional<CustomerEntity> optional = customerRepository.findById(customerRequest.getCustomerID());
		if(optional == null || optional.isEmpty()) {
			throw new DataNotFoundException();
		}
		
		// 組回傳資料格式
		CustomerResponse customerResponse = new CustomerResponse();
		CustomerResponse.Data customerInnerData = new CustomerResponse.Data();
		
		CustomerEntity customerEntity = optional.get();
		
		customerInnerData.setCustomerID(customerEntity.getCustomerID());
		customerInnerData.setName(customerEntity.getName());
		customerInnerData.setID(customerEntity.getID());
		customerInnerData.setBirthDay(customerEntity.getBirthDay());
		customerInnerData.setSex(customerEntity.getSex());
		
		List<CustomerResponse.Data> list = new ArrayList<>();
		list.add(customerInnerData);
		customerResponse.setDatas(list);
		
		customerResponse.setMessage("success");
		
		return customerResponse;
	}

	/**
	 * 新增顧客
	 */
	@Override
	public void insertCustomer() {
		// TODO Auto-generated method stub

	}

	/**
	 * 更新顧客
	 */
	@Override
	public void updateCustomer() {
		// TODO Auto-generated method stub

	}

}
