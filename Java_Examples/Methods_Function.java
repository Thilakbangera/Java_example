public class Methods_Function {
    public static void printJava(){
        System.out.print("Hello ");
    }
    public static void printname(String name){
        System.out.println(name);
    }
    public static void printsum(int a,int b){
       int sum=a+b;
       System.out.println(sum);
    }
    public static void main(String[] args) {
        //Println
        //Prints Word, then moves to next line.
        //Methods
        printJava();
        printname("Bob");
        printsum(5, 5);

    }
    
}
