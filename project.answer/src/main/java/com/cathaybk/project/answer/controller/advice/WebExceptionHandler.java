package com.cathaybk.project.answer.controller.advice;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cathaybk.project.answer.dto.PrHeader;
import com.cathaybk.project.answer.dto.ResponseTemplate;
import com.cathaybk.project.answer.exception.DataNotFoundException;
import com.cathaybk.project.answer.exception.ErrorInputException;

@ControllerAdvice
@SuppressWarnings({"rawtypes", "unchecked"})
public class WebExceptionHandler<S> {

    /**
     * ErrorInputException
     * @return
     */
    @ResponseBody
    @ExceptionHandler(ErrorInputException.class)
    public ResponseTemplate<S> handleErrorInputException() {

        ResponseTemplate resp = new ResponseTemplate<>(new PrHeader());
        resp.setMessage("ErrorInputException");

        return resp;
    }

    /**
     * DataNotFoundException
     * @return
     */
    @ResponseBody
    @ExceptionHandler(DataNotFoundException.class)
    public ResponseTemplate<S> handleDataNotFoundException() {

        ResponseTemplate resp = new ResponseTemplate<>(new PrHeader());
        resp.setMessage("DataNotFoundException");

        return resp;
    }
}
