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
        System.out.println("Trabalho de conclusao de SCM");
        Scanner input = new Scanner(System.in);
        System.out.println("Digite uma palavra para criptografar:");
        String name = input.nextLine();
        Sample sample = new Sample();
        System.out.println(sample.hash(name));
    }
}
