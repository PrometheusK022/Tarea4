/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author danif
 */
package PEED4;

public class Main { 

    public static void main(String[] args) {

        Emonedero mimonedero;

        mimonedero = global_monedero();

        try 

        {

            mimonedero.pagar(200);

        } catch (Exception e)

        {

            System.out.print("No se puede pagar  ");

        }

        try

        {

            System.out.println("Debes recargar monedero");

            mimonedero.recargar(300);

        } catch (Exception e)

        {

            System.out.print("Error al recargar");

        }

        double saldo_disponible = mimonedero.efectivo();

        System.out.println("El efectivo del monedero es  "+ saldo_disponible );

    }

    public static Emonedero global_monedero() {
        Emonedero mimonedero;
        double dinero;
        mimonedero = new Emonedero("Nombre y apellidos del Alumno",1000, "dni del alumno");
        return mimonedero;
    }

}
