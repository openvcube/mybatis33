package com.openv.mybatis.example.vo;

import java.util.List;

public class StoreVO {
  private int id;
  private List<CustomerVO> customers;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public List<CustomerVO> getCustomers() {
	return customers;
}

public void setCustomers(List<CustomerVO> customers) {
	this.customers = customers;
}
  
  
}
