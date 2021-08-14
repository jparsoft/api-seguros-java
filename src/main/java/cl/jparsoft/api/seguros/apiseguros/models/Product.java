package cl.jparsoft.api.seguros.apiseguros.models;

public class Product {
    private Long id;
    private String name;
    private Long price;
    private Long sellIn;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPrice() {
        return this.price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Long getSellIn() {
        return this.sellIn;
    }

    public void setSellIn(Long sellIn) {
        this.sellIn = sellIn;
    }

    @Override
    public String toString() {
        return "{" + " id='" + getId() + "'" + ", name='" + getName() + "'" + ", price='" + getPrice() + "'"
                + ", sellIn='" + getSellIn() + "'" + "}";
    }

}
