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
public class hotenvadiem {

    public static void main(String[] args) {
        String[][] A = new String[2][5];
        A[0][0] = "Trung";
        A[1][0] = "4";

        A[0][1] = "Tuan";
        A[1][1] = "6";

        A[0][2] = "Phuc";
        A[1][2] = "3";

        A[0][3] = "An";
        A[1][3] = "5";

        A[0][4] = "Giang";
        A[1][4] = "2";

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 - 1; j++) {

                if (Integer.parseInt(A[1][j]) > Integer.parseInt(A[1][j + 1])) {
                    String temp;
                    temp = A[1][j];
                    A[1][j] = A[1][j + 1];
                    A[1][j + 1] = temp;

                    temp = A[0][j];
                    A[0][j] = A[0][j + 1];
                    A[0][j + 1] = temp;
                }
            }
        }

        for (int j = 0; j < 5; j++) {

            System.out.println("NAME: " + A[0][j] + " , " + "Point: " + A[1][j]);

        }
    }

}
