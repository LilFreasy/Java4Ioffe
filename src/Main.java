import entity.Lecture;

public class Main {
    public static void main(String[] args) {
        Lecture lecture1 = new Lecture();
        Lecture lecture2 = new Lecture();
        Lecture lecture3 = new Lecture();
        Lecture lecture4 = new Lecture();
        Lecture lecture5 = new Lecture();
        Lecture lecture6 = new Lecture(6, "java6");
        int courseId = lecture6.courseId;
        String lectureName = lecture6.lectureName;
        System.out.println("Количество лекций: " + Lecture.count);
        System.out.println("Айди курса лекции = " + lecture6.courseId + " Название лекции: " + lecture6.lectureName);
    }



}


