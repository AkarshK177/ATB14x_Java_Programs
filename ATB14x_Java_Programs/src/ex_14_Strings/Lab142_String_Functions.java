package ex_14_Strings;

public class Lab142_String_Functions {
    public static void main(String[] args) {
        String str1 = "Hello";  // Refers to string literal in the String Constant Pool (SCP)
        String str2 = "Hello";  // Refers to the same string literal in the SCP
        String str3 = new String("Hello"); // A new object in the Heap with the same content as the literal

        System.out.println(str1 == str2);  // Compares references (SCP)
        System.out.println(str1 == str3);  // Compares reference, str1 (SCP) and str3 (Heap)
        System.out.println(str1.equals(str3));  // Compares content (value)

        System.out.println(str1.concat(str3));  // Concatenates str1 with str3
    }
}
