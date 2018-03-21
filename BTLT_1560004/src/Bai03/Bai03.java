package Bai03;

import java.util.Scanner;

public class Bai03 {

    private int a;
    private int b;

    public Bai03() {
        this.a = 0;
        this.b = 0;
    }

    public void setAB() {
        Scanner scanner = new Scanner(System.in);
        boolean check = false;

        while (check == false) {
            try {
                System.out.println("Nhap UCLN(A, B):");
                System.out.print("A: ");
                this.a = scanner.nextInt();
                System.out.println();
                System.out.print("B: ");
                this.b = scanner.nextInt();
                System.out.println();
                check = true;
            }catch (Exception e) {
                System.out.println("Ki tu khong hop le, Hay nhap lai!");
                scanner.nextLine();
            }
        }
    }

    public int getGCF() {
        this.a = Math.abs(this.a);
        this.b = Math.abs(this.b);

        if (a == 0 || b == 0)
            return a+b;
        while (a != b) {
            if(a > b)
                a = a-b;
            else
                b = b-a;
        }
        return a;
    }

    public static void main(String args[]) {

        Bai03 bai03 = new Bai03();
        bai03.setAB();
        System.out.println("UCLN(" + bai03.a + ", " + bai03.b + "): " + bai03.getGCF());
    }
}
