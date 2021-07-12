package javaa;

import java.util.Scanner;


public class num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner num = new Scanner(System.in);
        int numero1;
        System.out.print("Introduce el primer número: ");                                                         
        numero1 = num.nextInt();
        int numero2;
        System.out.print("Introduce el segundo número: ");                                                         
        numero2 = num.nextInt();
        int numero3;
        System.out.print("Introduce el tercer número: ");                                                         
        numero3 = num.nextInt(); 
        
        System.out.print("Los números ordenados de mayor a menor son: ");
        
        ordenar( numero1, numero2, numero3);
        
	}
public static void ordenar(int numero1, int numero2, int numero3) {
       if(numero1 < numero2) {
           if(numero1 < numero2) {
               if(numero2 < numero3) {
                   System.out.println("" + numero3 + " " + numero2 + " " + numero1);
               }else {
                   System.out.println("" + numero1 + " " + numero3 + " " + numero2);      
               }
           }else {
               System.out.println("" + numero2 + " " + numero1 + " " + numero3); 
           }
       }else {
           if(numero2  < numero3) {
               if(numero1 < numero3) {
                   System.out.println("" + numero3 + " " + numero1 + " " + numero2);
               }else {
                   System.out.println("" + numero1 + " " + numero3 + " " + numero2); 
               }              
           }else {
               System.out.println("" + numero1 + " " + numero2 + " " + numero3);
                
           }
       }
   }
}

 



  
