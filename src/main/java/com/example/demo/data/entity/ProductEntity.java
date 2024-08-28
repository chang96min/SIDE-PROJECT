package com.example.demo.data.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "PRODUCT")
public class ProductEntity {
    @Id
    @Column(name = "PRODUCT_ID")
    String productId;

    @Column(name = "PRODUCT_NAME")
    String productName;

    @Column(name = "PRODUCT_PRICE")
    Integer productPrice;

    @Column(name = "PRODUCT_STOCK")
    Integer productStock;
}
