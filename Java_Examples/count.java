import java.util.Scanner;
public class count{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        num=Math.abs(num);
        int count=0;
        while(num>0){
            num/=10;
            count++;
        }
        System.out.println(count);

    }
}