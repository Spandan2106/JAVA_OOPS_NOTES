public class rightshift {
    public static void main(String[] args) {
        int number = 20; // Binary: 0001 0100
        int positions = 2;

        int result = number >> positions; // Right shift by 2 positions

        System.out.println("Original number: " + number);
        System.out.println("After right shifting by " + positions + " positions: " + result);
        System.out.println("Now for negative number:");
        int negativeNumber = -20; // Binary: 1110 1100 (in 8-bit representation)
        int negativeResult = negativeNumber >> positions; // Right shift by 2 positions
        System.out.println("Original negative number: " + negativeNumber);
        System.out.println("After right shifting by " + positions + " positions: " + negativeResult);
        System.out.println("Now for unsignrded right shift:");
        int unsignedResult = negativeNumber >>> positions; // Unsigned right shift by 2 positions   
        System.out.println("After unsigned right shifting by " + positions + " positions: " + unsignedResult);  
    }
    
}
