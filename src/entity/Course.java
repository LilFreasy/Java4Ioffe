package entity;

import java.util.ArrayList;

public class Course {
    public int createCourse(String name) {
        Course course = new Course(name);
        course.add(course);
        return course.getId();
    }

    private void add(Course course) {
    }

    private static int courseCounter = 0;
        public int id;
        public String name;
        private ArrayList<Teacher> teachers;
        private ArrayList<Student> students;
        private ArrayList<Lecture> lectures;

        public Course(String name) {
            courseCounter++;
            this.id = courseCounter;
            this.name = name;
            this.teachers = new ArrayList<>();
            this.students = new ArrayList<>();
            this.lectures = new ArrayList<>();
        }

        public int getId() {
            return id;
        }

        public String getName(){
          return name;
        }

    public void setName(String name) {
    }

    public void setType(String types) {
    }

    public void setId(int i) {
    }
}

