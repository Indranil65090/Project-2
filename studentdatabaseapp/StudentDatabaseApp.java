package studentdatabaseapp;
import java.util.Scanner;

public class StudentDatabaseApp {
    public static void main(String[] args){


        //Ask how many users we need to add
        System.out.print("Enter the number of students to enroll:");
        Scanner sc=new Scanner(System.in);
        int noOfStudents=sc.nextInt();
        System.out.println();
        Student[] students=new Student[noOfStudents];

        //Create n number of new students
        for (int i=0;i<noOfStudents;i++){
            students[i]=new Student();
            students[i].enroll();
            students[i].payTution();
            System.out.println("\nDetails of Student "+(i+1)+" is :\n"+students[i].showInfo()+"\n");
        }
    }
}
