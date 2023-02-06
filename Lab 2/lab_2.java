import java.util.Scanner;
public class lab_2 {
    static Scanner sn=new Scanner(System.in);
    static String[] names=new String[1024];
    static int c=0;
        public static void main(String[] args) {
            do{
                print();
                int choice=sn.nextInt();
                switch(choice){
                    case 1:
                    nameadd();
                    break;
                    case 2:
                    namesearch();
                    break;
                    case 3:
                    name_remove();
                    break;
                    case 4:
                    System.out.println("Exiting Program...");
                    break;
                    default:
                    System.out.println("invalid choice !");
                }
            }while (c!=4);
            

        }
        static void print(){
            System.out.println("menu ");
            System.out.println("1. ENTER THE NAME: ");
            System.out.println("2. SEARCH THE NAME:");
            System.out.println("3. REMOVE THE NAME: ");
            System.out.println("4. EXIT !");
            System.out.println("enter the choice: ");
        }

        static void nameadd(){
            System.out.println("Enter The Name: ");
            String name=sn.next();
            if(isNameExists(name)){
                System.out.println("name already their. TRY SOMETHING DIFFERENT !");
            } else{
                names[c++]= name;
                System.out.println("Name Added Sucessfully !");
            }
        }
        
        static void namesearch(){
            System.out.print("search the name here: ");
            String name=sn.next();
            boolean isFound = false;
            for(int i =0;i<c;i++){
                if(names[i].equals(name)){
                    System.out.println("name is at "+(i+1));
                    isFound=true;
                    break;
                }
            }
            if(!isFound){
                System.out.println("not found !");
            }
        }
        static void name_remove(){
            System.out.println("enter the to be remove: ");
            String name=sn.next();
            boolean isFound = false;
            for (int i = 0; i < c; i++) {
            if (names[i].equals(name)) {
                for (int j = i; j < c - 1; j++) {
                    names[j] = names[j + 1];
                }
        c--;
        System.out.println("Name removed successfully!");
        isFound = true;
        break;
      }
    }
    if (!isFound) {
        System.out.println("not found !");
      }

        }
        static boolean isNameExists(String name) {
            for (int i = 0; i < c; i++) {
              if (names[i].equals(name)) {
                return true;
              }
            }
            return false;
          }


        
    }
    
}