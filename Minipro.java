import java.util.Scanner;

public class Minipro {

    public static void main(String[] args){
    
        Scanner num = new Scanner(System.in);
        int mynumber = (int)(Math.random()*100);
        int usernumber = 0;
        
        do{
            System.out.println("Guess my number(1-100) :");
            usernumber = num.nextInt();

           if(usernumber == mynumber){
               System.out.println("WOOHOO... CORRECT NUMBER");
              break;
            }
            else if(usernumber > mynumber){
                System.out.println("Your number is too large");
            }
            else{
                System.out.println("Your number is to small");
            }
        }while(usernumber>=0);
        System.out.println("My number was :");
        System.out.println(mynumber);

    }
    
}