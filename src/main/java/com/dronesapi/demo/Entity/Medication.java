/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dronesapi.demo.Entity;

import jakarta.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import org.springframework.data.annotation.Id;

@Entity
public class Medication {
   @Id
    private String code;
   @NotEmpty
   private String name;
   @NotEmpty
   private int weight;
   private String image;
   
   
}
