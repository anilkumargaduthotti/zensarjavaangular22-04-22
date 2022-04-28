package Basics;

public class inimple implements inex {

    @Override
    public void dance() {
        System.out.println("Dance");
    }

    @Override
    public void hello() {
        System.out.println("Hello");
    }

    @Override
    public void talk() {
        System.out.println("Talk");
    }
    public static void main(String[] args) {
        new inimple().hello();
        new inimple().talk();
        new inimple().dance();
    }
}
