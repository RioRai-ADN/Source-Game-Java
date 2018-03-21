package Bai09;

import Bai08.Bai08;

public class Bai09 extends Bai08{

    private int i;

    public Bai09() {
        this.i = 0;
    }

    public int fibonacci(int n) {
        if (n < 0)
            return -1;
        else if (n == 0 || n == 1)
            return n;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String args[]) {

        Bai09 b = new Bai09();
        b.inputN();
        for (int i = 0; i < b.getN(); i++) {
            System.out.print(b.fibonacci(i) + " ");
        }
    }
}
