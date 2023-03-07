package uscs;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author kawe.silva_uscsonlin
 */
public class TestaPessoa {


    public static void main(String[] args) {
        Pessoa p1 = new Pessoa ();
        p1.nome = "Daniel";
        p1.idade = 19;
        p1.email = "daniel@uol.com";
        
        p1.Imprime();
        
        System.out.println("");
        
        Pessoa p2 = new Pessoa ();
        p2.nome = "Ana Bia";
        p2.idade = 18;
        p2.email = "anabia@uol.com";
                
        p2.Imprime();
        
    }
    
}
