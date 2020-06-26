package studentdatabaseapp;
import java.util.Scanner;

public class Student {

    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses="";
    private int tuitionBalance;
    private static int costOfCourses=600;
    private static int id=1000;

    //Constructor:Prompt user to enter student's name and year
    public Student(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter student first name:");
        this.firstName=sc.nextLine();

        System.out.print("Enter student last name:");
        this.lastName=sc.nextLine();

        System.out.print("1 - Freshman\n2 - Sophnore\n3 - Junior\n4 - Senior\nEnter student class level:");
        this.gradeYear=sc.nextInt();

        setstudentId();
        System.out.println(firstName+" "+lastName+" "+gradeYear+" "+studentID);
    }

    //Generate an ID
    private void setstudentId(){
        //ID+ Grade level
        id++;
        this.studentID = gradeYear+""+id;
    }

    //Enroll in courses
    public void enroll(){
        //Get inside the loop,user hits 0
        do {
            System.out.print("Enter course to enroll(Q to quit):");
            Scanner sc = new Scanner(System.in);
            String course = sc.nextLine();
            if (!course.equals("Q")) {
                courses = courses + "\n " + course;
                tuitionBalance = tuitionBalance + costOfCourses;
            } else {
                break;
            }
        }while(1!=0);

        System.out.println("ENROLLED IN:"+courses);
    }

    //View balance
    public void viewBalance(){
        System.out.println("Your balance is:$"+tuitionBalance);
    }

    //Pay tuition
    public void payTution(){
        viewBalance();
        System.out.print("Enter your payment:$");
        Scanner sc=new Scanner(System.in);
        int payment=sc.nextInt();
        tuitionBalance=tuitionBalance-payment;
        System.out.println("Thank you for your payment of $"+payment);
        viewBalance();
    }

    //Show status
    public String showInfo(){
        return "Name:"+firstName+" "+lastName
                +"\nGraded level:"+gradeYear
                +"\nStudent ID:"+studentID
                +"\nCourses Enrolled:"+courses
                +"\nBalance: $"+tuitionBalance;
    }
}
