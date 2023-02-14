import java.util.Scanner;

public class Lab_3 {
  static final int max_students = 1024;
  static String[] studentNames = new String[max_students];
  static String[][] studentDetails = new String[max_students][5];
  
  public static void main(String[] args) {
    int choice, numOfStudents = 0;
    Scanner input = new Scanner(System.in);
    
    while (true) {
      System.out.println("1. Add The Student Name: ");
      System.out.println("2. View Student Details: ");
      System.out.println("3. Search Student Details: ");
      System.out.println("4. Exit !");
      System.out.print("Enter your choice: ");
      
      choice = input.nextInt();
      switch (choice) {
        case 1:
          addStudent(numOfStudents++);
          break;
        case 2:
          viewStudentDetails();
          break;
        case 3:
          namesearch();
          break;
        case 4:
          System.exit(0);
        default:
          System.out.println("Invalid choice! Please try again.");
      }
    }
  }
  
  public static void addStudent(int numOfStudents) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter student name: ");
    studentNames[numOfStudents] = input.nextLine();
    System.out.print("Enter student register number: ");
    studentDetails[numOfStudents][0] = input.nextLine();
    System.out.print("Enter student email: ");
    studentDetails[numOfStudents][1] = input.nextLine();
    System.out.print("Enter student class: ");
    studentDetails[numOfStudents][2] = input.nextLine();
    System.out.print("Enter student department: ");
    studentDetails[numOfStudents][3] = input.nextLine();
    
    System.out.println("Student details added successfully!");
  }
  
  public static void viewStudentDetails() {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter student name to view details: ");
    String name = input.nextLine();
    
    int index = -1;
    for (int i = 0; i < studentNames.length; i++) {
      if (studentNames[i] != null && studentNames[i].equals(name)) {
        index = i;
        break;
      }
    }
    
    if (index != -1) {
      System.out.println("Name: " + studentNames[index]);
      System.out.println("Register Number: " + studentDetails[index][0]);
      System.out.println("Email: " + studentDetails[index][1]);
      System.out.println("Class: " + studentDetails[index][2]);
      System.out.println("Department: " + studentDetails[index][3]);
    } else {
      System.out.println("Student name not found!");
    }
  }
  static void namesearch(){
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter student name to search details: ");
    String name = input.nextLine();
    
    int index = -1;
    for (int i = 0; i < studentNames.length; i++) {
      if (studentNames[i] != null && studentNames[i].equals(name)) {
        index = i;
        break;
      }
    }
    
    if (index != -1) {
      System.out.println("Name: " + studentNames[index]);
      System.out.println("Register Number: " + studentDetails[index][0]);
      System.out.println("Email: " + studentDetails[index][1]);
      System.out.println("Class: " + studentDetails[index][2]);
      System.out.println("Department: " + studentDetails[index][3]);
    } else {
      System.out.println("Student name not found!");
    }
}
}
