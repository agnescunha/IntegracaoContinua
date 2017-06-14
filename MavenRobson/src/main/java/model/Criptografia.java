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
public class Criptografia {
    
    static String chaveencriptacao = "0123456789abcdef";
    static String IV = "AAAAAAAAAAAAAAAA";

    
    public String criptografar(String frase) {
        String retorno = "";
        try {
            byte[] textoencriptado = encrypt(frase, chaveencriptacao);
            for (int i=0; i<textoencriptado.length; i++){
                System.out.print(new Integer(textoencriptado[i])+" ");
                retorno += (new Integer(textoencriptado[i]) + ";");
            }
            String[] textoParaDesencriptacao = retorno.split(";");
            for (int i=0; i < textoParaDesencriptacao.length; i++) {
        	 textoencriptado[i] = (byte) (Integer.parseInt(textoParaDesencriptacao[i]));
            }
        } catch (Exception e) {
            e.printStackTrace();
	}
	return retorno;
    }

    public String descriptografar(String frase) {
        String textodecriptado = "";
        System.out.println(frase);
        String[] arrayComTextoEncriptado = frase.split(";");
        int tamanho = arrayComTextoEncriptado.length;
        try{
            byte[] textoencriptado = new byte[tamanho];
            for (int i=0; i < tamanho; i++) {
                textoencriptado[i] = (byte) (Integer.parseInt(arrayComTextoEncriptado[i]));
            }
            textodecriptado = decrypt(textoencriptado, chaveencriptacao);
        } catch (Exception e) {
            e.printStackTrace();
	}
	return textodecriptado;
    }
    
    public static byte[] encrypt(String textopuro, String chaveencriptacao) throws Exception {
        Cipher encripta = Cipher.getInstance("AES/CBC/PKCS5Padding", "SunJCE");
        SecretKeySpec key = new SecretKeySpec(chaveencriptacao.getBytes("UTF-8"), "AES");
        encripta.init(Cipher.ENCRYPT_MODE, key,new IvParameterSpec(IV.getBytes("UTF-8")));
        return encripta.doFinal(textopuro.getBytes("UTF-8"));
    }

    public static String decrypt(byte[] textoencriptado, String chave) throws Exception{
        Cipher decripta = Cipher.getInstance("AES/CBC/PKCS5Padding", "SunJCE");
        SecretKeySpec key = new SecretKeySpec(chave.getBytes("UTF-8"), "AES");
        decripta.init(Cipher.DECRYPT_MODE, key,new IvParameterSpec(IV.getBytes("UTF-8")));
        return new String(decripta.doFinal(textoencriptado),"UTF-8");
    }
}
