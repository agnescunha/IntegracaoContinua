/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.rmi.RemoteException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/**
 *
 * @author marce
 */
public class Conversor {
    
    public String converterBinario(String string){
        byte[] bytes = string.getBytes();  
        String[] binarios = new String[bytes.length];  
        String binario = "";
        // jogando prum array de string  
        for (int i=0; i < bytes.length; i++) {  
            binarios[i]= Integer.toBinaryString(bytes[i]);
        }  
        for (String aux : binarios) {
            binario += aux;
        }
        return binario;
    }
}
