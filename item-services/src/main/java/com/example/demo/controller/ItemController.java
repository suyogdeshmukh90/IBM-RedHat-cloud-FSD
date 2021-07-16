package com.example.demo.controller;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.Exception.ItemNotFoundException;
import com.example.demo.dto.ItemDto;
import com.example.demo.model.OrderEntity;
import com.example.demo.service.ItemService;
import com.example.demo.ui.ItemRequestModel;
import com.example.demo.ui.ItemResponseModel;

@RestController

public class ItemController {
	private ItemService itemService;
	private RestTemplate restTemplate;
	private ModelMapper modelMapper;
	private Environment environment;
	
	@Autowired
	public ItemController(ItemService itemService, RestTemplate restTemplate, ModelMapper modelMapper,
			Environment environment) {
		
		this.itemService = itemService;
		this.restTemplate = restTemplate;
		this.modelMapper = modelMapper;
		this.environment = environment;
	}

	@GetMapping
	public ResponseEntity<String> getStatus()
	{
		return ResponseEntity.ok("Application Running on port no."+environment.getProperty("local.server.port"));
	}
	
	@PostMapping("/items")
	public ResponseEntity<ItemResponseModel> createItem(@RequestBody() ItemRequestModel itemDetails)
	{
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		ItemDto dto=modelMapper.map(itemDetails, ItemDto.class);
		ItemResponseModel model=itemService.createItem(dto);
		return ResponseEntity.status(HttpStatus.CREATED).body(model);
	}
	@GetMapping("/items")
	public ResponseEntity<List<ItemResponseModel>> getAllItems()
	{
		return ResponseEntity.status(HttpStatus.OK).body(itemService.getAllItems());
	}
	
	@GetMapping("/items/find/{itemName}")
	public ResponseEntity<List<ItemResponseModel>> getByItemname(@PathVariable("itemName") String itemName)
	{
		return ResponseEntity.ok(itemService.findByItemName(itemName));
	}
	@GetMapping("/items/{itemNumber}")
	public ResponseEntity<ItemResponseModel> getByItemNumber(@PathVariable("itemNumber") String itemNumber)
	{
		return ResponseEntity.ok(itemService.findByItemNumber(itemNumber));
	}
	
	@PutMapping("/items/{itemNumber}")
	public ResponseEntity<ItemResponseModel> updateItem(@PathVariable("itemNumber") String itemNumber,@RequestBody() ItemRequestModel itemDetails)
	{
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		ItemDto dto=modelMapper.map(itemDetails, ItemDto.class);
		ItemResponseModel model=itemService.updateItem(itemNumber,dto);
		return ResponseEntity.status(HttpStatus.OK).body(model);
	}
	
	@DeleteMapping("/items/{itemNumber}")
	public ResponseEntity<String> deleteItem(@PathVariable("itemNumber") String itemNumber)
	{
		return ResponseEntity.ok(itemService.deleteItem(itemNumber));
	}
	
	@GetMapping("/items/orders")
	public ResponseEntity<List<OrderEntity>> getOrdersfromOrderEntity(){
		String uri="http://localhost:8088/order-service/orders";
		@SuppressWarnings("unchecked")
		List<OrderEntity> orders=restTemplate.getForObject(uri, List.class);
		return ResponseEntity.ok(orders);
	}
	@GetMapping("/items/orders/{orderid}")
	public ResponseEntity <OrderEntity> getOrdersByOrderId(@PathVariable("orderid") String orderid) throws ItemNotFoundException{
		String uri="http://localhost:8088/order-service/orders/"+orderid;
		@SuppressWarnings("unchecked")
		OrderEntity orders=restTemplate.getForObject(uri, OrderEntity.class);
		
		return ResponseEntity.ok(orders);
	}
}
