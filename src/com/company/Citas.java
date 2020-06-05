package com.company;


import java.time.LocalTime;

import java.util.*;


import java.time.LocalDate;




public class Citas {

    private Scanner sc = new Scanner(System.in);private String[] nombre = new String[11];

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
        System.out.println("Introdusca la hora (hh:mm).");Scanner sc = new Scanner(System.in);
        String ingresarHora;LocalTime hora = null;
        boolean salir = false;while(!salir){
            try{
                ingresarHora = sc.nextLine();hora = LocalTime.parse(ingresarHora);salir = true;
            }catch(Exception ex){
                System.out.println("porfavor ingrese una hora valida"); } }return hora;
    }

    public void agendandoCita()
    {
        cont++;
        if (cont > 9) { System.out.println("Ya no tenemos cupos disponible , lo sentimos");
        }else {
            estado[cont] = "Cita Activa";
            horas[cont] = pedirHora();fechas[cont] = pedirFecha();
            System.out.println("escriba el nombre del cliente");nombre[cont] = sc.next();
            System.out.println("cual es nombre de la mascota?");nombreMascota[cont] = sc.next(); }
        System.out.println("la hora de la cita es "+horas[cont] +" en la fecha " + fechas[cont]);
        System.out.println("el numero de cita correspondiente es: " + cont);
    }
    public void asignandoreagendarCita()
    { Scanner sc = new Scanner(System.in);
        System.out.println("cual es el numero de cita");int numCita = sc.nextInt();
        System.out.println("su cita corresponde a :");System.out.println("Nombre cliente: "+nombre[numCita]);
        System.out.println("Nombre mascota: "+nombreMascota[numCita]);System.out.println("Fecha: "+ fechas[numCita]);
        System.out.println("Hora: "+ horas[numCita]); System.out.println("Quiere volver a agendar su cita?(S/N)");
        int x = 0;
        while(x == 0){
            String confirmacion = sc.next();
            if(confirmacion.equals(positivo)){
                fechas[numCita] = pedirFecha();horas[numCita] = pedirHora();
                System.out.println("Su cita se ha reagendado con exito muchas gracias");
                x = 1;
            }else{ if (confirmacion.equals(negativo)){
                System.out.println("Error Su cita actual no puede ser reagendada");
                x = 1; }else{ System.out.println("Ingrese un valor que sea valido");
                } }
        }
    }
    public void cancelarCita()
    { Scanner sc = new Scanner(System.in);System.out.println("introduzca el numero de cita para cancelarlo");
    int numCita = sc.nextInt();
        System.out.println("la cita seleccionada es :");
        System.out.println("Nombre cliente: "+nombre[numCita]);System.out.println("Nombre mascota: "+nombreMascota[numCita]);
        System.out.println("Fecha: "+ fechas[numCita]);System.out.println("Hora: "+ horas[numCita]);System.out.println("¿Desea anular totalmente esta cita?(S/N)");
        int x = 0;
        while (x == 0){
            String confirmacion = sc.next();
            if (confirmacion.equals(positivo)){
                estado[numCita] = "Cancelado"; System.out.println("la cita se cancelo");
                x = 1;
            }else{
                if (confirmacion.equals(negativo)) { System.out.println("Su cita no sera cancelada");
                x = 1; } else{ System.out.println("Ingrese un valor que sea valido");
                }
            }
        }
    }
    public void mostrarCitas()
    {
        if (cont == 0){
            System.out.println("No se a podido agendar unacita");
        }else {
            for (int i = 1; i < (cont + 1); i++) { System.out.println("Cita No " + i);System.out.println("Estado: " + estado[i]);
                System.out.println("cliente: " + nombre[i]);System.out.println("mascota: " + nombreMascota[i]);
                System.out.println("Fecha: " + fechas[i]);System.out.println("Hora: " + horas[i]);
            }
        }
    }

}
