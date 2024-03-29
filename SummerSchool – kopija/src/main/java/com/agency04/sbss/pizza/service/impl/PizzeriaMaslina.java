package com.agency04.sbss.pizza.service.impl;

import com.agency04.sbss.pizza.model.Pizza;
import com.agency04.sbss.pizza.service.PizzeriaService;
import org.springframework.beans.factory.annotation.Value;

public class PizzeriaMaslina implements PizzeriaService {

    @Value("${name}")
    private String name;

    @Value("${address}")
    private String address;

    public PizzeriaMaslina() {

    }

    public PizzeriaMaslina(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    @Value("${phoneNumber}")
    private String phoneNumber;

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String makePizza(Pizza pizza) {
        return pizza.getName() + "<br> Ingredients: " + pizza.getIngredients();
    }
}