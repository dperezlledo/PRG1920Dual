/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;

/**
 *
 * @author David
 */
public class Practicos {

    public static void main(String[] args) {
        Practicos p = new Practicos();

        try {
            p.ejemplo2();
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Se ha producido otro error desconocido");
        }

    }

    private void ejemplo1() {
        Scanner t = new Scanner(System.in);
        String num;
        int total;
        try {
            System.out.println("Numero: ");
            num = t.next();
            total = Integer.parseInt(num) + 10;
            System.out.println("Si le sumamos 10 al numero introducido tendremos:" + total);
        } catch (NumberFormatException e) {
            System.out.println("Debe introducir un numero");
        } catch (Exception e) {
            System.out.println("Se ha producido otro error desconocido");
        }
    }

    private void ejemplo2() {
        Scanner t = new Scanner(System.in);
        String num;
        int total;

        System.out.println("Numero: ");
        num = t.next();
        if (Pattern.matches("[a-zA-Z]+", num)) {
            throw new NumberFormatException("Introduzca sólo dígitos numéricos");
        }
        total = Integer.parseInt(num) + 10;
        System.out.println("Si le sumamos 10 al numero introducido tendremos:" + total);

    }

    private void ejemplo3() throws FileNotFoundException {
        File f = new File("c:\\fichero.txt");

        FileInputStream fis = new FileInputStream(f);
    }
}
