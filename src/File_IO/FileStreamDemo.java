package File_IO;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreamDemo {

    public static void main(String[] args) throws IOException {

        File file = new File("/tmp/user/abc/user.java");
        file.mkdirs();
        file.createNewFile();

        FileOutputStream fileOutputStream = new FileOutputStream("/tmp/user/abc/user.java");
        fileOutputStream.write("Divanshu".getBytes());
        fileOutputStream.flush();
        fileOutputStream.close();

    }
}
