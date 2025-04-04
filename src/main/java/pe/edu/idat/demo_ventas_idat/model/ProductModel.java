package pe.edu.idat.demo_ventas_idat.model;
import jakarta.persistence.*;

@Entity(name = "products")
public class ProductModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer productid;
    private String productname;
    private String quantityperunit;
    private Double unitprice;
    private Integer unitsinstock;
    private Integer unitsonorder;
    private Integer reorderlevel;
    private Boolean discontinued;
    @ManyToOne
    @JoinColumn(name = "categoryid")
    private CategoryModel category;
    @ManyToOne
    @JoinColumn(name = "supplierid")
    private SupplierModel supplier;

    public Integer getProductid() {
        return productid;
    }

    public void setProductid(Integer productid) {
        this.productid = productid;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public String getQuantityperunit() {
        return quantityperunit;
    }

    public void setQuantityperunit(String quantityperunit) {
        this.quantityperunit = quantityperunit;
    }

    public Double getUnitprice() {
        return unitprice;
    }

    public void setUnitprice(Double unitprice) {
        this.unitprice = unitprice;
    }

    public Integer getUnitsinstock() {
        return unitsinstock;
    }

    public void setUnitsinstock(Integer unitsinstock) {
        this.unitsinstock = unitsinstock;
    }

    public Integer getUnitsonorder() {
        return unitsonorder;
    }

    public void setUnitsonorder(Integer unitsonorder) {
        this.unitsonorder = unitsonorder;
    }

    public Integer getReorderlevel() {
        return reorderlevel;
    }

    public void setReorderlevel(Integer reorderlevel) {
        this.reorderlevel = reorderlevel;
    }

    public Boolean getDiscontinued() {
        return discontinued;
    }

    public void setDiscontinued(Boolean discontinued) {
        this.discontinued = discontinued;
    }

    public CategoryModel getCategory() {
        return category;
    }

    public void setCategory(CategoryModel category) {
        this.category = category;
    }

    public SupplierModel getSupplier() {
        return supplier;
    }

    public void setSupplier(SupplierModel supplier) {
        this.supplier = supplier;
    }
}
