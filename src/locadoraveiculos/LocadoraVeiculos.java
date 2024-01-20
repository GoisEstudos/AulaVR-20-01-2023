/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package locadoraveiculos;

import objetos.Seguradora;

/**
 *
 * @author rafael-vieira
 */
public class LocadoraVeiculos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Seguradora objSeguradora = new Seguradora(0);
        objSeguradora.setCnpj("12.345.678/0001-00");
        System.out.println(objSeguradora.getCnpj());
    }
    
}
