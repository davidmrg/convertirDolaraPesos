/*
Se requiere programa que recibe una cant en dólares e imprime la cantidad convertida a pesos
 */


import java.util.Scanner;

/**
 *
 * @author David Ramirez
 */
public class ConvertirDolarPeso {

    public static void main(String[] args) {
        
        //Implementamos clase Scanner, la inicializamos con el objeto sc.
        Scanner sc = new Scanner(System.in);
        
        float cantDolares;
        float dolarEnPesos;
        float conversion;
        
        System.out.println("Ingrese precio del dolar: ");
        dolarEnPesos = sc.nextFloat();
        
        System.out.println("Ingrese cantidad de dolares a convertir: ");
        cantDolares = sc.nextFloat();
        
        conversion = cantDolares * dolarEnPesos;
        
        System.out.println(cantDolares + " dolares son " + conversion + " pesos");
                
    }
    
}
