/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equação2grau;

import java.util.Scanner;

public class Equação2grau {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        System.out.println ("Informe o valor de A");
        double A = entrada.nextDouble();
        System.out.println ("Informe o valor de B");
        double B = entrada.nextDouble();
        System.out.println ("Informe o valor de C");
        double C = entrada.nextDouble();
        
        double X1;
        double X2;
        
        if (A != 0)
        {
             double delta = Math.pow(B, 2) - (4 * A * C);
             
             if (delta > 0)
             {
                 X1 = ((-B) + Math.sqrt(delta)) / (2 * A);
                 X2 = ((-B) - Math.sqrt(delta)) / (2 * A);
                 System.out.println ("x': " + X1 + " x'': " + X2);
             }
             else
             {
                 if (delta == 0)
                 {
                     X1 = ((-B) + Math.sqrt(delta)) / (2 * A);
                     System.out.println ("x':" + X1);
                 }
                 else
                 {
                     if (delta < 0)
                     {
                         System.out.println ("A Equação não possui resultados reais");
                     }
                 }
             }
        }
    }
    
}
