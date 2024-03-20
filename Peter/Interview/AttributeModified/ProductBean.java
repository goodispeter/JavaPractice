package Peter.Interview.AttributeModified;

import java.util.Objects;

public class ProductBean {
    private Integer id;
    private String product;
    private Integer price;

    public ProductBean() {
    }

    public ProductBean(Integer id, String product, Integer price) {
        this.id = id;
        this.product = product;
        this.price = price;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProduct() {
        return this.product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public Integer getPrice() {
        return this.price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public ProductBean id(Integer id) {
        setId(id);
        return this;
    }

    public ProductBean product(String product) {
        setProduct(product);
        return this;
    }

    public ProductBean price(Integer price) {
        setPrice(price);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof ProductBean)) {
            return false;
        }
        ProductBean productBean = (ProductBean) o;
        return Objects.equals(id, productBean.id) && Objects.equals(product, productBean.product)
                && Objects.equals(price, productBean.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, product, price);
    }

    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", product='" + getProduct() + "'" +
                ", price='" + getPrice() + "'" +
                "}";
    }

}
