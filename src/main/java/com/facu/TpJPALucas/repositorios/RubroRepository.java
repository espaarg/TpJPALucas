package com.facu.TpJPALucas.repositorios;

import com.facu.TpJPALucas.entidades.Rubro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RubroRepository extends JpaRepository<Rubro,Long> {

}
