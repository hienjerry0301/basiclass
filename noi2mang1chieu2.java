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
public class noi2mang1chieu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap do dai mang A: ");
        int doDaiA = sc.nextInt();
        int[] A = new int[doDaiA];

        System.out.println("Nhap do dai mang B: ");
        int doDaiB = sc.nextInt();
        int[] B = new int[doDaiB];

        int doDaiC = doDaiA + doDaiB;
        int[] C = new int[doDaiC];

        System.out.println("Cac phan tu mang A: ");
        for (int i = 0; i < doDaiA; i++) {
            A[i] = sc.nextInt();

        }
        System.out.println("Cac phan tu mang B: ");
        for (int i = 0; i < doDaiB; i++) {
            B[i] = sc.nextInt();
        }

        // noi 2 mang:
        for (int i = 0; i < doDaiA; i++) {
            C[i] = A[i];
            if (i == (doDaiA - 1)) {
                for (int j = 0; j < doDaiB; j++) {
                    C[doDaiA + j] = B[j];
                }
            }

        }
        System.out.println("Mang C la : ");
        for (int i = 0; i < doDaiC; i++) {
            System.out.print(C[i] + " \t ");
        }
    }

}
