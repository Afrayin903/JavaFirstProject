package practice;

public class CustomMethods_Return {
    public static void main(String[] args) {
        int total =sum(35, 51)/2;
        System.out.println(total);
        System.out.println("==================");
        String str1 = reverse("kahar kasim");
        System.out.println(str1);
        System.out.println("==================");
        System.out.println(isPalindrome("Bnb"));

    }
    public static int sum (int num1, int num2){
        return num1 + num2;

    }
    public static String reverse (String str){
        String result = "";
        for (int i=str.length()-1; i>=0; i--) {
            result += str.charAt(i);
        }
        return result;
    }

    public static boolean isPalindrome(String str){
        String reversed = reverse(str);
        return reversed.equalsIgnoreCase(str);
    }
}
