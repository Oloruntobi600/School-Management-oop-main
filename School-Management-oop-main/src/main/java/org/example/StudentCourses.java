package org.example;

import java.util.ArrayList;
import java.util.List;

public class StudentCourses {
    public static List<StudentCourses> studentList1 = new ArrayList<>() ;
    public static List<StudentCourses> enrolledStudentList  = new ArrayList<>() ;
    public int id;
    private int studentId;
    private int courseCode;
    private int score;
    private char grade;

    private int teacherId;

    public StudentCourses( int studentId, int courseCode, int score, char grade) {
        this.id = id;
        this.studentId = studentId;
        this.courseCode = courseCode;
        this.score = 0;
        this.grade = 'F';
    }
    public StudentCourses(){

    }
//    validating if course is present in school
    public boolean isStudentCoursePresentInSchool(List<StudentCourses>studentCourses){
        boolean isValid = false;
        for (int i = 0; i <studentCourses.size() ; i++) {
            for (int j = 0; j < Course.SUBJECT_CODES.size(); j++) {
                if (studentCourses.get(i).courseCode == Course.SUBJECT_CODES.get(j) ){
                    isValid = true;

                }
                if (!isValid) {
                    return false;
                }
            }
        }
        return isValid;
    }
    public void enrollCourse ( List<StudentCourses> studentCourses){
        if (!isStudentCoursePresentInSchool(studentCourses)){
            System.out.println("student courseList not valid ");
            return;
        }
//       for( int i=0; i<studentCoursesList.size(); i++){
           enrolledStudentList.addAll(studentCourses);

    }

    // method to display information of students and courses
    public void printStudentCoursesList(List<StudentCourses> studentCoursesList) {
        // Print each item of the studentCoursesList on a new line
        // enhanced for loop
//        System.out.println("Adding courses for students ");
        for (StudentCourses studentCourse : studentCoursesList) {
            System.out.println(studentCourse);
        }
        if(studentCoursesList.size() == 0){
//            System.out.println("Failed to add courses. ");
            return;
        } else {
            System.out.println("courses successfully added for students. ");
        }

    }
    public void removeCourse (int studentId, int courseId, List<StudentCourses> studentCoursesList){
        for (int i=0; i<studentCoursesList.size(); i++){
          if (studentCoursesList.get(i).courseCode == courseId && studentCoursesList.get(i).studentId ==studentId) {
              studentCoursesList.remove(studentCoursesList.get(i));
          }
        }
    }
        public void gradeStudent (int studentId, int courseId, int score, List<StudentCourses> studentCoursesList){
            for (int i = 0; i < studentCoursesList.size(); i++) {
                if (studentCoursesList.get(i).studentId == studentId && studentCoursesList.get(i).courseCode == courseId) { //selection of the student and his course
                    studentCoursesList.get(i).score = score;   //actual scoring of the student
                    studentCoursesList.get(i).grade = calculatorGrade(score); //Actual grading of the student
                }
            }
        }

    public static char calculatorGrade(int score){
        if (score >=90 && score <=100){
            return 'A';
        }
        else if (score >=80 && score <=89){
            return 'B';
        }
        else if (score >=70 && score <=79){
            return 'C';
        }
        else if (score >=60 && score <=69){
            return 'D';
        }
        else if (score >= 0 && score <=59){
            return 'F';
        }
        return 'z';
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(int courseCode) {
        this.courseCode = courseCode;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "StudentCourses{" +
                "id=" + id +
                ", studentId=" + studentId +
                ", courseId=" + courseCode +
                ", score=" + score +
                ", grade=" + grade +
                '}';
    }
}
