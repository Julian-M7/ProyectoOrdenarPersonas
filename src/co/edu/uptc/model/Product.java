package co.edu.uptc.model;

public class Product {
    String description;
    Double price;
    String unit;


    public Product() {
    }

    public Product(String description, Double price, String unit) {
        this.description = description;
        this.price = price;
        this.unit = unit;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return this.price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getUnit() {
        return this.unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Product description(String description) {
        setDescription(description);
        return this;
    }

    public Product price(Double price) {
        setPrice(price);
        return this;
    }

    public Product unit(String unit) {
        setUnit(unit);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " description='" + getDescription() + "'" +
            ", price='" + getPrice() + "'" +
            ", unit='" + getUnit() + "'" +
            "}";
    }

}   
