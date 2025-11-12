package practice9;

public class TestInterface {
    public static void main(String[] args) {
        MyInterface<Integer> test = p -> System.out.println((p*p+5)/2500);
        test.function(100);
        System.out.println("-----------------");
        MyInterface <Integer> oddOrEven = (a) ->{
//             if(a % 2 == 0) {
//                 System.out.println(a + " is even number");
//             }else {
//                 System.out.println(a + " is odd number");
//             }
             String result = (a % 2 == 0)? a + " is even number" : a + " is odd number";
             System.out.println(result);
        };
        System.out.println();
        oddOrEven.function(22);

        System.out.println("----------------------------------");
        MyInterface <String> reverse = (str)-> {
            for (int i = str.length()-1; i >=0 ; i--) {
                System.out.print(str.charAt(i));
            }
            System.out.println();
        };
        reverse.function("Wooden spoon");
    }

}
