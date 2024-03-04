public class for_20240304 {
    public static void main(String[] args) {
        //for 반복문의 기본형
        for(int i=0; i<10; i++){
            System.out.println(i);
        }

        System.out.println();

        /* 무한루프(조건식이 false가 될 수 있는지 여부를 반드시 확인!!)
        for(int i=0; i>=0; i++){
            System.out.println(i);
        }*/

        /* 소수만 출력하는 무한루프
        for(int i=0; i>=0; i++){
            int sum=0;
            for(int j=2; j<=i; j++){
                if(i%j==0){
                    sum=sum+1;
                }
            }
            if(sum==1){
                System.out.println(i);
            }
        }*/

        {
            int a;
            for(a=0; a<3; a++){
                System.out.print(a+" ");
            }
            System.out.println();

            for(int i=0; i<3; i++){
                System.out.print(i+" ");
            }
            System.out.println();

            for(int i=0; i<100; i++){
                System.out.print(i+" ");
            }
            System.out.println();

            for(int i=10; i>0; i--){
                System.out.print(i+" ");
            }
            System.out.println();

            for(int i=0; i<10; i+=2){
                System.out.print(i+" ");
            }
            System.out.println();

            for(int i=0, j=0; i<10; i++, j++){
                System.out.print(i+j+" ");
            }
            System.out.println();

            /*for(int i=0; ; i++){
                System.out.print(i+" ");
            }
            for(;;){
                System.out.println("무한 루프");
            }
            */
            System.out.println();

            for(int i=0; ; i++){
                if(i>10){
                    break;
                }
                System.out.print(i+" ");
            }
            System.out.println("무한 루프 탈출");
        }
        //while문
        {
            int count=0; //초기식
            while(count<5){ //조건식
                System.out.print(count+" ");
                count++; //증감식
            }
            System.out.println();
            // 의도적인 무한루프에서 while문은 자주 쓰임
            /*while(true){
                // 유저가 버튼 클릭할때까지 대기
                // if(esc버튼 클릭)
                // break;
            }*/
        }
        //do while문
        {
            int cnt=0; //초기식
            do{
                System.out.print(cnt+" ");
                cnt++;
            }while (cnt<5);
            System.out.println();
            // 아래 while문과 비교하면, 반복문의 조건이 처음부터 false인 경우,
            // do~while문은 실행코드가 1회 실행되는 반면, while문은 실행되지 않음!!
        }
        System.out.println();
        //이중루프, 이중반복문
        for(int i=0; i<3; i++){
            for(int j=0; j<5; j++){
                System.out.println("[i="+i+", j="+j+"]");
            }
        }
    }
}
