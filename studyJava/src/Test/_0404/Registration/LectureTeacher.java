package Test._0404.Registration;

public class LectureTeacher {
    String teacherId;
    int LectureId;

    public LectureTeacher() {
    }

    public LectureTeacher(String teacherId, int lectureId) {
        this.teacherId = teacherId;
        LectureId = lectureId;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public int getLectureId() {
        return LectureId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public void setLectureId(int lectureId) {
        LectureId = lectureId;
    }
}
