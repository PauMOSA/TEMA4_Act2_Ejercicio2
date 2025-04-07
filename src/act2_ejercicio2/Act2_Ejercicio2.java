/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package act2_ejercicio2;
import java.util.Scanner;
/**
 *
 * @GLORIA PAULINA MORENO SALDIVAR
 */
public class Act2_Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner asignar = new Scanner(System.in);
        int Contador, numero, mayor=0, menor=0, igual=0;
        
        System.out.print("Cuantos numeros deseas ingresar");
        Contador = asignar.nextInt();
        
        for(int i = 0; i < Contador; i++)
        {
            System.out.println("Ingresa el numero " +i+":");
            numero = asignar.nextInt();
            if (numero > 0)
            {
                mayor++;
            }
            else if (numero == 0)
            {
                igual++;
            }
            else
            {
                menor++;
            }
        }
        
        System.out.println("Se ingresaron "+mayor+" numeros mayores a 0.");
        System.out.println("Se ingresaron "+igual+" numeros iguales a 0.");
        System.out.println("Se ingresaron "+menor+" numeros menores a 0.");
    }
    
}
