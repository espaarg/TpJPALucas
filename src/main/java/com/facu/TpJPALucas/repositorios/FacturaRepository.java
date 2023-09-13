package com.facu.TpJPALucas.repositorios;

import com.facu.TpJPALucas.entidades.Factura;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FacturaRepository extends JpaRepository<Factura,Long> {

}
