/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118013.latihan48.kalkulator;

/**
 *
 * @author Rifian
 * Nama : Rifian Joe Premilenio
 * Kelas : IF-01
 * NIM : 10118013
 */
public class IF110118013Latihan48Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Kalkulator calc = new Kalkulator();
        calc.setValue1(7);
        calc.setValue2(5);
        
        System.out.println("VALUE 1 = " + calc.getValue1());
        System.out.println("VALUE 2 = " + calc.getValue2());
        calc.setNameProject();
        calc.setNoteProject("This project shown you how to manage method in java");
        System.out.println("Result Add is = " + calc.add(calc.getValue1(),calc.getValue2()));
        System.out.println("Result Minus is = " + calc.minus(calc.getValue1(), calc.getValue2()));
        System.out.println("Result Multiple is = " + calc.multiplication(calc.getValue1(), calc.getValue2()));
        System.out.println("Result Division is = " + calc.division(calc.getValue1(), calc.getValue2()));
    }
    
}
