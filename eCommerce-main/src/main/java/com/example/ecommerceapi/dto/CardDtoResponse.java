package com.example.ecommerceapi.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CardDtoResponse {
    private  Integer idCard;
    private Integer idProduct;
    private Integer idUser;
}
