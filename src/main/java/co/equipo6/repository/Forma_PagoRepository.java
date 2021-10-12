package co.equipo6.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.equipo6.models.entity.Forma_Pago;

@Repository
public interface Forma_PagoRepository extends JpaRepository<Forma_Pago, Integer>{

}
