public class ArmNo {
    public int countDigits(int n) {
        int k=n;
        int count = 0;
        int num=0,su;
        while (n > 0) {
            n = n / 10;
            count++;
        }
        while(k!=0){
            int digit=k%10;
            su=(int)Math.pow(digit,count); 
            num=num+su;
            k=k/10;
        }
        return num;
        
    }

    public static void main(String[] args) {
        ArmNo obj = new ArmNo();
        int n = 12;
        System.out.println("Number of digits in " + n + " = " + obj.countDigits(n));
    }
}
