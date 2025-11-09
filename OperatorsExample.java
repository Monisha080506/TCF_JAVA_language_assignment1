public class OperatorsExample {
    public static void main(String[] args) {
        int a = 10, b = 3;
        
        System.out.println("Addition: " + (a + b));       // 13
        System.out.println("Subtraction: " + (a - b));    // 7
        System.out.println("Multiplication: " + (a * b)); // 30
        System.out.println("Division: " + (a / b));       // 3 (integer division)
        System.out.println("Modulus: " + (a % b));        // 1 (remainder)
        
        // Increment and Decrement
        a++;
        System.out.println("Increment a: " + a);          // 11
        
        b--;
        System.out.println("Decrement b: " + b);          // 2
    }
}
