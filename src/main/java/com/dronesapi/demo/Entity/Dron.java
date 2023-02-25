/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dronesapi.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.springframework.data.annotation.Id;

@Entity
public class Dron {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int number_serie;
    
    @NotNull
    @NotBlank
    @NotEmpty
    private String modelo;
    @NotNull
    @NotBlank
    @NotEmpty
    
    private int weight_limit;
    @NotNull
    @NotBlank
    @NotEmpty
    private int battery_capacity;
    @NotNull
    @NotBlank
    @NotEmpty
    private String state;

    public Dron(String modelo, int weight_limit, int battery_capacity, String state) {
        this.modelo = modelo;
        this.weight_limit = weight_limit;
        this.battery_capacity = battery_capacity;
        this.state = state;
    }

    public Dron() {
    }

    public int getNumber_serie() {
        return number_serie;
    }

    public void setNumber_serie(int number_serie) {
        this.number_serie = number_serie;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getWeight_limit() {
        return weight_limit;
    }

    public void setWeight_limit(int weight_limit) {
        this.weight_limit = weight_limit;
    }

    public int getBattery_capacity() {
        return battery_capacity;
    }

    public void setBattery_capacity(int battery_capacity) {
        this.battery_capacity = battery_capacity;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    
    
}
