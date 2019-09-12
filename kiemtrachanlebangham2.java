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
// input: so nguyen, output: chan thi true le thi false
public class kiemtrachanlebangham {
    public static void main(String[] args) {
        int a = 7;
        boolean check = kiemtrachanle(a);
        System.out.println(check);
    }
    static boolean kiemtrachanle(int a){
        boolean CHECK = true;
        if(a%2==0){
                CHECK = true;
        }else{
            CHECK = false;
            
            
            
        }
        return CHECK;
    }
    
}
