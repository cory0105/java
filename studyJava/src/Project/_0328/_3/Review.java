package Project._0328._3;

import java.util.ArrayList;

public class Review {
    int reviewId;
    int rating;
    String text;
    String loginId;
    int lectureId;
    public Review() {
    }
    public Review(int reviewId, int rating, String text, String loginId, int lectureId) {
        this.reviewId = reviewId;
        this.rating = rating;
        this.text = text;
        this.loginId = loginId;
        this.lectureId = lectureId;
    }


// 리뷰평 없어도 됨
// 생성객체는 ArrayList 로 관리
// 아래의 경우 메서드가 false 를 리턴
//  - 점수는 1~10 사이
//  - 유저가 하나의 강의에 한 번 리뷰 남김
//  - 수강하지 않는 과목에 리뷰할 수 없음
    // 예) createReview("hero11",1,10,"좋은 강의"); // 객체 생성하고 true 리턴
    //     createReview("hero11",1,10,"좋은 강의"); // false 리턴
    // 예) createReview("hero11",1,100,"좋은 강의"); // 점수 에러이므로 false 리턴
    // 예) createReview("tommy",3,100,"좋은 강의"); // tommy 는 3번을 수강 안하므로 false 리턴
    static ArrayList<Review> reviews = new ArrayList<>(); // Arraylist 관리
    public boolean createReview(String loginId, int lectureId, int rating, String text){
        // 점수는 1~10 사이
        if (rating<1 || rating>10){
            System.out.println("리뷰의 평점은 1~10의 값을 가져야 합니다.");
            return false;
        }

        // 유저가 하나의 강의에 한 번 리뷰 남김
        for (int i=0; i<reviews.size(); i++){
            if (reviews.get(i).lectureId == lectureId && reviews.get(i).loginId.equals(loginId)){
                System.out.println("이미 리뷰를 등록한 강의입니다.");
                return false;
            }
        }

        // 수강하지 않는 과목에 리뷰할 수 없음
        boolean a = true;
        for (int i=0; i<InfoCreate.lectureRegistrations.size(); i++){
            if (loginId.equals(InfoCreate.lectureRegistrations.get(i).userId) && lectureId==InfoCreate.lectureRegistrations.get(i).lectureId){
                a = false;
            }
        }
        if (a){
            System.out.println("수강하지 않은 과목이므로 리뷰를 작성하실 수 없습니다.");
            return false;
        }
        reviews.add(new Review(reviews.size(),rating,text,loginId,lectureId)); // Arraylist 관리
        return true;
    }

    public boolean createReview(String loginId, int lectureId, int rating){
        String text = "";
        if (rating<1 || rating>10){
            System.out.println("리뷰의 평점은 1~10의 값을 가져야 합니다.");
            return false;
        }

        for (int i=0; i<reviews.size(); i++){
            if (reviews.get(i).lectureId == lectureId && reviews.get(i).loginId.equals(loginId)){
                System.out.println("이미 리뷰를 등록한 강의입니다.");
                return false;
            }
        }

        int a = 0;
        for (int i=0; i<InfoCreate.lectureRegistrations.size(); i++){
            if (loginId.equals(InfoCreate.lectureRegistrations.get(i).userId) && lectureId==InfoCreate.lectureRegistrations.get(i).lectureId){
                a++;
            }
        }
        if (a!=1){
            System.out.println("수강하지 않은 과목이므로 리뷰를 작성하실 수 없습니다.");
            return false;
        }
        reviews.add(new Review(reviews.size(),rating,text,loginId,lectureId)); // Arraylist 관리
        return true;
    }

    @Override
    public String toString() {
        return "reviewId:" + reviewId + ", rating:" + rating +  ", text:" + text + ", loginId:" + loginId + ", lectureId:" + lectureId + "\n";
    }
}
