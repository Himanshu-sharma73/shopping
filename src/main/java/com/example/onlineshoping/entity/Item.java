package com.example.onlineshoping.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    private Product product;

    @ManyToOne
    private Cart cart;

    private int quantity;
    public Item(Product product,Cart cart,int quantity){
        this.product=product;
        this.cart=cart;
        this.quantity=quantity;
    }
}
