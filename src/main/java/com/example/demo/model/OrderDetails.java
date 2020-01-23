//package com.example.demo.model;
//
//
//import javax.persistence.Entity;
//import javax.validation.constraints.NotBlank;
//import javax.validation.constraints.Size;
//
//@Entity
//public class OrderDetails {
//
//    private String orderId;
//    @NotBlank
//    @Size(max = 40)
//    private float cost;
//    private String[] items;
//    private String customerId;
//    @NotBlank
//    @Size(max = 40)
//    private String customerName;
//    @NotBlank
//    @Size(max = 40)
//    private String customerLocation;
//    @NotBlank
//    @Size(max = 40)
//    private String restaurantName;
//    @NotBlank
//    @Size(max = 40)
//    private String restaurantLocation;
//    private boolean status;
//
//    public String getCustomerName() {
//        return customerName;
//    }
//
//    public void setCustomerName(String customerName) {
//        this.customerName = customerName;
//    }
//
//    public String getCustomerLocation() {
//        return customerLocation;
//    }
//
//    public String setCustomerLocation(){
//        this.customerLocation=customerLocation;
//    }
//
//    public String getRestaurantName() {
//        return restaurantName;
//    }
//
//    public void setRestaurantName(String restaurantName) {
//        this.restaurantName = restaurantName;
//    }
//
//    public String getOrderId() {
//        return orderId;
//    }
//
//    public void setOrderId(String orderId) {
//        this.orderId = orderId;
//    }
//
//    public float getCost() {
//        return cost;
//    }
//
//    public void setCost(float cost) {
//        this.cost = cost;
//    }
//
//    public String[] getItems() {
//        return items;
//    }
//
//    public void setItems(String[] items) {
//        this.items = items;
//    }
//
//    public String getCustomerId() {
//        return customerId;
//    }
//
//    public void setCustomerId(String customerId) {
//        this.customerId = customerId;
//    }
//
//    public boolean isStatus() {
//        return status;
//    }
//
//    public void setStatus(boolean status) {
//        this.status = status;
//    }
//}
//
//
//
//
//
//
//
//
//
