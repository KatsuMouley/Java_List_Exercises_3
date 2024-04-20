package br.edu.up.modelos;
import java.util.Scanner;
public class NumbersReader {

    private Scanner enter = new Scanner(System.in);
    private double Numbers[] = new double[80];
    private int numbersBetween = 0;
    
    public NumbersReader(){}
    public void numbersInput(){
        for (int i = 0; i < 80; i++) {
            System.out.println("Insira um número(Array["+i+"])");
            Numbers[i] = enter.nextDouble();
        }
    }
    public void Between50(){
        for (int i = 0; i < Numbers.length; i++) {
            if(Numbers[i]>10 && Numbers[i]<150){
                this.numbersBetween ++;
            }
        }
        System.out.println("There's "+numbersBetween+" numbers between 10 and 150 inside this object");
    }
    
}
