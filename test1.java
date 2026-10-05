import java.io.*;
public class test1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your name:");
        String name = br.readLine();
        System.out.println("Hello, " + name + "!");
        System.out.println("Hello, World!");
    }
    
}
