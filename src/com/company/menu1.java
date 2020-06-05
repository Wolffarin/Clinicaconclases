package com.company;

public class menu1 {
    public static void menufirst()
    {
        System.out.println("Clinica Amigo Fiel");System.out.println("1. Citas");
        System.out.println("2.Diagnosticos");System.out.println("3. Reportes");System.out.println("4. Salir ");
        System.out.print("Su Eleccion es:");
    }

    public static void menuCitas()
    {
        System.out.println("Elija por favor");System.out.println("1. Agendar Cita");
        System.out.println("2. ReAgendar Cita");System.out.println("3. Cancelar");System.out.println("4. De vuelta al menu Principal");System.out.print("Su eleccion es: ");
    }
    public static void menuDiagnostico()
    {
        System.out.println("Elija por favor");System.out.println("1. Registrar Diagnostico");
        System.out.println("2. Modificar  Diagnostico");System.out.println("3. Eliminar Diagnostico");
        System.out.println("4. Volver al menu Principal");System.out.print("Su Eleccion es: ");
    }
    public void menuReportes()
    {
        System.out.println("Elija una opcion");System.out.println("1. Reporte de Citas");
        System.out.println("2. Reporte de Diagnosticos");System.out.println("3. Menu Principal");System.out.print("Su Eleccion es: ");
    }
}

