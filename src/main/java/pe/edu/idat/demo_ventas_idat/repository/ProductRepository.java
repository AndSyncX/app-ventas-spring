package pe.edu.idat.demo_ventas_idat.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pe.edu.idat.demo_ventas_idat.model.ProductModel;

public interface ProductRepository extends JpaRepository<ProductModel, Integer> {
    @Query(value = """
            UPDATE products SET
            productname = :productname,
            suppleirid = :suppleirid:
            categoryid = :categoryid:
            discontinued = :discontinued
            WHERE productid = :productid
            """, nativeQuery = true)
    void actualizarProductoParcial(
            @Param("productname") String productname,
            @Param("suppleirid") Integer suppleirid,
            @Param("categoryid") Integer categoryid,
            @Param("discontinued") boolean discontinued,
            @Param("productid") Integer productid
    );
}