package main.java.visitor;

class Book implements Element {

    private String title;
    private float price;
    private float weight;
    private float tax;

    public Book(String title, float price, float weight, float tax) {
        this.title = title;
        this.price = price;
        this.weight = weight;
        this.tax = tax;
    }

    public float accept(MyVisitor visitor) {
        return visitor.visit(this);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getTax() {
        return tax;
    }
}
