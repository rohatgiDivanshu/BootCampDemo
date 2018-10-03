package bootcamp.demo;

public class Question9 {

    houseType type;
    Double price;
    String location;


    Question9(Double price, String location) {

        this.price = price;
        this.location = location;

    }

    public static void main(String[] args) {

        Question9 house1 = new Question9(3000.89, "Chandigarh");
        house1.type = houseType.SMALL;
        Question9 house2 = new Question9(40000.78, "Goa");
        house2.type = houseType.BIG;
        Question9 house3 = new Question9(5000000.7, "Malaysia");
        house3.type = houseType.HUGE;

        System.out.println("Price of house is " + house1.getPrice());
        System.out.println("Type of house is " + house1.type);
        System.out.println("Price of house is " + house2.getPrice());
        System.out.println("Type of house is " + house2.type);
        System.out.println("Price of house is " + house3.getPrice());
        System.out.println("Type of house is " + house3.type);

    }

    Double getPrice() {
        return this.price;
    }

    enum houseType {SMALL, BIG, HUGE}

}
