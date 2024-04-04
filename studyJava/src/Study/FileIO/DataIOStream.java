package Study.FileIO;

import java.io.*;

public class DataIOStream {
    public static void main(String[] args) throws IOException {
        File dataFile = new File(FileObject.CURRENT + "/fileData.data");

        if (!dataFile.exists()){
            dataFile.createNewFile();
        }
        InputStream is = new FileInputStream(dataFile);
        OutputStream os = new FileOutputStream(dataFile);

        // 기존의 IOStream 은 바이트 단위로만 읽고 쓸 수 있는 반면
        // DataStream 은 여러 원시자료형의 형태에 맞춰 읽고 쓸 수 있음
        DataInputStream dis = new DataInputStream(is);
        DataOutputStream dos = new DataOutputStream(os);

        // 쓰기
        dos.writeInt(35);
        dos.writeDouble(5.8);
        dos.writeChar('A');
        dos.writeUTF("안녕하세요.");
        dos.flush();
        dos.close();

        // 읽기
        int a = dis.readInt();
        double b = dis.readDouble();
        char c = dis.readChar();
        String d = dis.readUTF();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        os.close();
        dos.close();
        is.close();
        dis.close();
    }
}
