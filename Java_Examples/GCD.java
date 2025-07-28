public class GCD {

    public int GCD(int n1, int n2) {
        while (n2 != 0) {
            int temp = n2;
            n2 = n1 % n2;
            n1 = temp;
        }
        return n1;
    }

    public static void main(String[] args) {
        GCD obj = new GCD();

        int a = 4, b = 6;
        System.out.println("GCD of " + a + " and " + b + " is: " + obj.GCD(a, b));

        a = 9; b = 8;
        System.out.println("GCD of " + a + " and " + b + " is: " + obj.GCD(a, b));

        a = 12; b = 15;
        System.out.println("GCD of " + a + " and " + b + " is: " + obj.GCD(a, b));
    }
}
