package ex_17_OOPs;

public class Lab159_P2 {
    public static void main(String[] args) {
        ATBx amit = new ATBx();
        // Class - ATBx
        // Object Ref - amit
        // Object -> new ATBx();

        amit.name = "Amit sharma";
        amit.doAssignment();
        amit.speak();

        Baby b1 = new Baby();
        Baby b2 = new Baby();
        Baby b3 = new Baby();
        
        b2.cry();
    }
}