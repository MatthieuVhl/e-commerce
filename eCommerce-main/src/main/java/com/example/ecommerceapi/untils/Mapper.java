package com.example.ecommerceapi.untils;

import com.example.ecommerceapi.dto.*;
import com.example.ecommerceapi.entity.Card;
import com.example.ecommerceapi.entity.Client;
import com.example.ecommerceapi.entity.LineProduct;
import com.example.ecommerceapi.entity.Product;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class Mapper {

    //mapper CLient
    public ClientDtoResponse mapToDto(Client client) {

        ModelMapper mapper = new ModelMapper();
        ClientDtoResponse clientDtoResponse = mapper.map(client, ClientDtoResponse.class);

        return clientDtoResponse;

    }


    public Client mapToEntity(ClientDtoRequest clientDtoRequest) {

        ModelMapper mapper = new ModelMapper();
        Client client = mapper.map(clientDtoRequest, Client.class);

        return  client;


    }

    // mapper Card
    public CardDtoResponse mapToDto(Card card) {

        ModelMapper mapper = new ModelMapper();
        CardDtoResponse cardDtoResponse = mapper.map(card, CardDtoResponse.class);

        return cardDtoResponse;

    }


    public Card mapToEntity(CardDtoRequest cardDtoRequest) {

        ModelMapper mapper = new ModelMapper();
        Card card = mapper.map(cardDtoRequest, Card.class);

        return  card;


    }

    // mapper lineProduct
    public LineProductDtoResponse mapToDto(LineProduct lineProduct) {

        ModelMapper mapper = new ModelMapper();
        LineProductDtoResponse lineProductDtoResponse = mapper.map(lineProduct, LineProductDtoResponse.class);

        return lineProductDtoResponse;

    }


    public LineProduct mapToEntity(LineProductDtoRequest lineProductDtoRequest) {

        ModelMapper mapper = new ModelMapper();
        LineProduct lineProduct = mapper.map(lineProductDtoRequest, LineProduct.class);

        return  lineProduct;


    }

    // mapper product
    public ProductDtoResponse mapToDto(Product product) {

        ModelMapper mapper = new ModelMapper();
        ProductDtoResponse productDtoResponse = mapper.map(product, ProductDtoResponse.class);

        return productDtoResponse;

    }


    public Product mapToEntity(ProductDtoRequest productDtoRequest) {

        ModelMapper mapper = new ModelMapper();
        Product product = mapper.map(productDtoRequest, Product.class);

        return  product;


    }

}
