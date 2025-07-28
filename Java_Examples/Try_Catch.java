public class Try_Catch {
    public static void main(String[] args) {
        //Try-Catch in Exception Handling
        int[] marks={97,98,99};
        try{
            System.out.println(marks[5]);
        }catch(Exception exception){
            System.out.println("This is out of bound");
        }
        System.out.println("The name is Bob");

    }
    
}
