package com.company;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;

public class Citas {

    private Scanner sc = new Scanner(System.in);

    private String[] nombre = new String[11];

    private String negativo = "N";

    private String[] nombreMascota = new String[11];

    private int cont = 0;

    private String positivo = "S";

    private LocalTime[] horas = new LocalTime[11];

    private String[] estado = new String[11];

    private LocalDate[] fechas = new LocalDate[11];


    public static LocalDate pedirFecha() {
        System.out.println("Introduzca el año , el mes y el dia");Scanner sc = new Scanner(System.in);
        String ingresarFecha;LocalDate fecha = null;
        boolean salir = false;while (!salir){
            try{ ingresarFecha = sc.nextLine();fecha = LocalDate.parse(ingresarFecha);salir = true;
            } catch (Exception ex)
            {
                System.out.println("Ingrese su formato con una - entre los datos");
            }
        }return fecha;

    }
    public static LocalTime pedirHora(){
        System.out.println("Introdusca la hora a la que asistira a la cita en formato de 24 horas (hh:mm).");
        Scanner sc = new Scanner(System.in);
        String ingresarHora;
        LocalTime hora = null;
        boolean salir = false;
        while(!salir){
            try{
                ingresarHora = sc.nextLine();
                hora = LocalTime.parse(ingresarHora);
                salir = true;
            }catch(Exception ex){
                System.out.println("El formato de la hora ingresada es incorrecto, porfavor ingrese una hora valida");
            }
        }

        return hora;
    }

    public void agendandoCita()
    {
        cont++;
        if (cont > 9) {
            System.out.println("Ya no hay cupo para mas citas");

        }else {
            estado[cont] = "Activa";
            fechas[cont] = pedirFecha();
            horas[cont] = pedirHora();
            System.out.println("Ingrese el nombre del cliente");
            nombre[cont] = sc.next();
            System.out.println("Ingrese el nombre de la mascota del cliente");
            nombreMascota[cont] = sc.next();
        }
        System.out.println("Cita agendada para " + fechas[cont] +" a las "+horas[cont]);
        System.out.println("Su numero de cita es: " + cont);
    }

    public void asignandoreagendarCita()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor introduzca el numero de cita");
        int numCita = sc.nextInt();
        System.out.println("La cita escogida presenta los siguientes datos:");
        System.out.println("Fecha: "+ fechas[numCita]);
        System.out.println("Hora: "+ horas[numCita]);
        System.out.println("Nombre cliente: "+nombre[numCita]);
        System.out.println("Nombre mascota: "+nombreMascota[numCita]);

        System.out.println("¿Desea reagendar esta cita?(S/N)");
        int x = 0;
        while(x == 0){
            String confirmacion = sc.next();
            if(confirmacion.equals(positivo)){
                fechas[numCita] = pedirFecha();
                horas[numCita] = pedirHora();
                System.out.println("----------------------------------");
                System.out.println("Su cita se ha reagendado");
                System.out.println("----------------------------------");
                x = 1;
            }else{
                if (confirmacion.equals(negativo)){
                    System.out.println("----------------------------------");
                    System.out.println("Su cita no sera reagendada");
                    System.out.println("----------------------------------");
                    x = 1;
                }else{
                    System.out.println("Ingrese un valor valido");
                }
            }
        }

    }
    public void cancelarCita()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor introduzca el numero de cita que desea cancelar");
        int numCita = sc.nextInt();
        System.out.println("La cita escogida presenta los siguientes datos:");
        System.out.println("Fecha: "+ fechas[numCita]);
        System.out.println("Hora: "+ horas[numCita]);
        System.out.println("Nombre cliente: "+nombre[numCita]);
        System.out.println("Nombre mascota: "+nombreMascota[numCita]);
        System.out.println("¿Desea cancelar esta cita?(S/N)");
        int x = 0;
        while (x == 0){
            String confirmacion = sc.next();
            if (confirmacion.equals(positivo)){
                estado[numCita] = "Cancelado";
                System.out.println("----------------------------------");
                System.out.println("Su cita ha sido cancelada.");
                System.out.println("----------------------------------");
                x = 1;
            }else{
                if (confirmacion.equals(negativo))
                {
                    System.out.println("----------------------------------");
                    System.out.println("Su cita no sera cancelada");
                    System.out.println("----------------------------------");
                    x = 1;
                } else{
                    System.out.println("Ingrese un valor valido");
                }
            }
        }

    }

    public void mostrarCitas()
    {
        if (cont == 0){
            System.out.println("No se ha agendado ninguna cita");
            System.out.println("");
        }else {
            for (int i = 1; i < (cont + 1); i++) {
                System.out.println("____________________________________________");
                System.out.println("Cita numero " + i);
                System.out.println("Fecha: " + fechas[i]);
                System.out.println("Hora: " + horas[i]);
                System.out.println("Nombre del cliente: " + nombre[i]);
                System.out.println("Nombre de la mascota: " + nombreMascota[i]);
                System.out.println("Estado de la cita: " + estado[i]);
                System.out.println("____________________________________________");
                System.out.println("");
            }
        }
    }

}
