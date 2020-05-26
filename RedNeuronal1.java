/*
*Implemente un algoritmo que permita:
1).Desplegar el nombre del proyecto de su paper.
2). Qué es una red neuronal.
3). Cuáles son los elementos que forman una red neuronal.
4). Cómo utilizaron la red neuronal en el proyecto que usted ah seleccionado.
5). Cómo utilizaria usted la red neuronal como mejoramiento al proyecto propuesto.
6). En que consistió el entrenamiento utilizando la red neuronal,
    e indique el algoritmo utilizado.

 */
package redneuronal1;

/**
 
 * @author: Ana Graciela Pico Solis 
 */
import java.util.Scanner;
public class RedNeuronal1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner objeto=new Scanner(System.in);//new, reserva espacio de memoria
         
         System.out.println("Ingrese el tema de su paper");
         String tema=objeto.nextLine();
         
         System.out.println("¿Qué es una red neuronal?");
         String redneuronal=objeto.nextLine();
         
         System.out.println("Cúales son los elementos que forma una red neuroal:");
         String elementos=objeto.nextLine();
         
         System.out.println("¿Cómo utilizaron la red neuronal en el proyecto que usted ah seleccionado?");
         String utilizaron=objeto.nextLine();
         
         System.out.println("¿Cómo utilizaria usted la red neuronal como mejoramiento al proyecto propuesto?");
         String utilizaria=objeto.nextLine();
         
         System.out.println("¿En que consistió el entrenamiento utilizando la red neuronal, e indique el algoritmo utilizado?");
         String entrenamiento=objeto.nextLine();
         
         
         System.out.println("Algoritmo utilizado");
         
        
         
    }
    
}
