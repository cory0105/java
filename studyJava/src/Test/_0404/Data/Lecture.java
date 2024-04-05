package Test._0404.Data;


public class Lecture {
    int lectureId;
    String title;
    int duration;
    Category category;
    Difficulty difficulty;

    public Lecture() {
    }

    public Lecture(int lectureId, String title, int duration, Category category, Difficulty difficulty) {
        this.lectureId = lectureId;
        this.title = title;
        this.duration = duration;
        this.category = category;
        this.difficulty = difficulty;
    }

    public int getLectureId() {
        return lectureId;
    }

    public void setLectureId(int lectureId) {
        this.lectureId = lectureId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Difficulty getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(Difficulty difficulty) {
        this.difficulty = difficulty;
    }

    @Override
    public String toString() {
        return lectureId + " / " + title + " / " + category
                + " / " + difficulty + " / " + duration + "분";
    }
}