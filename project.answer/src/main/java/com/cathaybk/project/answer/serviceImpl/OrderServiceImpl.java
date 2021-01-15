package com.cathaybk.project.answer.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.cathaybk.project.answer.dto.OrderRequest;
import com.cathaybk.project.answer.dto.OrderResponse;
import com.cathaybk.project.answer.entity.CustomerEntity;
import com.cathaybk.project.answer.entity.OrderEntity;
import com.cathaybk.project.answer.exception.DataNotFoundException;
import com.cathaybk.project.answer.exception.ErrorInputException;
import com.cathaybk.project.answer.repository.OrderRepository;
import com.cathaybk.project.answer.service.OrderService;

public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderRepository orderRepository;

	/**
	 * 查詢訂單
	 * 
	 * @throws DataNotFoundException
	 */
	@Override
	public OrderResponse queryOrder(OrderRequest orderRequest) throws DataNotFoundException {
		// 查詢
		Optional<OrderEntity> optional = orderRepository.findById(orderRequest.getOrderNo());
		if (optional == null || optional.isEmpty()) {
			throw new DataNotFoundException();
		}

		// 組回傳資料格式
		OrderResponse orderResponse = new OrderResponse();
		OrderResponse.Data orderInnerData = new OrderResponse.Data();

		OrderEntity orderEntity = optional.get();

		orderInnerData.setOrderNo(orderEntity.getOrderNo());
		orderInnerData.setCustomerID(orderEntity.getCustomerID());
		orderInnerData.setMoney(orderEntity.getMoney());
		orderInnerData.setEmpID(orderEntity.getEmpID());
		orderInnerData.setOrderDate(orderEntity.getOrderDate());
		orderInnerData.setArrivalDate(orderEntity.getArrivalDate());

		List<OrderResponse.Data> list = new ArrayList<>();
		list.add(orderInnerData);
		orderResponse.setDatas(list);

		orderResponse.setMessage("success");

		return orderResponse;
	}

	/**
	 * 新增訂單
	 */
	@Override
	public void insertOrder(OrderRequest orderRequest) throws ErrorInputException {

	}

}
