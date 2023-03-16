package entity;

public class Lecture {
    public static int count;
    public Lecture() {
        count++;}

    public int id;
    public String name;

    public int courseId;
    public String lectureName;

    public Lecture(int courseId, String lectureName) {
        this.courseId = courseId;
        this.lectureName = lectureName;
    }

    public String getCourseName() {
        return lectureName;
    }

    public void setCourseName(String CourseName) {
        this.lectureName = CourseName;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setId(int courseId) {
        this.courseId = courseId;
    }


}
