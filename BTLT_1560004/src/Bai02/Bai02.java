package Bai02;

import java.util.Scanner;

public class Bai02 {

    private int n;
    private int size;

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
        if (n < 0)
            this.n = 0;
    }

    public int getSize() {
        return size;
    }

    public Bai02() {
        this.setN(0);
        this.size = 0;
    }

    public void getDivisor() {

        for (int i = 1; i <= this.getN(); i++) {
            if (n%i == 0)
            {
                System.out.print(i + " ");
                this.size++;
            }
        }
    }

    public static void main(String args[]) {

        Bai02 b = new Bai02();
        Scanner scanner = new Scanner(System.in);
        boolean check = false;

        while(check == false) {
            try {
                System.out.print("Nhap N: ");
                b.setN(scanner.nextInt());
                check = true;
            } catch (Exception e) {
                System.out.println("Ki tu khong hop le, hay nhap lai!");
                scanner.nextLine();
            }
        }

        System.out.print("CAC UOC CUA " + b.getN() + " : ");
        b.getDivisor();
    }
}
