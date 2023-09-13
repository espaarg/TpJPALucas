package com.facu.TpJPALucas.repositorios;

import com.facu.TpJPALucas.entidades.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends JpaRepository<Producto,Long> {

}
