import java.util.ArrayList;

public class Divisor {
    public int[] divisors(int n) {
        ArrayList<Integer> c=new ArrayList<>();
        for(int i=1;i<=n;i++){
            if((n%i)==0){
                c.add(i);
            }
        }
        int[] res=new int[c.size()];
        for(int i=0;i<c.size();i++){
            res[i]=c.get(i);
        }
        return res;
    }
    public static void main(String[] args){
        Divisor obj=new Divisor();
        int n=2;
        int[] res=obj.divisors(n);
        for(int val:res){
            System.out.println(val);
        }

    }
    
}
