package Basics;

public class inimple2 implements inex2 {

    @Override
    public void anil() {
        System.out.println("AnilKumar Gaduthotti");
    }

    @Override
    public void vamsi() {
        System.out.println("Vamsi Chandeti");
    }
    public static void main(String[] args) {
        new inimple2().anil();
        new inimple2().vamsi();
}
}