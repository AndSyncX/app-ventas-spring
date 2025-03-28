package pe.edu.idat.demo_ventas_idat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.idat.demo_ventas_idat.model.OrderDetailModel;
import pe.edu.idat.demo_ventas_idat.model.ProductOrderId;

// Son componentes -> Facilita que los frameworks se puedan comunicar de manera mas facil y eficiente
public interface OrderDetailRepository extends JpaRepository<OrderDetailModel, ProductOrderId> {

}
