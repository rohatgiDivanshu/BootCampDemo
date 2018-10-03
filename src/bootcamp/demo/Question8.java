package bootcamp.demo;

public class Question8 {

    public static void main(String[] args) {


        StringBuffer stringBuffer = new StringBuffer("TTN Bootcamp");

        System.out.println("Input String :" + stringBuffer);
        StringBuffer reverseStr = stringBuffer.reverse();
        System.out.println("Reverse of String : " + reverseStr);

        String subString = reverseStr.substring(4, 10);

        StringBuffer deletedString = reverseStr.delete(4, 10);

        System.out.println("Substring of String: " + subString);
        System.out.println("String after deleting substring : " + deletedString);


    }
}
