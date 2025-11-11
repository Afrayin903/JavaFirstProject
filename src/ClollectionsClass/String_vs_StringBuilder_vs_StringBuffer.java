package ClollectionsClass;

public class String_vs_StringBuilder_vs_StringBuffer {
    public static void main(String[] args) {
        String string = "Wooden";
        string.concat(" spoon");//"Wooden spoon"
        //when print out string still pointing "Wooden" string
        System.out.println(string);

        //if we assign to variable after contact then pointing different object
        string = string.concat(" spoon");
        System.out.println(string); // this is call string immutable

        System.out.println("=============================================");
        StringBuilder stringBuilder = new StringBuilder("Wooden");
        stringBuilder.append(" spoon");
        System.out.println(stringBuilder);//Object modified therefor stringBuilder is mutable

        System.out.println("=============================================");
        StringBuffer stringBuffer = new StringBuffer("Wooden");
        stringBuffer.append(" spoon");
        System.out.println(stringBuffer);//Object modified therefor stringBuffer is mutable
    }
}
