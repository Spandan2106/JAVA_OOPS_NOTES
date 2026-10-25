import java.util.Scanner;

class Voter{

    void checkage(int age, String name) throws Exception{
        if(age < 18){
            throw new Exception("Not eligible to vote");
        }
        else{
            System.out.println(name + " is eligible to vote");
        }
    }
}

class Compute10{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Voter v = new Voter();
        try{
            System.out.println("Enter your name: ");
            String name = sc.nextLine();
            System.out.println("Enter your age: ");
            int age = sc.nextInt();
            v.checkage(age, name);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally{
            sc.close();
        }
    }
}