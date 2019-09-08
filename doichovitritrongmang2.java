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
public class doichovitritrongmang2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap do dai mang : ");
        int doDai = sc.nextInt();
        int[] a = new int[doDai];

        System.out.println("Cac phan tu cua mang : ");
        for (int i = 0; i < doDai; i++) {
            a[i] = sc.nextInt();
        }
        for (int k = 0; k < doDai; k++) {
            for (int i = k + 1; i < doDai; i++) {
                if (a[k] > a[i]) {
                    int temp = a[k];
                    a[k] = a[i];
                    a[i] = temp;

                    System.out.println(k + " and " + i);
                }
            }

        }

    }
}
