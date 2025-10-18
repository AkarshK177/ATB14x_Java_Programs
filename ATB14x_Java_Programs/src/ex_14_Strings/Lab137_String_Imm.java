package ex_14_Strings;

public class Lab137_String_Imm {
    public static void main(String[] args) {
        String s1 = "hello";
        String n = s1;
        s1  = s1.concat("world");
        System.out.println(s1);

    }
}