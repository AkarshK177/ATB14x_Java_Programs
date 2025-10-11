package ex_06_Ternary_Operator;
public class Lab068_Real_Age_Classification {
    public static void main(String[] akarsh_args) {
    	// In Eclipse click on run dropdown and select run configuration for passing arguments values
        String user_input = akarsh_args[1]; // 68
        System.out.println(user_input);
        System.out.println(user_input instanceof String);

        // Input - String
        // String - Int
        int age = Integer.parseInt(user_input);

        String result = (age < 18) ? "Minor" : (age <= 60) ? "Adult": "Sr. Citizen";
        System.out.println(result);

    }
}
