/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


/**
 *
 * @author Agnes Cunha
 */
public class Main {
    public static void main(String[] args){
        Conversor conversor = new Conversor();
        System.out.println("minha frase em binario: "+conversor.converterBinario("estou testando uma frase"));
                
        System.out.println("valor de 16 em hexadecimal é "+conversor.converterHexadecimal(16));
        
        System.out.println("minha frase em hexadecimal: "+conversor.converterHexadecimal("trabalho chato"));
        
    }
}
