package Teclat;

import java.util.Scanner;

public class Teclat {


    public static String llegirString(){
        return new Scanner(System.in).nextLine();

    }


    public static int llegirInt() {
            String entrada = llegirString();
            return Integer.parseInt(entrada.trim());
        }

    }

