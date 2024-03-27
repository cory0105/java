package Study.ExceptionHandling;

public class TryCatchFinally {
    public static void main(String[] args) {
        try {
            System.out.println("a");
//            System.out.println(3/0);
//            int a = Integer.parseInt("20A");
            int[] arr = {1,2,3,4,5};
            arr[5]=6; // ArrayIndexOutOfBoundsException 발생
            System.out.println("프로그램 종료");
        }
        catch (ArithmeticException e){
            System.out.println("숫자는 0으로 나눌 수 없습니다.");
            System.out.println("프로그램 종료");
        } catch (NumberFormatException e){
            System.out.println("숫자로 변환할 수 없습니다.");
        } catch (NullPointerException e){
            System.out.println("Null 관리하기");
        } catch (Exception e){
            System.out.println("예기치 못한 에러로 인하여 프로그램을 종료합니다.");
        }

        try {
            System.out.println(3/0);
        } catch (ArithmeticException e){
            System.out.println("숫자는 0으로 나눌 수 없습니다.");
        } finally {
            System.out.println("프로그램 종료");
        }
    }
}
