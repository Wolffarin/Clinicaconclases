package com.company;


import java.util.InputMismatchException;




import java.util.Scanner;


public class Main {





    public static void main(String[] args) {
        Diagnosticos diagnostico = new Diagnosticos();Citas cita = new Citas();menu1 menu = new menu1();Scanner sc = new Scanner(System.in);
        boolean salir = false;
        while(!salir) {
            menu.menufirst();

            try { int opcion = sc.nextInt();
                switch (opcion) { case 1:
                        boolean salir2 = false;
                        while (!salir2)

                        // menu de citas
                        { menu.menuCitas();
                            try { int opcion1 = sc.nextInt();
                                switch (opcion1) {
                                    case 1:
                                        cita.agendandoCita();
                                        break;
                                        case 2:
                                        cita.asignandoreagendarCita();
                                        break;
                                        case 3:
                                        cita.cancelarCita();
                                        break;
                                        case 4:
                                        salir2 = true;
                                        break;
                                        default:
                                        System.out.println(" numero valido por favor");
                                }
                            }catch (InputMismatchException e) { System.out.println(" numero valido por favor");sc.next();
                            } }break;
                    case 2:   boolean salir3 = false;
                        while (!salir3)
                        // menu de Diagnosticos obtenidos
                        {
                            menu.menuDiagnostico();
                            try {
                                int opcion2 = sc.nextInt();switch (opcion2) {
                                    case 1:
                                        diagnostico.registrarDiagnostico();
                                        break;
                                        case 2:
                                        diagnostico.modificarDiagnostico();
                                        break;
                                        case 3:
                                        diagnostico.eliminarDiagnostico();
                                        break;
                                        case 4:
                                        salir3 = true;
                                        break;
                                        default:
                                        System.out.println("numero valido porfavor");
                                        break; } }
                            catch (InputMismatchException e) { System.out.println("numero valido por favor");sc.next();
                            } }
                        break;
                    case 3:
                        boolean salir4 = false;
                        while (!salir4) {
                            menu.menuReportes();
                            try { int opcion3 = sc.nextInt();
                                switch (opcion3) {
                                    case 1:
                                        cita.mostrarCitas();
                                        break;
                                        case 2:
                                        diagnostico.mostrarDiagnosticos();
                                        break;
                                        case 3:
                                        salir4 = true;
                                        break;
                                        default:
                                        System.out.println("Ingrese un numero valido");
                                        break;
                                } } catch (InputMismatchException e) {
                                System.out.println("Ingrese un numero valido");sc.next();
                            }
                        }
                        break; case 4: salir = true;
                        break; default:
                        break; } }catch(InputMismatchException e)
            {
                System.out.println("numero valido por favor");sc.next();

            }
        }


    }
}
