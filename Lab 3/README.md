----------LAB_PROGRAM-------------------------------------------------------------------------------------------
Create a java program, that stores the details of a student (Name, Register Number, Email, Class, Department).
You can use a two-dimensional array to store the details.
HINT: String arr[] = {{"Alwin","1847207","alwin@christ.in","MCA","Computer Science"},{"Balagangadhar","2011204","bala@christ.in","MDS","Data Science"}}

You need to have functions to:
Collect the details of the student
Display the details of the student
Search the details of the student
With the help of a menu-driven main function, you need to access these functions inside your class and perform the operations.

Whenever you are entering the details of a student, you need to enter the value into a static global string array, that stores the names that the user has entered. Searching this array will help you to find if the details of the student are already entered into the program.

You will have a function to perform this search operation, which can be used to implement two functionality in the code
To check if the name is already entered
While searching for a name, you can identify the index of the two-dimensional array to print the details directly.
In the end, you will have
Four functions inside your lab program class including your main class
One static String array storing the names (note the program can store up to 1024 students)
One two-dimensional string array storing the details of up to 1024 students
A menu-driven main method implementing the functions and functionality
---------------------------------OUTPUT------------------------------------------------------------------------------------------

1. Add The Student Name: 
2. View Student Details:
3. Search Student Details:
4. Exit !
Enter your choice: 1
Enter student name: darvesh
Enter student register number: 22122018
Enter student email: darvesh@gmail.com
Enter student class: 2msds-a
Enter student department: ds
Student details added successfully!
1. Add The Student Name:
2. View Student Details:
3. Search Student Details:
4. Exit !
Enter your choice: 1
Enter student name: ashish
Enter student register number: 22122034
Enter student email: as@gmail.com
Enter student class: msds-a
Enter student department: ds1
Student details added successfully!
1. Add The Student Name:
2. View Student Details:
3. Search Student Details:
4. Exit !
Enter your choice: 3
Enter student name to view details: vignesh
Student name not found!
1. Add The Student Name:
2. View Student Details:
3. Search Student Details:
4. Exit !
Enter your choice: 3
Enter student name to view details: darvesh
Name: darvesh
Register Number: 22122018
Email: darvesh@gmail.com
Class: 2msds-a
Department: ds
1. Add The Student Name:
2. View Student Details:
3. Search Student Details:
4. Exit !
Enter your choice: 4
