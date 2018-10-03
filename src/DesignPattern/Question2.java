package DesignPattern;

interface Polygon {
    void getpolygon();
}

class triangle implements Polygon {
    @Override
    public void getpolygon() {
        System.out.println("Triangle having 3 sides");
    }
}

class quadilateral implements Polygon {
    @Override
    public void getpolygon() {
        System.out.println("Quadilateral having 4 sides");
    }
}

class pentagon implements Polygon {

    @Override
    public void getpolygon() {
        System.out.println("Pentagon Having 5 sides");
    }
}

class sides {
    Polygon polygon;

    public Polygon getSides() {
        return polygon;
    }

    public void setSides(Polygon polygon) {
        this.polygon = polygon;
    }
}

class PolygonFactory {
    static sides getPolygonObject(String s) {
        sides side = new sides();
        switch (s) {
            case "Three Sides":
                side.setSides(new triangle());
                break;
            case "Four Sides":
                side.setSides(new quadilateral());
                break;
            case "Five Sides":
                side.setSides(new pentagon());
                break;
        }
        return side;
    }
}


public class Question2 {
    public static void main(String[] args) {

        sides threeside = PolygonFactory.getPolygonObject("Three Sides");
        threeside.getSides().getpolygon();
        sides fourside = PolygonFactory.getPolygonObject("Four Sides");
        fourside.getSides().getpolygon();
        sides fiveside = PolygonFactory.getPolygonObject("Five Sides");
        fiveside.getSides().getpolygon();
    }
}
