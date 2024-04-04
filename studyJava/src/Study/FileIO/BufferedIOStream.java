package Study.FileIO;

import java.io.*;

public class BufferedIOStream {
    public static void main(String[] args) throws IOException {
        File orgFile = new File(FileObject.CURRENT + "/mycat_origin.jpg");
        File copyFile = new File(FileObject.CURRENT + "/Mycat_copy1.jpg");

        if (!copyFile.exists()){
            copyFile.createNewFile();
        }

        InputStream is = new FileInputStream(orgFile);
        OutputStream os = new FileOutputStream(copyFile);

        // 기존의 방법은 1 바이트씩 쓰고 읽기 때문에 속도가 느림
        // 1 바이트마다 read/write 하지 않고 버퍼에 모았다가 한번에 하면 속도를 높일수 있음
        // BufferedInputStream과 BufferedOutputStream 을 같이 사용함
        BufferedInputStream bis = new BufferedInputStream(is);
        BufferedOutputStream bos = new BufferedOutputStream(os);

        int data;
        // BufferedStream을 사용하려면 is, os 대신 bis, bos를 사용한다.
        while ((data=bis.read())!=-1){
            bos.write(data);
        }

        is.close();
        os.flush();
        os.close();
    }
}
