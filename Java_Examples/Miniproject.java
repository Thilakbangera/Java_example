
import java.util.Scanner;

public class Miniproject {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=(int)(Math.random()*100);
        while (true) { 
            System.out.println("Enter a number(-1 for exit)");
            int usernumber=sc.nextInt();
            if(usernumber==-1){
                break;
            }
            if(number==usernumber){
                System.out.println("You won the game");
                break;
            }
            else if(usernumber<number){
                System.out.println("Entered number is leser than guessing number");
            }
            else if(usernumber>number){
                System.out.println("Entered number is greater than guessing number");
            }
            
        }
    }
    }
    

