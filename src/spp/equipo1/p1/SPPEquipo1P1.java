/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.equipo1.p1;
import java.util.Scanner;
public class SPPEquipo1P1 {
    public static void main(String[] args) {
        
        Scanner kb = new Scanner (System.in);
        double l, gal, cm, in, m, ft, km, mi, cel, far, gr, lb;
        int dec1, dec2, dec3;
        
        System.out.println("Bienvenido al conversor entre el Sistema Metrico y el Sistema Ingles");
        mensaje();
        
        dec1 = kb.nextInt();
        switch (dec1) {
            
            case 1:
                System.out.println("Bienvenido a la categoria de Liquidos");
                mensaje2();
                dec2 = kb.nextInt();
                switch (dec2) {
                    case 1:
                        mensaje3();
                        System.out.println("1. Litros a Galones");
                            dec3 = kb.nextInt();
                            switch (dec3) {
                                case 1:
                                    System.out.println("Introduzca la cantidad a convertir");
                                    l = kb.nextDouble();
                                    gal = l*0.264172;
                                    System.out.println("Galones: " + gal + "gal");
                            }
                        break;
                    case 2:
                        mensaje4();
                        System.out.println("1. Galones a Litros");
                            dec3 = kb.nextInt();
                            switch (dec3) {
                                case 1:
                                    System.out.println("Introduzca la cantidad a convertir");
                                    gal = kb.nextDouble();
                                    l = gal*3.7854118;
                                    System.out.println("Litros: " + l + "L");
                            }
                        break;
                }
                break;
            case 2:
                System.out.println("Bienvenido a la categoria de Distancias");
                mensaje2();
                dec2 = kb.nextInt();
                switch (dec2) {
                    case 1:
                        mensaje3();
                        System.out.println("1. Centimetros a Pulgadas");
                        System.out.println("2. Metros a Pies");
                        System.out.println("3. Kilometros a Millas");
                        dec3 = kb.nextInt();
                            switch (dec3) {
                                case 1:
                                    System.out.println("Introduzca la cantidad a convertir");
                                    cm = kb.nextDouble();
                                    in = cm/2.54;
                                    System.out.println("Pulgadas: " + in);
                                case 2:
                                    System.out.println("Introduzca la cantidad a convertir");
                                    m = kb.nextDouble();
                                    ft = m/0.3048;
                                    System.out.println("Pies: " + ft);
                                case 3:
                                    System.out.println("Introduzca la cantidad a convertir");
                                    km = kb.nextDouble();
                                    mi = km*0.62137;
                                    System.out.println("Millas: " + mi);
                            }
                        break;
                    case 2:
                        mensaje4();
                        System.out.println("1. Pulgadas a Centimetros");
                        System.out.println("2. Pies a Metros");
                        System.out.println("3. Millas a Kilometros");
                        dec3 = kb.nextInt();
                            switch (dec3) {
                                case 1:
                                    System.out.println("Introduzca la cantidad a convertir");
                                    in = kb.nextDouble();
                                    cm = in*2.54;
                                    System.out.println("Centimetros:" + cm);
                                case 2:
                                    System.out.println("Introduzca la cantidad a convertir");
                                    ft = kb.nextDouble();
                                    m = ft*0.3048;
                                    System.out.println("Metros: " + m);
                                case 3:
                                    System.out.println("Introduzca la cantidad a convertir");
                                    mi = kb.nextDouble();
                                    km = mi*1.609344;
                                    System.out.println("Kilometros: " + km);
                            }
                        break;
                }
                break;
            case 3:
                System.out.println("Bienvenido a la categoria de Temperaturas");
                mensaje2();
                dec2 = kb.nextInt();
                switch (dec2) {
                    case 1:
                        mensaje3();
                        System.out.println("1. Celsius a Farenheit");
                        dec3 = kb.nextInt();
                            switch (dec3) {
                                case 1:
                                    System.out.println("Introduzca la cantidad a convertir");
                                    cel = kb.nextDouble();
                                    far = (cel/.55)+32;
                                    System.out.println("Farenheit: " + far + "°F");       
                            }
                        break;
                    case 2:
                        mensaje4();
                        System.out.println("1. Farenheit a Celsius");
                        dec3 = kb.nextInt();
                            switch (dec3) {
                                case 1:
                                    System.out.println("Introduzca la cantidad a convertir");
                                    far = kb.nextDouble();
                                    cel = (far - 32)/(1.8);
                                    System.out.println("Celsius: " + cel + "°C");
                            }
                        break;
                }
                break;
            case 4:
                System.out.println("Bienvenido a la categoria de Pesos");
                mensaje2();
                dec2 = kb.nextInt();
                switch (dec2) {
                    case 1:
                        mensaje3();
                        System.out.println("1. Gramos a Libras");
                        dec3 = kb.nextInt();
                            switch (dec3) {
                                case 1:
                                    System.out.println("Introduzca la cantidad a convertir");
                                    gr = kb.nextDouble();
                                    lb = gr*0.0022046;
                                    System.out.println("Libras: " + lb);
                            }
                        break;
                    case 2:
                        mensaje4();
                        System.out.println("1. Libras a Gramos");
                        dec3 = kb.nextInt();
                            switch (dec3) {
                                case 1:
                                    System.out.println("Introduzca la cantidad a convertir");
                                    lb = kb.nextDouble();
                                    gr = lb/0.0022046;
                                    System.out.println("Gramos: " + gr);       
                            }  
                        break;
                }
                break;
        }   
        }
        public static void mensaje(){
            System.out.println("Seleccionar la categoria deseada");
            System.out.println("1. Liquidos");
            System.out.println("2. Distancias");
            System.out.println("3. Temperaturas");
            System.out.println("4. Pesos");
        }
        public static void mensaje2(){
            System.out.println("Seleccionar la categoria deseada");
            System.out.println("1. Sistema Metrico a Sistema Ingles");
            System.out.println("2. Sistema Ingles a Sistema Metrico");
        }
        public static void mensaje3(){
            System.out.println("Sistema Metrico a Sistema Ingles");
            System.out.println("Porfavor introduzca la unidad deseada");
        }
        public static void mensaje4(){
            System.out.println("Sistema Ingles a Sistema Metrico");
            System.out.println("Porfavor introduzca la unidad deseada");
        }
}