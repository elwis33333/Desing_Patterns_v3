package main.java.visitor;

interface Element {
    float accept(MyVisitor visitor);
}
