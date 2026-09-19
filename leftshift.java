public class leftshift {
    public static void main(String[] args) {
        int number = 5; // Binary: 0000 0101
        int shiftBy = 2;
        int x =3;
        int y = -1;
        System.out.println(y<<1);
        int result = number << shiftBy; // Left shift by 2 positions

        System.out.println("Original number: " + number);
        System.out.println("After left shifting by " + shiftBy + ": " + result);
        // Output will be 20, which is Binary: 0001 0100
        System.out.println(x<<1);
    }
    
}
