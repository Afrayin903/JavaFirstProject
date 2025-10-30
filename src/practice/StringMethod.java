package practice;

public class StringMethod {

    public static void main(String[] args) {
        String str = "Kahar";
        String strTwo = "3ahar";
        char ch1 = str.charAt(3);
        int size = str.length();
        //Last index number
        int lastIndex = str.length()-1;
        int str1 = str.lastIndexOf('r', 4);
        System.out.println(ch1 + " " + size + " " + lastIndex + " " +str1);
        str = str.toLowerCase();
        System.out.printf("str turn to lower case %s", str);
        str=str.replace(str, "KAHAR");
        System.out.println("\n"+str);
        str = str.replaceFirst("K",    "3");
        System.out.println(str);
        boolean str2 = str.isEmpty();
        System.out.println(str2);
        System.out.println(str == strTwo);
        System.out.println(str.equalsIgnoreCase(strTwo));
        displayValue(5);
        eligibleToVote(22,true);
        oddOrEven(5);



    }
    public static void displayValue (int num){
        System.out.println("Value is " + num);
    }
    public static void eligibleToVote (int age, boolean isUSCitizen){
       String checkEligible = (age >= 18 && isUSCitizen)? "Eligible to vote" : "Not eligible to vote";
        System.out.println(checkEligible);
    }
    public static void oddOrEven (int num){
        String checkOddOrEven = (num % 2 == 0)? num + " is even" : num + " is odd";
        System.out.println(checkOddOrEven);
    }
}
