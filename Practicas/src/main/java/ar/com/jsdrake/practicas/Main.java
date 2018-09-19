package ar.com.jsdrake.practicas;

import com.sun.org.apache.xml.internal.utils.StringToIntTable;

public class Main {

    public static void main (String [] args){
        final short enteroCorto = 120;
        int enteroNormal = 3023;
        long enteroLargo;
        float decimalCorto = 24.45f;
        double decimalLargo = 23.353534543;
        char caracter = 'a';
        boolean esValido = true;
        enteroNormal = 14 % 3;
        enteroLargo = 500L;

        nuevoTema("Variables y Constantes");
        System.out.println(enteroCorto);
        System.out.println(enteroNormal);
        System.out.println(enteroLargo);
        System.out.println(decimalCorto);
        System.out.println(decimalLargo);
        System.out.println(caracter);
        System.out.println(esValido);

        String[] nombres = new String[  ] {"Jorge", "Mary", "Ricardo", "Claudia" };


       /* System.out.println();
        System.out.println("Arreglos");*/
        nuevoTema("Arreglos");
        System.out.println(nombres[0]);
        System.out.println(nombres[1]);
        System.out.println(nombres[2]);
        System.out.println(nombres[3]);

        /*System.out.println();
        System.out.println("Ciclos y Condiciones");*/
        nuevoTema("Ciclos y Condiciones");
        if (enteroLargo > 1000){

            System.out.println("Es mayor");

        }
        else if (enteroLargo == 500){
            System.out.println("Es igual");
        }
        else {

            System.out.println("No es Mayor");

        }
        /*System.out.println();
        System.out.println("Operador Ternario");*/
        nuevoTema("Operador Ternario");
        System.out.println(enteroCorto > 1000? "Es Mayor" : "No es Mayor")   ;

        /*System.out.println();
        System.out.println("Ciclo For");*/
        nuevoTema("Ciclo For");
        for (int i = 0; i < 3;  i++){

            System.out.println("Posicion " + i);

        }
        System.out.println();
        for (String nombre : nombres){
            System.out.println(nombre);
        }

/*        System.out.println();
        System.out.println("Switch: ");*/
        nuevoTema("Switch");
        int index = (int) (Math.random() * 5);
        String nombreAleatorio = index < 4 ? nombres[index] : "Anonimo";
        System.out.println("El valor de index es " + index);
        switch (nombreAleatorio){
            case    "Jorge":
                System.out.println("Soy Yo");
                break;
            case    "Mary":
            case    "Ricardo":
            case    "Claudia":
                System.out.println("Es " + nombreAleatorio);
                break;
                default:
                    System.out.println("Esta persona no existe en nuestro listado");
        }


    }

    public static void nuevoTema (String title){

        System.out.println("\n=================> " + title + ":");
    }


}
