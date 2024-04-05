package Test._0404.Registration;

import Test._0404.Data.Lecture;
import Test._0404.Data.User;

import java.util.ArrayList;
import java.util.List;

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

    @Override
    public String toString() {
        return "[" + this.userId + ", " + this.lectureId + "]";
    }
}