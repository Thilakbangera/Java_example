public class Palindrome {

    public boolean isPalindrome(int x) {
        int num = x;
        int rev = 0;
        while (x != 0) {
            int digit = Math.abs(x % 10);
            int nr = rev * 10 + digit;
            rev = nr;
            x = x / 10;
        }
        return num == rev;
    }

    public static void main(String[] args) {
        Palindrome obj = new Palindrome();

        int x1 = 121;
        System.out.println(x1 + " is palindrome? " + obj.isPalindrome(x1));  // true

        int x2 = -121;
        System.out.println(x2 + " is palindrome? " + obj.isPalindrome(x2));  // false (currently returns true, due to abs usage)

        int x3 = 123;
        System.out.println(x3 + " is palindrome? " + obj.isPalindrome(x3));  // false
    }
}
