package com.cathaybk.project.answer.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cathaybk.project.answer.dto.CustomerRequest;
import com.cathaybk.project.answer.dto.CustomerResponse;
import com.cathaybk.project.answer.dto.RequestTemplate;
import com.cathaybk.project.answer.dto.ResponseTemplate;
import com.cathaybk.project.answer.exception.DataNotFoundException;
import com.cathaybk.project.answer.exception.ErrorInputException;
import com.cathaybk.project.answer.service.CustomerService;

@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    /**
     * 查詢
     * 
     * @return
     * @throws ErrorInputException
     * @throws DataNotFoundException 
     */
    @RequestMapping(value = "/customer", method = RequestMethod.GET)
    public ResponseTemplate<CustomerResponse> queryCustomer(@Valid @RequestBody RequestTemplate<CustomerRequest> req, Errors errs)
            throws ErrorInputException, DataNotFoundException {

        if (errs.hasErrors()) {
            throw new ErrorInputException();
        }

        return customerService.queryCustomer(req);
    }

    /**
     * 新增
     * 
     * @param CustomerRequest
     */
    @RequestMapping(value = "/customer", method = RequestMethod.POST)
    public ResponseTemplate<CustomerResponse> insertCustomer(@Valid @RequestBody RequestTemplate<CustomerRequest> req, Errors errs)
            throws ErrorInputException {
        if (errs.hasErrors()) {
            throw new ErrorInputException();
        }

        return customerService.insertCustomer(req);
    }

    /**
     * 更新顧客
     * @param req
     * @param errs
     * @throws ErrorInputException
     */
    @RequestMapping(value = "/customer", method = RequestMethod.PUT)
    public ResponseTemplate<CustomerResponse> updateCustomer(@Valid @RequestBody RequestTemplate<CustomerRequest> req, Errors errs)
            throws ErrorInputException {
        if (errs.hasErrors()) {
            throw new ErrorInputException();
        }

        return customerService.updateCustomer(req);
    }
}
