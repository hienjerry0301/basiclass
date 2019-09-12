/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homeworkjava;

/**
 *
 * @author PV
 */
// viet ham input 1 mang, output la tong gia tri cac phan tu
public class tonggiatricacphantubangham {

    public static void main(String[] args) {

        int[] a = {6, 7, 3, 8, 1};
        int tong = tong(a);
        System.out.println(tong);

    }

    static int tong(int[] a) {
        
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
            return sum;
        
    }

}
