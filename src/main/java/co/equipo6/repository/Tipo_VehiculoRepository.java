package co.equipo6.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.equipo6.models.entity.Tipo_Vehiculo;

@Repository
public interface Tipo_VehiculoRepository extends JpaRepository<Tipo_Vehiculo, Integer>{

}
