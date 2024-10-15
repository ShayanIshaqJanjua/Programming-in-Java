public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Enter a string and I will check if it is a palindrome");
        String input = System.console().readLine();
        if (isPalindrome(input)) {
            System.out.println("The string " + input + " is a palindrome");
        } else {
            System.out.println("The string " + input + " is not a palindrome");
        }
    }
    

    public static boolean isPalindrome(String input) {
        int x =0;
        int y = input.length()-1;
        while(x < y) {
            if (input.charAt(x) != input.charAt(y)) {
                return false;
            }
            x++;
            y--;
        }
        return true;
    }   
}
