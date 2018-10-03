package exercise.second;

class Missing {

}


public class Question3Part1 {

    public static void main(String[] args) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        Missing m = new Missing();

    }

}
