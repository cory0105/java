package Project._0328._1;

public class Lecture{
    String lectureName;
    int playTime;
    int lectureNum;

    public Lecture() {
    }

    public Lecture(String lectureName, int playTime, int lectureNum) {
        this.lectureName = lectureName;
        this.playTime = playTime;
        this.lectureNum = lectureNum;
    }

    public String getLectureName() {
        return lectureName;
    }

    public int getPlayTime() {
        return playTime;
    }

    public int getLectureNum() {
        return lectureNum;
    }

    public void setLectureName(String lectureName) {
        this.lectureName = lectureName;
    }

    public void setPlayTime(int playTime) {
        this.playTime = playTime;
    }

    public void setLectureNum(int lectureNum) {
        this.lectureNum = lectureNum;
    }
}
