package pe.edu.idat.demo_ventas_idat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.idat.demo_ventas_idat.model.SupplierModel;

public interface SupplierRepository extends JpaRepository<SupplierModel, Integer> {

}