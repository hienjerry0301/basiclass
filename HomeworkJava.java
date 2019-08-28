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
public class HomeworkJava {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // BAI TAP DE 
        // tinh tong, hieu, tich, luy thua, thuong
        System.out.println("nhap vao a: ");
        float a=sc.nextFloat();//su dung float nextFloat tra ve kieu du lieu float
        System.out.println("nhap vao b: ");
        float b=sc.nextFloat();//nhu tren
        System.out.println("tong a+b="+(a+b));
        System.out.println("hieu a-b="+(a-b));
        System.out.println("tich a*b="+(a*b));
        System.out.println("luy thua a^b="+Math.pow(a,b));
        System.out.println("thuong a/b="+(a/b));
        
        //BAI TAP KHO
        //Giai phuong trinh bac 2 ax^2+bx+c=0
        System.out.println("nhap he so a: ");
        float a=sc.nextFloat();
        System.out.println("nhap vao he so b: ");
        float b=sc.nextFloat();
        System.out.println("nhao vao hang so c: ");
        float c=sc.nextFloat();
        if(a==0){
            if(b==0 && c!=0){
                System.out.println("Phuong trinh da cho vo nghiem");}
            else if (b==0 && c==0)
                System.out.println("phuong trinh da cho co vo so nghiem");
            }
        else {
         float delta=b*b-4*a*c ; //tinh delta
         float x1;
         float x2;
         //tinh nghiem
         if (delta>0){
              x1=(float)((-b)+Math.sqrt(delta)/(2*a));
              x2=(float)((-b)-Math.sqrt(delta)/(2*a));
             System.out.println("phuong trinh co 2 nghiem la:" + "x1="+x1+ "va x2="+x2); 
         }else if(delta==0){
             x1= (-b/(2*a));
             System.out.println("phuong trinh co nghiem kep:"+ "x1=x2="+x1);
         }else{
             System.out.println("phuong trinh vo nghiem");
         }
        }
    }
             
        
         
        
    
        
    


        
            
            
            
         
            
            
        
                 
                    
                    
            
     
           
        
             
                // TODO code application logic here

   
   
