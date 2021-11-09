/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provasw;

/**
 *
 * @author nando
 */
public class ProvaSW {

    public static void printNumber(int topPrint) {
        System.out.println("the value to print is " + topPrint);

    }

    public static void printHello(String name) {
        System.out.println("Hello " + name + ". How are u?");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello Fisciano!");
        System.out.println("Hello Word!");
        System.out.println("Hello Universe!");

        System.out.println("Programma rotto!");
        printNumber(3);
        printNumber(5);
        printNumber(4);

        System.out.println("3");
        System.out.println("4");
        System.out.println("5");

        printHello("Mario");
        printHello("Alfredo");
        printHello("Armadino");

    }

}
