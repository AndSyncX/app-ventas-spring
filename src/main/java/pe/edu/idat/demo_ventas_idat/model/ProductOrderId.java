package pe.edu.idat.demo_ventas_idat.model;
import jakarta.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class ProductOrderId implements Serializable {
    private Integer productid;
    private Integer orderid;

    public Integer getProductid() {
        return productid;
    }

    public void setProductid(Integer productid) {
        this.productid = productid;
    }

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }
}
