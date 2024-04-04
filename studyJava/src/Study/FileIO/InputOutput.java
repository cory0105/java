package Study.FileIO;

import java.io.*;
import java.nio.charset.Charset;

public class InputOutput {
    public static void main(String[] args) throws IOException {
        File file = new File(FileObject.CURRENT + "/fileIo.txt");
        if (!file.exists()){
            file.createNewFile();
        }

        // 쓰기
        OutputStream os = new FileOutputStream(file,false);
//        byte[] bytes = "Hello World. Let's study spring framework.".getBytes();
        byte[] bytes = "안녕하세요.".getBytes(Charset.forName("UTF-8"));
        os.write(bytes);
        os.flush();
        os.close();

        // 읽기
        InputStream is = new FileInputStream(file);
        byte[] buffer = new byte[1000];
        int data;
        String str = "";
        while ((data = is.read(buffer))==-1){
            str = str + new String(buffer, 0, data, Charset.forName("UTF-8"));
        }
        System.out.println(str);
        is.close();
    }
}
