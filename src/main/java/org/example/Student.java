package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Student {
    private String studentID;


    private String studentName;

    private String[] extraActivities;
    public Student(String studentName,String studentID,int extraActivitiesLength){
        this.extraActivities= new String[extraActivitiesLength];
        this.studentID=studentID;
        this.studentName=studentName;
    }
    public String[] getExtraActivities() {
        return extraActivities;
    }
    public void addextraActivities(){
        for(int i=0;i< extraActivities.length;i++){
            Scanner scanner =new Scanner(System.in);
             extraActivities[i]= scanner.nextLine();
        }


    }
    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }    public String toString() {
        return "org.example.Student{" +
                "studentID='" + studentID + '\''+"\n" +
                ", studentName='" + studentName + '\''+"\n" +
                ", extraActivities=" + Arrays.toString(extraActivities) +
                '}';
    }


}
