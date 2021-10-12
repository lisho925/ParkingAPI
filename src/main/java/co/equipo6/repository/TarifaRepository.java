package co.equipo6.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.equipo6.models.entity.Tarifa;

@Repository
public interface TarifaRepository extends JpaRepository<Tarifa, Integer>{

}
