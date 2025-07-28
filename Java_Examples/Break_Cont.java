public class Break_Cont {
    public static void main(String[] args) {
        //Break
        int i=0;
        while (true) { 
            if(i==3){
                i++;
                continue;
            }
            System.out.println(i);
            i++;
            if(i>5){
                break;
            }

        }
    }
    
}
