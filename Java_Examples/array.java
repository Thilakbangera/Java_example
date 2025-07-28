
import java.util.Arrays;

public class array {
    public static void main(String[] args) {
        int[] marks = new int[3];
        int[] marks2={97,98,95};
        //2dArray    
        marks[0]=97;
        int[][] fin={{97,98,95},{95,95,98}};                                   
        marks[1]=98;
        marks[2]=87;
        System.out.println(marks[0]);
        //Array length
        System.out.println(marks.length);
        //Array sort
        Arrays.sort(marks);
        System.out.println(marks[0]);
        //2d array print
        System.out.println(fin[0][1]);

    }
    
}
