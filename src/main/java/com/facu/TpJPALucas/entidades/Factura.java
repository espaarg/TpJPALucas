package com.facu.TpJPALucas.entidades;

import com.facu.TpJPALucas.enums.FormaPago;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name ="Factura") //Se llama igual que la clase
public class Factura extends BaseEntidad{

    private int numero;
    private Date fecha;
    private double descuento;
    private FormaPago formaPago;
    private int total;



}
