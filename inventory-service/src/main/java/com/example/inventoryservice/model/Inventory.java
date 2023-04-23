package com.example.inventoryservice.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity
@Table(name="t_inventory")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Inventory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    private String skuCode;
    private Integer quantity;
}
