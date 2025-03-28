package pe.edu.idat.demo_ventas_idat.model;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "orderdetails")
public class OrderDetailModel {
    @EmbeddedId
    private ProductOrderId id;
    private Double unitprice;
    private Integer quantity;
    private Double discount;

    public ProductOrderId getId() {
        return id;
    }

    public void setId(ProductOrderId id) {
        this.id = id;
    }

    public Double getUnitprice() {
        return unitprice;
    }

    public void setUnitprice(Double unitprice) {
        this.unitprice = unitprice;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }
}