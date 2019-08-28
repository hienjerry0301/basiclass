/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homeworkjava;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author PV
 */
public class baitapmang2chieu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = {
            {2, 7, 3, 8, 3},
            {8, 3},
            {4, 2, 5},
            {1, 6, 5, 1},
            {9}

        };
        int sum = 0;
        System.out.println("cac phan tu cua mang la : ");
        for (int i = 0; i < a.length; i++) {
            System.out.println("cac phan tu cua dong thu " + i + " la : ");
            for (int j = 0; j < a[i].length; j++) {
                //arr[i]][j] = sc.nextInt();

                System.out.println("a[" + i + "][" + j + "] : " + a[i][j]);

            }
        }
        
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                sum = sum + a[i][j];
            }
        }
        System.out.println("tong cac phan tu cua mang la : " + sum);
        System.out.println("cac phan tu chia het cho 3 la : ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] % 3 == 0) {
                    System.out.println("a[" + i + "][" + j + "]: " + a[i][j]);
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                int count = 0;
                for (int k = 1; k <= a[i][j]; k++) {
                    if (a[i][j] % k == 0) {
                        count++;
                    }

                }
                boolean SNT = false;
                if (count == 2) {
                    SNT = true;
                }
                if (SNT) {
                    System.out.println(a[i][j]);

                }

            }
        }
    }
}
