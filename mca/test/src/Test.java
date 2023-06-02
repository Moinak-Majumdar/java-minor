import pack.Hello;

public class Test {
    public static void main(String[] args) {
        Exp e = new Exp();
        e.here();
    }

}

class Exp {

    public void here() {
        Hello h = new Hello();
        h.say();
    }

}
