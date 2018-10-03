package File_IO;

import java.io.File;
import java.io.IOException;

public class FileDemo {

    public static void main(String[] args) {

        File file = new File("/home/divyanshu/Documents/user.csv");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

/*

    BufferedOutputStream bufferedOutputStream;

    {
        try {
            bufferedOutputStream = new BufferedOutputStream(
                        new FileOutputStream("/tmp/abc/def/ss.csv"));

//            bufferedOutputStream.write("refh");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
*/


}
