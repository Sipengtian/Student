package org.example;
import org.example.Student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the number of students:" + "\n");
        int studentnumber= scanner.nextInt();
        scanner.nextLine();
        Student []information=new Student[studentnumber];

        for(int i=0;i<studentnumber;i++) {
            System.out.println("Enter your studentID:" + "\n");
            String studentID = scanner.nextLine();

            System.out.println("Enter your studentName:" + "\n");
            String studentName = scanner.nextLine();
            System.out.println("Enter your Activitynumbeer:" + "\n");
            int Activitynumber = scanner.nextInt();
            scanner.nextLine();
            Student details = new Student(studentName, studentID, Activitynumber);
            details.addextraActivities();
            information[i]=details;
        }

        for(int a=0;a<information.length;a++){
          System.out.println(information[a]);
        }








    }
}
