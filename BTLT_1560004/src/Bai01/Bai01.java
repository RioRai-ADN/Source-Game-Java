package Bai01;

public class Bai01 {

    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Bai01() {
        this.setSize(0);
    }

    public void getNumbsDivThree() {
        int count = 0;
        for (int i = 1; i <= 9; i++)
        {
            for (int j = 0; j <= 9; j++)
            {
                for (int k = 0; k <= 9; k++)
                {
                    if ((i+j+k)%3 == 0)
                    {
                        count++;
                        System.out.print(i*100 + j*10+k + " ");
                    }
                }
            }
        }
        this.setSize(count);
    }

    public static void main(String args[]) {

        Bai01 b = new Bai01();
        System.out.println("DANH SACH CAC SO CHIA HET CHO 3:");
        b.getNumbsDivThree();
        System.out.println();
        System.out.println("GOM: " + b.getSize() + "/899 SO");
    }
}
