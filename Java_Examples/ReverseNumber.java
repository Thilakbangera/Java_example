public class ReverseNumber {
    public int reverse(int x) {
        int rev=0;
        while(x!=0){
            int digit=x%10;
            int newrev=rev*10+digit;
            if ((newrev - digit) / 10 != rev) {
                return 0;
            }
            rev=newrev;
            x=x/10;
        }
        return rev;
       
    }
     public static void main(String[] args) {
        int x=123;
        ReverseNumber obj=new ReverseNumber();
        int ans=obj.reverse(x);
        System.out.println(ans);

    }
}