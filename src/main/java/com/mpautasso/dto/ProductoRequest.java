package com.mpautasso.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ProductoRequest {
    private String nombre;
    private Double costo;
}
