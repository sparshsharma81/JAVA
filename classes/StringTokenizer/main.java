class A {
     void show() {
        System.out.println("A");
    }
}

class B extends A {
    // @Override
     void show() {
        System.out.println("B");
    }
}

class C extends B {
     void show() {
        System.out.println("C");
    }
}


public class main {
    public static void main(String[] args) {
        A a = new B();
        a.show();
    }
}