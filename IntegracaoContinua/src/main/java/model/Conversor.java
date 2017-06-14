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
    
    public String converterBinario(String string){
        byte[] bytes = string.getBytes();  
        String[] binarios = new String[bytes.length];  
        String binario = "";
        for (int i=0; i < bytes.length; i++) {  
            binarios[i]= Integer.toBinaryString(bytes[i]);
        }  
        for (String aux : binarios) {
            binario += aux;
        }
        return binario;
    }
    
    public String converterHexadecimal(String string){
        String aux = "";
        for (char c : string.toCharArray()) {  
            aux += Integer.toHexString(c);
        }  
        return aux;
    }
    
    public String converterHexadecimal(int a){
        return Integer.toHexString(a);
    }
}
