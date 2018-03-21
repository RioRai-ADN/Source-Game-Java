package Bai06;

import Bai05.Bai05;
import org.omg.Messaging.SYNC_WITH_TRANSPORT;

public class Bai06 extends Bai05{

    public void getFactorialEle() {

        int temp = this.getN();
        Bai05 b = new Bai05();
        int result = 1;
        for (int i = 2; i <= Math.sqrt(temp); i++) {
            if (b.checkPrimeNumBer(i) == true) {
                while (temp % i == 0) {
                    temp /= i;
                    System.out.print(i + "*");
                    result *= i;
                }
            }
        }

        System.out.print("1 = " +result);
    }

    public static void main(String args[]) {

        Bai06 b = new Bai06();
        b.setN();
        b.getFactorialEle();
    }
}
