/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuler6;

/**
 *
 * @author Fernando Baladi
 */
public class ProjectEuler6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num =100;
        long total;
        total = cuadradoSuma(num) - sumaCuadrados(num);
        System.out.println(total);
    }
    
   public static long cuadradoSuma(int num){
        long numero =0, numero2;
        for (int i = 0; i <=num; i++) {
           numero+=i;
        }
        numero2 = numero*numero;
        return numero2;
    }
   public static long sumaCuadrados(int num){
       long numero=0;
       for (long i = 0; i <=num; i++) {
           numero+=(i*i);
       }
       return numero;
   }
}
