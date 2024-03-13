package Test.StudyClass;

public class C {
    int a = 10;
    static int b = 20;
    private int c = 30;
    private static int d = 40;

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public static int getD() {
        return d;
    }

    public static void setD(int d) {
        C.d = d;
    }
}
