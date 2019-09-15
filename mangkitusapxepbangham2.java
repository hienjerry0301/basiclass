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
public class mangkitusapxepbangham {

    public static void main(String[] args) {
        char[] a = {'a', 'z', 'b', 'c', 'd'};
        char[] A = Arrange(a);
        for(int i = 0; i < a.length; i++)
        System.out.println(a[i]);
    
    }
    
   
    static char[] Arrange(char[] a) {
char temp;
for(int k = 0; k < a.length; k++){
    for(int i = 0; i < a.length-1;i++){
        if((int)a[i] < (int)a[i+1]){
            temp = a[i];
            a[i] = a[i+1];
            a[i+1] = temp;
            
        }
    }
    
}
return a;
    }
}
