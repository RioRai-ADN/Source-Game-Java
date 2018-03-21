package Bai05;

import java.util.Scanner;

public class Bai05 {

    private int n;

    public int getN() {
        return n;
    }

    public void setN() {

        Scanner scanner = new Scanner(System.in);

        boolean check = false;
        while (check == false) {
            try {
                System.out.print("Nhap N: ");
                this.n = scanner.nextInt();
                check = true;
            }catch (Exception ex) {

                System.out.println("Ki tu khong hop le, Hay nhap lai!");
                check = false;
                scanner.nextLine();
            }
        }
    }

    public Bai05() {
        this.n = 0;
    }

    public boolean checkPrimeNumber() {

        for (int i = 2; i < Math.sqrt(this.n); i++) {
            if (n%i == 0)
                return false;
        }
        return true;
    }

    //
    //OVERLOADING
    //boolean checkPrimeNumber()
    //boolean checkPrimeNumBer(int n)
    //
    public boolean checkPrimeNumBer(int n) {
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n%i == 0)
                return false;
        }
        return true;
    }

    public static void main(String args[]) {

        Bai05 b = new Bai05();
        b.setN();
        if (b.checkPrimeNumber() == false)
            System.out.println("KHONG PHAI SO NGUYEN TO!");
        else
            System.out.println("LA SO NGUYEN TO!");
    }
}
