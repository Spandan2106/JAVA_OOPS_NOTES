public class test3 {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        char c = 'A';
        float f = (float) Math.PI;
        String s = "Hello";
        
        System.out.println("This is test3.java");
        System.out.println("x:"+x);
        System.out.println("y:"+y);
        System.out.println("c:"+c);
        System.out.println("s:"+s);
        System.out.print("Sum of x and y: "+" ");
        System.out.print(x + y);
        System.out.format("\nCharacter c: %c\n", c);
        System.out.printf("String s: %s\n", s);
       
        System.out.printf("Value of PI: %.2f\n", f);
        System.out.printf("Value of PI with width 10: %10.4f\n", f);
    }
    
}
