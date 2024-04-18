package org.example;

import java.util.ArrayList;
import java.util.List;

public class Teacher {
    public int id;
    private String name;
    private int age;
    private String address;
    public Teacher(int id, String name, int age, String address, int courseCode) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.courseCode = courseCode;
    }
    public Teacher(){

    }

    private int courseCode;
    public static List<Teacher> teacherList = new ArrayList<>();

    //we are assuming that a teacher only takes a course
    public static void addTeacherToCourse(int teacherId, int courseCode,  List<Teacher> teacherList){
        boolean isPresent = false;

        for (int i = 0; i < Course.SUBJECT_CODES.size() ; i++) {
            if (Course.SUBJECT_CODES.get(i) == courseCode) { // validation for adding course to teacher
                isPresent = true;
            }
        }

        if (!isPresent){
            System.out.println("sorry, course "+courseCode+ " not available in school");
            return;
        }

        for (int i = 0; i< teacherList.size(); i++){ //adding course to teacher
            if ( teacherList.get(i).getId()==teacherId) {
                teacherList.get(i).setCourseCode(courseCode);
            }
        }
    }

    public static void removeTeacherFromCourse(int teacherId, int courseCode,  List<Teacher> teacherList){
        for (int i = 0; i< teacherList.size(); i++){
            if ( teacherList.get(i).getId()==teacherId ) {
                teacherList.remove(i).setCourseCode(courseCode);
//                teacherList.get(i).setCourseCode(courseCode);
            }
        }
    }

    public static void printTeacherCoursesList() {
        for (Teacher teacher : Teacher.teacherList) {
            System.out.println(teacher);
        }
    }

    public void showTeacherDetails(Teacher teacher) {
        System.out.println(teacher);
    }

    public int getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(int courseCode) {
        this.courseCode = courseCode;
    }

    public List<Teacher> getTeachers() {
        return teacherList;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teacherList = teachers;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", courseCode=" + courseCode +
                '}';
    }
}
