package service;

import entity.Course;
import java.util.Scanner;
import java.util.ArrayList;
public class CourseUtil {

        private static int courseCounter = 0;
        private ArrayList<Course> courses;

        public CourseUtil() {
            this.courses = new ArrayList<>();
        }

        public int createCourse(String name) {
            Course course = new Course(name);
            courses.add(course);
            return course.getId();
        }

        public void listCourses() {
            System.out.println("List of courses:");
            for (Course course : courses) {
                System.out.println(course.getName() + " (ID: " + course.getId() + ")");
            }
        }

        public void chooseCategory() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Choose a category:\n1. Courses\n2. Teachers\n3. Students\n4. Lectures");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    listCourses();
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        }

    public void setUpConsole() {
        final Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the type of chose, please use only numbers from 0 to 3");
        System.out.println("Please input 1 if you want to crete a car");
        System.out.println("Please input 2 if you want to see person name");
        System.out.println("Please input 3 if you want to see person id");
        System.out.println("Please input 0 if you to stop");

        final int type = scanner.nextInt();


        switch (type){
            case 1:
                Course course = new Course("0");
                System.out.println("1 Input course name");
                Scanner scanner1 = new Scanner(System.in);
                final String name = scanner1.nextLine();
                course.setName(name);
                System.out.println("2 Input course type");
                Scanner scanner2 = new Scanner(System.in);
                final String types = scanner2.nextLine();
                course.setType(types);
                System.out.println(course);
                break;
            case 2:
                Course course1 = new Course("1");
                course1.setName("Java");
                System.out.println(course1.getName());
                break;
            case 3:
                Course course2 = new Course("2");
                course2.setId(1);
                System.out.println(course2.getId());
                break;
            case 0:
                System.exit(0);
                break;
            default:
                System.out.println("Incorrect symbol");
        }

    }


    }



