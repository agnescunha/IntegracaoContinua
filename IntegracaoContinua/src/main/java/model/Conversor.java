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
public class Conversor {
    
    /*
    Recebe um texto qualquer e o converte para binario 
    e o atribui a uma string para retorno
    */
    public String converterBinario(String string){
        //passa o texto para byte
        byte[] bytes = string.getBytes();
        //cria um array de string para receber os binarios
        String[] binarios = new String[bytes.length];  
        //variavel que ira formular o retorno
        String binario = "";
        //faz a conversao para binario adicionando-o em um array
        for (int i=0; i < bytes.length; i++) {  
            binarios[i]= Integer.toBinaryString(bytes[i]);
        }  
        //passa o array a uma unica string
        for (String aux : binarios) {
            binario += aux;
        }
        return binario;
    }
    
    /*
    Recebe um texto qualquer e o converte para Hexadecimal 
    e o atribui a uma string para retorno
    */
    
    public String converterHexadecimal(String string){
        //variavel para retorno
        String aux = "";
        //faz a conversao já atribuindo a variavel de retorno
        for (char c : string.toCharArray()) {  
            aux += Integer.toHexString(c);
        }  
        return aux;
    }
    
    /*
    Recebe um numero e retorna seu equivalente em hexadecimal
    */
    public String converterHexadecimal(int a){
        return Integer.toHexString(a);
    }
}
