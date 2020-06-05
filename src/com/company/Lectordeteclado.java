package com.company;
import java.util.Scanner;

class LectorTeclado {
    private static LectorTeclado instance;
        private Scanner m_SC;
        public static LectorTeclado getInstance()
        { if(instance == null)
            { instance = new LectorTeclado();
            }return instance; }


        public double obtenerEnteroValidado(String mensajeReintento)
        { double retval = 0;
        while (!m_SC.hasNextDouble())
            { m_SC.next();
            System.out.println(mensajeReintento);
            } retval = m_SC.nextDouble();
            return retval;
        }
        public float obtenerNumerof()
        { return 0.0f; }
        public float obtenerNumeroValidadof()
        { return 0.0f; }

        public double obtenerNumero()
        { return 0.0; }

        public double obtenerNumeroValidado()
        { return 0.0; }
    LectorTeclado()
    { m_SC = new Scanner(System.in); }

    public int obtenerEntero(int valorPorDefecto, String mensaje)
    {
        int retval = valorPorDefecto;
        try
        { retval = m_SC.nextInt();
        }
        catch (Exception e)
        { System.out.println(mensaje);
        }
        return retval;
    }

}

