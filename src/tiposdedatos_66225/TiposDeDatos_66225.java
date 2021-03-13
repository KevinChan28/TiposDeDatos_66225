/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposdedatos_66225;

/**
 *
 * @author Kevin Chan
 */
public class TiposDeDatos_66225 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        byte minbyte = -128;
        byte maxbyte = 127;
        short minshort = -32768;
        short maxshort = 32767;
        int minint = -2147483648;
        int maxint = 2147483647;
        long minlong = -9223372036854775808L;
        long maxlong = 9223372036854775807L;
        double mindouble = Double.MIN_VALUE;
        double maxdouble = Double.MAX_VALUE;
        
        System.out.println("Tipo\tMínimo\tMáximo");
        System.out.println("byte\t" + minbyte + "\t" + maxbyte);
        System.out.println("short\t" + minshort + "\t" + maxshort);
        System.out.println("int\t" + minint + "\t" + maxint);
        System.out.println("long\t" + minlong + "\t" + maxlong);
        System.out.println("double\t" + mindouble + "\t" + maxdouble);
        System.out.println("double\t" + Double.MIN_VALUE + "\t" + Double.MAX_VALUE);
        // TODO code application logic here
    }
    
}
