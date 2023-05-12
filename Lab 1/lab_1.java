import java.util.Scanner;

public class lab_1 {
    public static void main(String[] args) {

    
        Scanner obj=new Scanner(System.in);

        System.out.print("Enter the username: ");
        String name=obj.nextLine();

        System.out.print("Enter the gender(m/f): ");
        String gender=obj.nextLine();

        System.out.print("Enter the age: ");
        int age=Integer.parseInt(obj.nextLine());

        System.out.print("Enter the state: ");
        String loc=obj.nextLine();
        

        System.out.print("enter the company: ");
        String company=obj.nextLine();

        System.out.println("detailsis given below.");
        System.out.println("Name : " + name);
        System.out.println("Gender : " + gender);
        System.out.println("Age : " + age);
        System.out.println("Region of Employee: " + loc);
        System.out.println("Company name of Employee: " + company);
        System.out.println("***********************************************************************");

        if (gender.compareToIgnoreCase("m")==0){
            System.out.println("MALE");

        }else if(gender.compareToIgnoreCase("f")==0){
            System.out.println("FEMALE");
        }else{
            System.out.println("invalid input !");
        }
        System.out.println("-------------------------------------------------------------------------------------------------");
    // check for TOP MNC companies

        switch (company.toLowerCase()) {
            case "facebook":
            case "google":
            case "microsoft":
            case "samsung":
            case "ibm":
            case "apple":
            System.out.println("The employee is working in Top MNC Companies");
            break;
        default:
            break;
    }
    System.out.println("----------------------------------------------------------------------------------------------");
    String state=loc;
    switch (state) {
        case "Arunachal Pradesh", "Assam", "Meghalaya", "Manipur", "Mizoram", "Nagaland", "Tripura", "Sikkim":
            System.out.println(
                    "The Employee is from the Northeastern states of India; Preferable work location is in " + state
                            + ".");
            break;
        case "Rajasthan", "Uttar Pradesh", "Ladakh", "Himachal Pradesh", "Uttarakhand", "Punjab", "Haryana",
                "Jammu and Kashmir", "	Delhi", "Chandigarh":
            System.out.println("The Employee is from the Northern states of India; Preferable work location is in "
                    + state + ".");

            break;
        case "Karnataka", "Tamil Nadu", "Andhra Pradesh", "Telangana", "Kerala", "Puducherry":
            System.out.println("The Employee is from the southern states of India; Preferable work location is in "
                    + state + ".");
            break;
        case "Maharashtra", "Gujarat", "Goa", "Dadra and Nagar Haveli and Daman and Diu":
            System.out.println("The Employee is from the Western states of India; Preferable work location is in "
                    + state + ".");
            break;
        case "Jharkhand", "West Bengal", "Bihar", "Odisha":
            System.out.println("The Employee is from the Eastern states of India; Preferable work location is in "
                    + state + ".");
            break;
        case "Chhattisgarh", "Madhya Pradesh":
            System.out.println("The Employee is from the Central states of India; Preferable work location is in "
                    + state + ".");
            break;
        default:
            break;
    }
    System.out.println("----------------------------------------------------------------------------------------------");
    }
}




