import java.security.spec.RSAOtherPrimeInfo;

public class TestClass1 {
    public static void main(String[] args) {
        Parent p = n
        ew Child();
        p.display();
    }
}

class Parent
{
    void display()
    {
        System.out.println("Parent display");
    }
}

class Child extends Parent
{
    void display(){
        System.out.println("Child display");
    }
}