package test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.maventest.Hasher;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author marce
 */
public class SampleUnitTest {
    
    private Hasher hasher;
    private final String word = "NOVO BUILD";
    
    public SampleUnitTest() {
    }
    
    @Before
    public void setUp() {
        this.hasher = new Hasher();
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void sha256Test() {
        System.out.println("\nTeste sha256Test:\n");
        String hash = this.hasher.sha256(word);
        System.out.println("Criando hash SHA256...");
        assertNotEquals(hash, "");
        assertEquals(hash.length(), 64);
        System.out.println("Hash SHA256 criada para " + word + " foi:\n" + hash + "\n");
    }
    
    @Test
    public void md5Test() {
        System.out.println("\nTeste md5Test:\n");
        String hash = this.hasher.md5(word);
        System.out.println("Criando hash MD5...");
        assertNotEquals(hash, "");
        assertNotEquals(hash, 32);
        System.out.println("Hash MD5 criada para " + word + " foi:\n" + hash + "\n");
    }
}
