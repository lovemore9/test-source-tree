package com.coderman.common.model.business;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * εεεΊε­
 */
@Data
@Table(name = "biz_product_stock")
public class ProductStock {
    @Id
    private Long id;

    private String pNum;

    private Long stock;

}
