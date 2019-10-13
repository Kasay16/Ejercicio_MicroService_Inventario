package co.edu.unilibre.inventariorepository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.unilibre.inventario.entity.Inventario;

public interface IInventaryRepository extends JpaRepository<Inventario, Long>{

}
