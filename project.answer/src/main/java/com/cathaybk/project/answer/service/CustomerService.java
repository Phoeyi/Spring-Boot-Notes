package com.cathaybk.project.answer.service;

import com.cathaybk.project.answer.dto.CustomerRequest;
import com.cathaybk.project.answer.dto.CustomerResponse;
import com.cathaybk.project.answer.dto.RequestTemplate;
import com.cathaybk.project.answer.dto.ResponseTemplate;
import com.cathaybk.project.answer.exception.DataNotFoundException;
import com.cathaybk.project.answer.exception.ErrorInputException;

public interface CustomerService {

    /**
     * 查詢顧客
     * @return
     */
    ResponseTemplate<CustomerResponse> queryCustomer(RequestTemplate<CustomerRequest> req) throws DataNotFoundException;

    /**
     * 新增顧客
     */
    ResponseTemplate<CustomerResponse> insertCustomer(RequestTemplate<CustomerRequest> req) throws ErrorInputException;

    /**
     * 修改顧客
     */
    ResponseTemplate<CustomerResponse> updateCustomer(RequestTemplate<CustomerRequest> req) throws ErrorInputException;
}
