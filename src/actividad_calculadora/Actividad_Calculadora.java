
package actividad_calculadora;

import java.util.Scanner;


public class Actividad_Calculadora {

     public static void encabezado() {
            
            System.out.println(" ============================================================== ");
            System.out.println(" ============== Universidad Autonoma de Campeche ============== ");
            System.out.println(" ============================================================== ");
            System.out.println(" =================== Facultad de Ingenieria =================== ");
            System.out.println(" ============================================================== ");
            System.out.println(" =========== Ingenieria en Sistemas Computacionales =========== ");
            System.out.println(" ============================================================== ");
            System.out.println(" ===================== 11 de mayo del 2021 ==================== ");
            System.out.println ("");  
            }
       
      
    
     public static void main(String[] args) {
          
         encabezado();
          
           Scanner entrada = new Scanner(System.in);
          
          int valor1, valor2; 
          
          System.out.println ("");  
          System.out.println(" ============================================================== ");
          System.out.println(" ===================== Calculadora basica ===================== "); 
          System.out.println(" ============================================================== ");
          System.out.println ("");  
          System.out.println (" Escoge la operacion que desee:");  
          System.out.println ("");  
          System.out.println (" [0] Suma");  
          System.out.println (" [1] Resta ");
          System.out.println (" [2] Multiplicar" );
          System.out.println (" [3] Dividir" );
          
          int opcion = entrada.nextInt();
          
          System.out.println (" Ingrese el primer valor:");  
          
          valor1 = entrada.nextInt();
          
          System.out.println (" Ingrese el segundo valor:");   
          valor2 = entrada.nextInt();
          
          
          Calculadora Calc = new Calculadora(valor1, valor2); 
          
          int suma = Calc.suma(); 
          
          int resta = Calc.resta(); 
          
         int multiplicar = Calc.multiplicar();
          
          double division = Calc.division(); 
                        
                  
           switch (opcion) {
               
                case 0:
                        System.out.println("El resultado de la suma es: " + suma);
                break;
                
                case 1:
                        System.out.println("El resultado de la resta es: " + resta);
                break;
                       
                case 2:
                       System.out.println("El resultado de la multiplicacion: " + multiplicar);
                    break;   
                   
                case 3:
                       System.out.println("El resultado de la divsion es: " + division);
                    break;     
                    
                  default: 
                     System.out.println("Introduzca un valor de operacion correcto");
                       
                
           }
     }
}
           
        