/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.maventest;

import java.util.Scanner;

/**
 *
 * @author marce
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("\nTrabalho de conclusao de SCM\n");
        Scanner input = new Scanner(System.in);
        System.out.println("Digite uma palavra para criptografar:");
        String name = input.nextLine();
        Hasher sample = new Hasher();
        System.out.println("SHA256: " + sample.sha256(name));
        System.out.println("MD5: " + sample.md5(name));
    }
}
