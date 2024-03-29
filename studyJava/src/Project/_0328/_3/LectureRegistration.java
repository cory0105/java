package Project._0328._3;

public class LectureRegistration {
    String userId;
    int lectureId;
    Lecture lecture = new Lecture();
    User user = new User();

    public LectureRegistration() {
    }

    public LectureRegistration(String userId, int lectureId) {
        this.userId = userId;
        this.lectureId = lectureId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public int getLectureId() {
        return lectureId;
    }

    public void setLectureId(int lectureId) {
        this.lectureId = lectureId;
    }
}