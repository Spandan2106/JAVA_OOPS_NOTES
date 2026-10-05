class A extends Thread{
    public void run(){
        // Thread execution code
        for(int i =0;i<5;i++){
            System.out.println("Thread A: " + i);
        }
    }
}
class B extends Thread{
    public void run(){
        // Thread execution code
        for(int i =0;i<5;i++){
            System.out.println("Thread B: " + i);
        }
    }
}
class C extends Thread{
    public void run(){
        // Thread execution code
        for(int i =0;i<5;i++){
            System.out.println("Thread C: " + i);
        }
    }
}
class Main3{
    public static void main(String args[]){
        A a = new A();
        B b = new B();
        C c = new C();
        a.start();
        b.start();
        c.start();
    }
}