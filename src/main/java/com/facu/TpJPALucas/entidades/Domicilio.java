package com.facu.TpJPALucas.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name ="Domicilio") //Se llama igual que la clase
public class Domicilio extends BaseEntidad{

    private String calle;
    private String numero;
    private String localidad;

}
