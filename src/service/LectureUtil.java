package service;

import entity.Course;
import entity.Lecture;
import java.util.Scanner;

public class LectureUtil {
    public static int count;
    void CreateStudentUtil()
    {
        Lecture lecture = new Lecture();
        Lecture lecture1 = new Lecture();

    }



    public static int createLecture(Course course, String lectureName) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter course ID:");
        int courseId = scanner.nextInt();
        System.out.println("Enter lecture name:");
        lectureName = scanner.next();
        course = null;
        Course[] courses = new Course[0];
        for (Course c : courses) {
            if (c.getId() == courseId) {
                course = c;
                break;
            }
        }
        if (course == null) {
            System.out.println("Course not found.");
            return courseId;
        }
        LectureUtil lectureUtil = new LectureUtil();
        int lectureId = LectureUtil.createLecture(course, lectureName);
        System.out.println("New lecture created with ID: " + lectureId);
        return courseId;
    }




}


