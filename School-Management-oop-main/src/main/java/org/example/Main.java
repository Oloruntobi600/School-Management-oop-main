package org.example;

import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //courses in our school

        //adding courses to teachers
        Teacher teacher1 = new Teacher(1, "Bimbo", 20, "mokola", 100);
        Teacher teacher2 = new Teacher(2, "Segun", 20, "mokola", 101);
        Teacher teacher3 = new Teacher(3, "Sayo", 20, "mokola", 102);
//        System.out.println(teacher1);
        Teacher.teacherList.add(teacher1);
        Teacher.teacherList.add(teacher2);
        Teacher.teacherList.add(teacher3);

        System.out.println("1.Testing course adding for teachers ");

        Teacher.addTeacherToCourse(1, 100, Teacher.teacherList);
        Teacher.addTeacherToCourse(2, 101, Teacher.teacherList);
        Teacher.addTeacherToCourse(3, 102, Teacher.teacherList);
        Teacher.printTeacherCoursesList();


        System.out.println("2.Testing course removal for teacher");
        //to remove course for teacher
        Teacher.removeTeacherFromCourse(3, 102, Teacher.teacherList);

        Teacher.printTeacherCoursesList();

        Student student1 = new Student(1, "Tobi", 28, "Ibadan",10, 001, 001);
        Student student2 = new Student(1, "Tolani", 30, "Lagos",11, 001, 001);
        Student student3 = new Student(1, "Tunde", 44, "Abeokuta",12, 001, 001);

        System.out.println("3. List of student in the school:\n" + student1 + "\n" + student2 + "\n" + student3);




//        System.out.println("My name is :" + student1);
        Course course1 = new Course(1,"Maths", 100, 200);
        Course course2 = new Course(2,"English", 101, 201);
        Course course3 = new Course(3,"Economics",  102, 202);
        List<Course> courseList = new ArrayList<>();
        courseList.add(course1);
        courseList.add(course2);
        courseList.add(course3);
        System.out.println("5. The list of courses available in the school with thier teachers:\n " + courseList);

        StudentCourses studentCourses = new StudentCourses();
        StudentCourses studentCourse1 = new StudentCourses( 001, 100, 0, 'F');
        StudentCourses studentCourse2 = new StudentCourses( 001, 101, 0, 'F' );
        StudentCourses studentCourse3 = new StudentCourses( 001, 102, 0, 'F' );

        StudentCourses studentCourse4 = new StudentCourses(002, 100, 0, 'F' );
        StudentCourses studentCourse5 = new StudentCourses(002, 101, 0, 'F' );
        StudentCourses studentCourse6 = new StudentCourses(002, 102, 0, 'F' );

        StudentCourses studentCourse7 = new StudentCourses( 003, 100, 0, 'F');
        StudentCourses studentCourse8 = new StudentCourses( 003, 101, 0, 'F');
        StudentCourses studentCourse9 = new StudentCourses( 003, 102, 0, 'F');

        List<StudentCourses> studentCourseList = new ArrayList<>();
        StudentCourses.studentList1.add(studentCourse1);
        StudentCourses.studentList1.add(studentCourse2);
        StudentCourses.studentList1.add(studentCourse3);
        StudentCourses.studentList1.add(studentCourse4);
        StudentCourses.studentList1.add(studentCourse5);
        StudentCourses.studentList1.add(studentCourse6);
        StudentCourses.studentList1.add(studentCourse7);
        StudentCourses.studentList1.add(studentCourse8);
        StudentCourses.studentList1.add(studentCourse9);

        //testing enrolling of students
        System.out.println("6. method to enroll students");
        studentCourses.enrollCourse(StudentCourses.studentList1);
        System.out.println(StudentCourses.enrolledStudentList);
        studentCourses.printStudentCoursesList(StudentCourses.enrolledStudentList);

//        Student.enrollStudentCourses(1, 100,studentCourseList );
//        Student.enrollStudentCourses(2, 101,studentCourseList );
//        Student.enrollStudentCourses(3, 102,studentCourseList );
//        System.out.println("6. Testing how to enroll studentId: " );
//        System.out.println(Student.getStudentList());

        //testing removing of courses for a known student because you need to pass-in the courseid and then studentid
        System.out.println("7. Testing removing of courses for a known student");
        studentCourses.removeCourse(1, 100, StudentCourses.enrolledStudentList);
        studentCourses.printStudentCoursesList(StudentCourses.enrolledStudentList);


//      grading of courses for a known student
        System.out.println("8. Grading of courses for a known student");
        studentCourses.gradeStudent(2, 102, 50, StudentCourses.enrolledStudentList);
        studentCourses.gradeStudent(3, 102, 80, StudentCourses.enrolledStudentList);
        studentCourses.printStudentCoursesList(StudentCourses.enrolledStudentList);



//        System.out.println(studentCourses);
//        System.out.println(studentCourseList);
    }
}