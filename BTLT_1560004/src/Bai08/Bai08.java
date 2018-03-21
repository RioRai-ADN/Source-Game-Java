package Bai08;

import Bai05.Bai05;

import java.util.Scanner;

public class Bai08 {

    private int n;


    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void inputN() {

        Scanner scanner = new Scanner(System.in);

        boolean check = false;
        while (check == false) {
            try {
                System.out.print("Nhap N: ");
                this.setN(scanner.nextInt());
                check = true;
            }catch (Exception ex) {

                System.out.println("Ki tu khong hop le, Hay nhap lai!");
                check = false;
                scanner.nextLine();
            }
        }
    }

    public int countEvenNumber(){
        int count = 0;
        for (int i = 2; i <= this.getN(); i += 2)
            count++;
        return count;
    }

    public static void main(String args[]) {

        Bai08 b = new Bai08();
        b.inputN();
        System.out.println("So chan: " + b.countEvenNumber() + " so");
        System.out.println("Ti le: " + (float)b.countEvenNumber()/(float)b.getN()*100 + "%");
        System.out.println("So le: " + (b.getN() - b.countEvenNumber())+ " so");
        System.out.println("Ti le: " + (float)(b.getN() - b.countEvenNumber())/(float)b.getN()*100 + "%");
    }

}
