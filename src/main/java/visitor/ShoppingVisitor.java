package main.java.visitor;

class ShoppingVisitor implements MyVisitor {
    private float tax = 1.23f;

    public float visit(Book book) {
        return book.getPrice() * tax;
    }

    public float visit(DiscDVD discDVD) {
        discDVD.setInPromotion(false);
        return discDVD.getPrice() * tax;
    }

    public float visit(Perfume perfume) {
        return perfume.getPrice() * tax;
    }

}
