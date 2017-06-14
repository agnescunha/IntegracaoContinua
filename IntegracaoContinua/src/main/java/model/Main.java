/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


/**
 *
 * @author marce
 */
public class Main {
    public static void main(String[] args){
        Conversor criptografia = new Conversor();
        System.out.println(criptografia.criptografar("estou testando uma frase"));
    }
}
