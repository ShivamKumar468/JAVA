import java.util.Scanner;

public class stringIn {
    public static void main(String[] args){
        // Scanner sc= new Scanner(System.in);
        // String s= sc.next();
        // System.out.println("name =" +s);


        // Scanner sc= new Scanner(System.in);
        // String s= sc.nextLine();
        // System.out.println("name =" +s);


        //here nextLine will act enter of pressed for age(nextint) as a character and it will
        // take enter and move to the next on print without taking user input because in the buffer
        // enter is still present after.
        // so we should use nextLine for one more time extra  before using nextLine to take userinput
        /*Scanner sc= new Scanner(System.in);
        System.out.println("Enter your age: = ");
        int age =sc. nextInt();
        //
        
        System.out.println("Enter your name= ");
        String s= sc.nextLine();
        System.out.println("age= "+ age + "name =" +s); */


        // but if we print name first using nextline and after that age it will give output accordingly

        Scanner sc = new Scanner(System.in);
        //System.out.println("Enter your name= ");
        //String name = sc.nextLine();

        System.out.println("Enter your age= ");
        int age = sc.nextInt();
        //System.out.println("welcome "+name+ " your age is= "+ age);

        if(age>=18){
        System.out.println("You are valid for vote");

        }
        else if(age<18){

            System.out.println("You are not valid for vote");
        }
        else{
            System.out.println("Invalid Input");
        }
    } 
    }
    


