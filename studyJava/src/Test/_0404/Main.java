package Test._0404;

import Test._0404.Methods.Work;
import Test._0404.Service.FreeBoard;
import Test._0404.Service.Reply;
import Test._0404.Service.Review;

public class Main {
    public static void main(String[] args) {


        Work work = new Work();
        System.out.println(work.lectureIdFindLoginId(1));
        System.out.println(work.loginIdFindTitle("nice"));
        System.out.println(work.titleFindEmail1("Java"));
        System.out.println(work.titleFindEmail2("Java"));
        System.out.println(work.loginIdFindCategory("nice"));
        System.out.println();


        // 생성객체는 ArrayList 로 관리
        // 1. 리뷰평 없어도 됨
        // 아래의 경우 메서드가 false 를 리턴
        //  - 2. 점수는 1~10 사이
        //  - 3. 유저가 하나의 강의에 한 번 리뷰 남김
        //  - 4. 수강하지 않는 과목에 리뷰할 수 없음
            // 예) createReview("hero11",1,10,"좋은 강의"); // 객체 생성하고 true 리턴
            //     createReview("hero11",1,10,"좋은 강의"); // false 리턴
            // 예) createReview("hero11",1,100,"좋은 강의"); // 점수 에러이므로 false 리턴
            // 예) createReview("tommy",3,100,"좋은 강의"); // tommy 는 3번을 수강 안하므로 false 리턴

        Review review = new Review();
        if (review.createReview("hero11",1,10)){ // 1번 해결:리뷰평 없어도 됨(hero11은 1을 수강함)
            System.out.println("리뷰가 정상적으로 작성되었습니다.");
        }

        if (review.createReview("hero11",1,10,"ㅎㅎ")){ // 3번 해결:유저가 하나의 강의에 한 번 리뷰 남김(hero11은 1을 수강함)
            System.out.println("리뷰가 정상적으로 작성되었습니다.");
        }

        if (review.createReview("sue",1,100,"좋은 강의")){ //2번 해결:점수는 1~10 사이 (sue는 1을 수강함)
            System.out.println("리뷰가 정상적으로 작성되었습니다.");
        }

        if (review.createReview("sue",3,10,"좋은 강의")){ //4번 해결:수강하지 않는 과목에 리뷰할 수 없음(sue는 1을 수강함)
            System.out.println("리뷰가 정상적으로 작성되었습니다.");
        }

        if (review.createReview("sue",1,10,"좋은 강의")){ //sue는 1을 수강함(정상 작동)
            System.out.println("리뷰가 정상적으로 작성되었습니다.");
        }

        System.out.println(review.reviews.toString());
        System.out.println();

        System.out.println(work.getTeacherByLectureId(1));
        System.out.println(work.getLectureTitleListByTeacherId("t1"));
        System.out.println();

        FreeBoard freeBoard = new FreeBoard();
        Reply reply = new Reply();

        freeBoard.createFreeBoard("안녕","sue입니다","sue");
        freeBoard.createFreeBoard("안녕","tommy입니다","tommy");
        freeBoard.createFreeBoard("안녕","nice입니다","nice");
        freeBoard.createFreeBoard("다시옴","sue입니다","sue");
        reply.createReply("저는 tommy입니다.","tommy",0);
        reply.createReply("저는 nice입니다.","nice",0);
        reply.createReply("tommy 다시옴","tommy",3);

        System.out.println(FreeBoard.freeBoards.toString());
        System.out.println();
    }
}
