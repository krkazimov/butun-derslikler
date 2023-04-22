package examples;

import java.util.LinkedList;

class B implements Cloneable {
    private String cirt;
    public String pirt;
    protected String lirt = "test";

    private void zirt(){}
    protected void dirt(){}

    @Override
    protected B clone() throws CloneNotSupportedException {
        return this.clone();
    }
}


class C {
    public static void main(String[] args) throws CloneNotSupportedException {
            B b = new B();
            B c = b.clone();
            b.equals(c);


    }
}

public class A extends B {
    public static void main(String[] args) {

    }
}
