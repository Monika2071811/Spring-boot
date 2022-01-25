package com.assessment.web.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Orrder {
	
	    @Id
	    private int orderId;
	    private int customerId;
	    private int productId;
		private String orderplacedDt;
		private String orderDispatchedDt;
		private String orderDeliveredDt;
		private String orderStatus;
		private String paymentsource;
		private String paymentstatus;
		
		
		public Orrder(int orderId, int customerId, int productId, String orderplacedDt, String orderDispatchedDt,
				String orderDeliveredDt, String orderStatus, String paymentsource, String paymentstatus) {
			super();
			this.orderId = orderId;
			this.customerId = customerId;
			this.productId = productId;
			this.orderplacedDt = orderplacedDt;
			this.orderDispatchedDt = orderDispatchedDt;
			this.orderDeliveredDt = orderDeliveredDt;
			this.orderStatus = orderStatus;
			this.paymentsource = paymentsource;
			this.paymentstatus = paymentstatus;
		}
		public Orrder() {
			super();
		}
		@Override
		public String toString() {
			return "Order [orderId=" + orderId + ", customerId=" + customerId + ", productId=" + productId
					+ ", orderplacedDt=" + orderplacedDt + ", orderDispatchedDt=" + orderDispatchedDt
					+ ", orderDeliveredDt=" + orderDeliveredDt + ", orderStatus=" + orderStatus + ", paymentsource="
					+ paymentsource + ", paymentstatus=" + paymentstatus + "]";
		}
		public int getOrderId() {
			return orderId;
		}
		public void setOrderId(int orderId) {
			this.orderId = orderId;
		}
		public int getCustomerId() {
			return customerId;
		}
		public void setCustomerId(int customerId) {
			this.customerId = customerId;
		}
		public int getProductId() {
			return productId;
		}
		public void setProductId(int productId) {
			this.productId = productId;
		}
		public String getOrderplacedDt() {
			return orderplacedDt;
		}
		public void setOrderplacedDt(String orderplacedDt) {
			this.orderplacedDt = orderplacedDt;
		}
		public String getOrderDispatchedDt() {
			return orderDispatchedDt;
		}
		public void setOrderDispatchedDt(String orderDispatchedDt) {
			this.orderDispatchedDt = orderDispatchedDt;
		}
		public String getOrderDeliveredDt() {
			return orderDeliveredDt;
		}
		public void setOrderDeliveredDt(String orderDeliveredDt) {
			this.orderDeliveredDt = orderDeliveredDt;
		}
		public String getOrderStatus() {
			return orderStatus;
		}
		public void setOrderStatus(String orderStatus) {
			this.orderStatus = orderStatus;
		}
		public String getPaymentsource() {
			return paymentsource;
		}
		public void setPaymentsource(String paymentsource) {
			this.paymentsource = paymentsource;
		}
		public String getPaymentstatus() {
			return paymentstatus;
		}
		public void setPaymentstatus(String paymentstatus) {
			this.paymentstatus = paymentstatus;
		}
		
		
		
		
		
}