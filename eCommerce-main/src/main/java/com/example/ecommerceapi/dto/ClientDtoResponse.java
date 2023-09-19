package com.example.ecommerceapi.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ClientDtoResponse {
    Integer idCLient;

    String lastName;
    String firstName;
    String email;
    String password;
}
