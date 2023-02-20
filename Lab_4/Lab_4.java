package Lab_4;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab_4 {
    static int acc_n;
    static String acc_name;
    static float acc_bal;
    static ArrayList<String> tran = new ArrayList<String>();
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        initialize(sc);

        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Transactions");
            System.out.println("4. Account Summary");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    deposit(sc);
                    break;
                case 2:
                    withdraw(sc);
                    break;
                case 3:
                    Transactions();
                    break;
                case 4:
                    Acc_Summary();
                    break;
                case 5:
                    System.out.println("EXIT !");
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
                    break;
            }
        } while (choice != 5);

        sc.close();
    }    
        public static void initialize(Scanner sc){
            
            System.out.print("Enter account number: ");
            acc_n=sc.nextInt();
            System.out.print("Enter account holder name: ");
            acc_name=sc.next();
            System.out.print("Enter account balance: ");
            acc_bal=sc.nextFloat();
            
            System.out.println("Account Number is "+acc_n);
            System.out.println("Account holder is "+acc_name);
            System.out.println("Account Balance is "+acc_bal);
            tran.add(String.format("Account initialized with balance: %.2f", acc_bal));
        }
        public static void Transactions() {
           
            System.out.println("Transactions:");
            for (String t : tran) {
                System.out.println(t);
            }
        }
        static void deposit(Scanner sc){
            
            System.out.println("Enter the amount to deposit: ");
            float depo=sc.nextFloat();
            acc_bal=acc_bal+depo;
            System.out.println("deposit sucessfull! \nAccount balance is "+acc_bal);
            tran.add(String.format("Deposit: %.2f", depo));
            tran.add(String.format("New balance: %.2f", acc_bal));
        }
        static void withdraw(Scanner sc){
            
            System.out.println("Enter the amount to withdraw: ");
            float with=sc.nextFloat();
            if(acc_bal>with || acc_bal<=0){
                acc_bal=acc_bal-with;
                System.out.println("withdraw sucessfull! \nAccount balance is "+acc_bal);
                tran.add(String.format("Withdrawal: %.2f", with));
                tran.add(String.format("New balance: %.2f", acc_bal));
            }else{
                System.out.println("insufficient balance!");
            }
            
        }

        public static void Acc_Summary() {
            System.out.println("Account Summary is given below ");
            System.out.println("Account Number: " + acc_n);
            System.out.println("Account Holder Name: " + acc_name);
            System.out.println("Account Balance: " + acc_bal);
        }

    
    
}
