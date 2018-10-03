package DesignPattern;

//Implementor
interface Attribute {
    String getAttributeType();
}

//Concrete Implementer
class Color implements Attribute {
    @Override
    public String getAttributeType() {
        return "Color";
    }
}

//Concrete Implementer
class Shape implements Attribute {
    @Override
    public String getAttributeType() {
        return "Shape";
    }
}

//Abstracion
abstract class NewShape {
    String type;
    Attribute attribute;

    public NewShape(String type, Attribute attribute) {
        this.type = type;
        this.attribute = attribute;
    }
}

//Refined Abstraction
class Square extends NewShape {
    String specification;

    public Square(String specification, Attribute attribute) {
        super("square", attribute);
        this.specification = specification;
    }

    @Override
    public String toString() {
        return "Square { " +
                "type = '" + type + '\'' +
                "attribute = " + attribute.getAttributeType() +
                ",specification = '" + specification + '\'' +
                '}';
    }
}

//Refined Abstraction
class Triangle extends NewShape {
    String specification;

    public Triangle(String specification, Attribute attribute) {
        super("triangle", attribute);
        this.specification = specification;
    }

    @Override
    public String toString() {
        return "Triangle { " +
                "type = '" + type + '\'' +
                "attribute = " + attribute.getAttributeType() +
                ",sides = '" + specification + '\'' +
                '}';
    }
}

public class Question5 {

    public static void main(String[] args) {
        Square blueSquare = new Square("Purple", new Color());
        Square redSquare = new Square("Blue", new Color());

        System.out.println(blueSquare);
        System.out.println(redSquare);

        Triangle redTriangle = new Triangle("Black", new Color());
        System.out.println(redTriangle);
    }
}
