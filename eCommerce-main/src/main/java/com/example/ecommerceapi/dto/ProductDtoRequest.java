package com.example.ecommerceapi.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductDtoRequest {
    private Integer idUser;
    private  Integer idCard;
    private  Integer idProduct;
    private String name;
    private String Type;
}
