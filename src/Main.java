import object.shape;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int chieurong;
        int chieudai;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap chieu rong:");
        chieurong = scanner.nextInt();
        System.out.println("Nhap chieu dai:");
        chieudai = scanner.nextInt();

        //------------------

        shape a = new shape(chieudai, chieurong);

        System.out.println("dien tich: "+a.dientich());


    }
}
