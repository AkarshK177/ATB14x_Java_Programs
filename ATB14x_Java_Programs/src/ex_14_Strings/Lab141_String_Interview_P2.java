package ex_14_Strings;

public class Lab141_String_Interview_P2 {
    public static void main(String[] args) {
        String s1 = "Hello";    // String literal "Hello" added to the SCP
        String s4 = "Hello";    // No new object; it refers to the same object in the SCP

        String s2 = new String("Hello");  // A new string object is created in the heap
        String s3 = new String("Hello");  // Another new string object is created in the heap
        String s5 = new String("hello");  // Another new string object in the heap (with lowercase "hello")

        // == -> Comparison -> String => this checks the reference location
        System.out.println(s1 == s3); // false: s1 (in SCP) != s3 (in heap)
        System.out.println(s1 == s2); // false: s1 (in SCP) != s2 (in heap)
        System.out.println(s2 == s3); // false: s2 and s3 are different objects in the heap

        System.out.println(s1 == s4); // true: s1 and s4 refer to the same object in the SCP
        System.out.println(s3 == s5); // false: s3 and s5 are different objects in the heap

        // equals (content) -> value
        System.out.println(s1.equals(s2)); // true: "Hello" equals "Hello" by value
        System.out.println(s1.equals(s3)); // true: "Hello" equals "Hello" by value
        System.out.println(s3.equals(s5)); // false: "Hello" != "hello" by value
        System.out.println(s3.equalsIgnoreCase(s5)); // true: "Hello" equals "hello" ignoring case

        // == checks for the reference (object comparison)
        // equals checks for the content (value comparison)
    }
}
