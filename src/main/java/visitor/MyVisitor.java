package main.java.visitor;

interface MyVisitor {

    float visit(Book book);

    float visit(DiscDVD discDVD);

    float visit(Perfume perfume);

}
