/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homeworkjava;

import java.util.Scanner;

/**
 *
 * @author PV
 */
public class kiemtrathututrongmang {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap phan tu cua mang: ");
        int dodai = sc.nextInt();
        int[] a = new int[dodai];
        System.out.println("Nhap cac phan tu mang: ");
        for (int i = 0; i < dodai; i++) {
            a[i] = sc.nextInt();
        }

        boolean check = true;
        int type = 0;

        for (int i = 0; i < dodai - 1; i++) {
            for (int j = i + 1; j < dodai; j++) {
                if (a[i] > a[j]) {
                    check = false;
                    break;
                }
            }

        }
        if (check) {
            type = 1;
        } else {
            check = true;
            for (int i = 0; i < dodai - 1; i++) {
                for (int j = i + 1; j < dodai; j++) {
                    if (a[i] < a[j]) {
                        check = false;
                    }
                }
            }
            if (check) {
                type = 2;
            }
        }
        switch (type) {
            case 0:
                System.out.println("Chua duoc sap xep");
                break;
            case 1:
                System.out.println("Tang dan");
                break;
            case 2:
                System.out.println("Giam dan");
                break;
        }
    }

}
