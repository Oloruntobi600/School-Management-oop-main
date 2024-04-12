package org.example;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person{
    public int schoolId;
    private int teacherId;
    private int studentId;

    public static List<Student> studentList = new ArrayList<>();
//    private List<StudentCourses> studentCourse;

//    public void adminEnrollStudents(StudentCourses studentCourses){
//        studentCourse.add(studentCourses);
//    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public Student(int id, String name, int age, String address,int studentId, int schoolId, int teacherId) {
        super(id, name, age, address);
        this.schoolId = schoolId;
        this.teacherId = teacherId;
        this.studentId = studentId;
    }




    public static void enrollStudentCourses(int studentId, int courseId, List<StudentCourses> studentCoursesList) {
        boolean isPresent = false;

        for (int i = 0; i < Course.SUBJECT_CODES.size(); i++) {

            if (Course.SUBJECT_CODES.get(i) == courseId) { // validation for adding course to Student
                isPresent = true;
            }
        }


            if (!isPresent) {
            System.out.println("sorry, course " + courseId + " not available in school");
            return;
        }
        for (int i = 0; i < studentList.size(); i++) {
            //adding course to student
//            if (studentList.get(i).getId() == studentId && studentList.get(i).getId()
//                    == courseId) {

                if (studentList.get(i).getStudentId() == studentId) {
                    studentList.get(i).setId(courseId);
                    System.out.println("List of student: " + studentId + " and courseId: " + courseId + " is available.");
                }
            }
        }


//    public Student(int id, String name){
//        super(id,name);
//    }
    public void printStudentLists(List<StudentCourses> studentCourses){
        for (int i = 0; i<studentCourses.size(); i++){
            System.out.println(studentCourses.get(i));
        }
    }
    public void showStudentDetails(Student student){
        System.out.println(student);

    }

    public static List<Student> getStudentList() {
        return studentList;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public static void setStudentList(List<Student> studentList) {
        Student.studentList = studentList;
    }
    //    public Student(int id, String name, int schoolId) {
//        super(id, name);
//        this.schoolId = schoolId;
//    }

    public int getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(int schoolId) {
        this.schoolId = schoolId;
    }


//    @Override
//    public String toString() {
//        return "Student{" +
//                "schoolId=" + schoolId +
//                ", teacherId=" + teacherId +
//                '}';
//    }
    //    public List<StudentCourses> getStudentCourse() {
//        return studentCourse;
//    }
//
//    public void setStudentCourse(List<StudentCourses> studentCourse) {
//        this.studentCourse = studentCourse;
//    }


    @Override
    public String toString() {
        return "Student{" +
                "schoolId=" + schoolId +
                ", teacherId=" + teacherId +
                '}';
    }
}
