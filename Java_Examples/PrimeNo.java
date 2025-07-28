public class PrimeNo {
    public boolean isPrime(int n) {
          //your code goes here
          for(int i=2;i<n;i++){
            if((n%i)==0){
                return false;
            }
          }
          return true;

    }
    public static void main(String[] args){
      PrimeNo obj=new PrimeNo();
      int n=6;
      System.out.println(obj.isPrime(n));
        
    }
}