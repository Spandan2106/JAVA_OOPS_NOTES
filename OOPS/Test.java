class Base{
    void fun() {
        System.out.println("Base class function");
    }
}

class Derived extends Base {
    @Override
    void fun() {
        System.out.println("Derived class function");
    }
}

public class Test {
    public static void main(String[] args) {
        Base obj = new Derived();
        obj.fun(); // This will call the overridden method in Derived class
        Derived d = new Derived();
        d.fun(); // This will call the overridden method in Derived class
        Base b = new Base();
        b.fun(); // This will call the method in Base class
    }
}


