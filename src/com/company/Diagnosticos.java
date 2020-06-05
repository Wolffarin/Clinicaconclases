package com.company;



import java.util.Scanner;




public class Diagnosticos {





    private String[] nombreMascotaDagnostico = new String[11];
    private String[] diagnostico = new String[11];private int cont2 = 0;
    private String positivo = "S"; private String negativo = "N";
    private String[] nombreDiagnostico = new String[11];
    private Scanner sc = new Scanner(System.in);public static String diagnostico(){
        Scanner sc = new Scanner(System.in); sc.useDelimiter("\n");

        System.out.println("a continuacion ingrese el diagnostico");
        String cadena = sc.nextLine();return cadena;
    }

    public void registrarDiagnostico()
    {cont2++;
    System.out.println("nombre del cliente.");
    nombreDiagnostico[cont2] = sc.next();
    System.out.println("nombre de la mascota del cliente por favor.");
    nombreMascotaDagnostico[cont2] = sc.next();
    diagnostico[cont2] = diagnostico();
    System.out.println("su diagnostico es el numero: " + cont2);
    }
    public void mostrarDiagnosticos()
    { if (cont2 == 0)
        { System.out.println("No hay ningun diagnostico por ver");
        }else { for (int i = 1; i < (cont2 + 1); i++) {
                System.out.println("diagnostico numero: " + i); System.out.println("Nombre del cliente: " + nombreDiagnostico[i]);
                System.out.println("el nombre de la mascota es: " + nombreMascotaDagnostico[i]); System.out.println("ultimo Diagnostico: " + diagnostico[i]);
            }
        }
    }


    public void eliminarDiagnostico()
    {
        System.out.println("Que diagnostico quiere eliminar");
        int numDiag = sc.nextInt();
        System.out.println("El diagnostico corresponde a:");System.out.println("que Cliente?: " + nombreDiagnostico[numDiag]);
        System.out.println("que Mascota?: "+ nombreMascotaDagnostico[numDiag]);System.out.println("Con este diagnostico: " + diagnostico[numDiag]);
        System.out.println("¿Desea eliminar este diagnostico?(S/N)");
        String confirmacion = sc.next();
        if (confirmacion.equals(positivo)){ diagnostico[numDiag] = "el diagnostico ingresado no existe";
        System.out.println("El diagnostico ha sido eliminado.");
        if (confirmacion.equals(negativo))
            { System.out.println("Error El diagnostico no puede ser eliminado");
            }else{ System.out.println("Ingrese un valor valido"); } }
    }

    public void modificarDiagnostico() {
        System.out.println("cual es el numero del diagnostico que va a modificar");int numDiag = sc.nextInt();
        System.out.println("este diagnostico corresponde a:");System.out.println("Cliente: " + nombreDiagnostico[numDiag]);
        System.out.println("Mascota: " + nombreMascotaDagnostico[numDiag]);System.out.println("con eldiagnostico: " + diagnostico[numDiag]);
        System.out.println("¿quiere cambiar este diagnostico?(S/N)");
        int x = 0;while (x == 0) {
            String confirmacion = sc.next();
            if (confirmacion.equals(positivo)) {
                diagnostico[numDiag] = diagnostico();System.out.println("El diagnostico fue modificado");
                x = 1;
            } else {
                if (confirmacion.equals(negativo)) {
                    System.out.println("error el diagnóstico no puede ser cambiado");
                    x = 1;
                } else {
                    System.out.println("Ingrese un valor valido");
                }
            }
        }
    }
}
