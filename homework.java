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
public class homework3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int doDai = 10;
        int[] a = new int[10];
        int sum1 = 0;
        int i;
        System.out.println("cac phan tu cua mang la: ");
        for (i = 0; i < 10; i++) {
            a[i] = sc.nextInt();
            sum1 = sum1 + a[i];
        }
        System.out.println("tong cac phan tu cua mang la " + sum1);
        for (i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.println("cac phan tu o vi tri le la: " + a[i]);
            } else if (i % 2 == 1) {
                System.out.println("cac phan tu o vi tri chan la: " + a[i]);
            }
        }
        System.out.println("cac phan tu chia het cho 2 la: ");
        for (i = 0; i < 10; i++) {
            if (a[i] % 2 == 0) {
                System.out.println(a[i]);
            }
        }
        System.out.println("cac phan tu chia 5 du 1 la:");
        for (i = 0; i < 10; i++) {
            if (a[i] % 5 == 1) {
                System.out.println(a[i]);

            }
        }
        int sum2 = 0;
        for (i = 0; i < 10; i++) {
            if (a[i] % 2 == 0) {
                sum2 = sum2 + a[i];
            }
        }
        System.out.println("tong cac phan tu chan la:" + sum2);

    }

}
