import java.util.ArrayList;
public class Solution {
    public int[] divisors(int n) {
        ArrayList<Integer> c =new ArrayList<>();
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
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] result = sol.divisors(6);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}