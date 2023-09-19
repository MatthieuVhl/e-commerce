package com.example.ecommerceapi.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CardDtoRequest {
    private Integer idUser;
    private  Integer idCard;
    private Integer idProduct;

}
