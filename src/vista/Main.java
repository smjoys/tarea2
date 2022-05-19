package vista;

import kdtree.KDTree;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        KDTree arbol = new KDTree();
        Scanner keypad = new Scanner(System.in);
        // ejemplo valores improvisados
        arbol.insertar(45,70,3);
        arbol.insertar(12,20,5);
        arbol.insertar(30,45,7);
        arbol.insertar(30,80,2);
        arbol.insertar(11,25,4);
        arbol.insertar(35,60,9);
        arbol.insertar(60,70,1);
        arbol.insertar(55,108,6);
        arbol.insertar(20,80,8);
        arbol.insertar(40,70,10);
        //menu improvisado
        int opcion;
        System.out.println(".......:MENU:.......");
        System.out.println("Bienvenido al programa");
        System.out.println("¿desea ingresar a un individuo?");
        System.out.println("1) si");
        System.out.println("2) no");
        System.out.print(">>");
        opcion = keypad.nextInt();
        if (opcion == 1){
            int decision;
            do {
                System.out.print("ingrese la edad: ");
                int edad = keypad.nextInt();
                System.out.println(" ");
                System.out.print("ingrese el peso: ");
                int peso = keypad.nextInt();
                System.out.println(" ");
                System.out.println("RECUERDE QUE FACTOR DEBE SER IGUAL O MAYOR QUE CERO Y SI ES DECIMAL DEBE LLEVAR COMA NO PUNTO");
                System.out.print("ingrese factor: ");
                float factor = keypad.nextFloat();
                arbol.insertar(edad,peso,factor);
                System.out.println("¿desea agregar mas individuos?");
                System.out.println("1) si");
                System.out.println("2) no");
                System.out.print(">>");
                decision = keypad.nextInt();
            }while (decision != 2);
        }
        System.out.println(".....:PROBLEMA 1:.....");
        System.out.print("ingrese la edad a buscar: ");
        int edad = keypad.nextInt();
        System.out.print("ingrese el peso a buscar: ");
        int peso = keypad.nextInt();
        float factor = arbol.factor(edad,peso);
        if ( factor != -1) {
            System.out.print("el factor asociando es: ");
            System.out.println(factor);
        }else System.out.println("valor no encontrado");
    }

}
