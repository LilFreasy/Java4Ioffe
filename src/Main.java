import entity.Lecture;
import service.CourseUtil;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Lecture lecture1 = new Lecture();
        Lecture lecture2 = new Lecture();
        Lecture lecture3 = new Lecture();
        Lecture lecture4 = new Lecture();
        Lecture lecture5 = new Lecture();
        Lecture lecture6 = new Lecture();
        System.out.println("Количество лекций: " + Lecture.count);
        CourseUtil courseUtil = new CourseUtil();
        Main.setUpMenu();
        courseUtil.setUpConsole();
        Lecture lecture4 = new Lecture();
        Lecture lecture5 = new Lecture();
        Lecture lecture6 = new Lecture(6, "java6");
        int courseId = lecture6.courseId;
        String lectureName = lecture6.lectureName;
        System.out.println("Количество лекций: " + Lecture.count);
        System.out.println("Айди курса лекции = " + lecture6.courseId + " Название лекции: " + lecture6.lectureName);
    }


    }

    private static void setUpMenu() {
        Scanner scanner = new Scanner(System.in);
        int lk = 0;
        do {
            System.out.println("\nChoose an option:");
            System.out.println("1. Create a new lecture");
            System.out.println("2. Exit");
            lk = scanner.nextInt();
        } while (lk < 1 || lk > 2);
        Scanner scanner1 = new Scanner(System.in);
        int choice = scanner1.nextInt();
        if (choice == 1) {
            scanner.nextLine(); //
            System.out.print("Enter the lecture name: ");
            String lectureName = scanner.nextLine();
            Lecture newLecture = new Lecture();
            newLecture.name = lectureName;
        }



    }
}