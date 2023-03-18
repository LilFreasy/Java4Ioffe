import entity.Lecture;
import service.CourseUtil;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Lecture lecture1 = new Lecture();
        Lecture lecture2 = new Lecture();
        Lecture lecture3 = new Lecture();

        System.out.println("Количество лекций: " + Lecture.count);
    }

    Lecture lecture4 = new Lecture();


    Lecture lecture3 = new Lecture();
    Lecture lecture5 = new Lecture();

    CourseUtil courseUtil = new CourseUtil();


     courseUtil.setUpConsole();
    Scanner scanner = new Scanner(System.in);
    int lk = 0;
do{
        System.out.println("\nChoose an option:");
        System.out.println("1. Create a new lecture");
        System.out.println("2. Exit");
lk = scanner.nextInt();



    }
     while (true)
        Scanner scanner = new Scanner(System.in);


        int choice = scanner.nextInt();

        if (choice == 1) {
            scanner.nextLine(); //

            System.out.print("Enter the lecture name: ");
            String lectureName = scanner.nextLine();
            Lecture newLecture = new Lecture();


        }
    }








