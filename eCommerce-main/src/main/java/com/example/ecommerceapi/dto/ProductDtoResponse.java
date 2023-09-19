package com.example.ecommerceapi.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductDtoResponse {
    private Integer idUser;
    private  Integer idCard;
    Integer idProduct;
    String name;
    String Type;
}
