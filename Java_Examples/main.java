public class main {

    public static void main(String[] args){
        String name="Thilak";
        System.out.println(name.length());
        //Concat
        String name2="Bangera";
        System.out.println(name +" and "+ name2);
        //CharAt
        System.out.println(name.charAt(1));
        //Length
        System.out.println("Name 2 length"+name2.length());
        //replace
        String name3=name.replace("k", "a");
        System.out.println(name3);
        //Substring
        String name4="Thilak and bangera";
        System.out.println(name4.substring(0,7));
        
    }
}