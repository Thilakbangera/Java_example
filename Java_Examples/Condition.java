import java.util.Scanner;
public class Condition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean isSunup=sc.nextBoolean();
        if(isSunup==true){
            System.out.println("Day");
        }
        else{
            System.out.println("Night");
        }
        // and or operator
        int a=60;
        int b=40;
        if(a<50 && b<50){
            System.out.println("Both less than 50");
        }
        if(a<50 || b<50){
           System.out.println("Atleast one is less than 50");
        }
    }
}
