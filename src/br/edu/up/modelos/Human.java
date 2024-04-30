package br.edu.up.modelos;
public class Human {
    private String name;
    private int age;
    private double weight, height;
    private char gender;

    public Human(String name, int age, char gender, double weight, double height) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.weight = weight;
        this.height = height;
    }

    public void calcularPesoIdeal() {
        double pesoIdeal;

        if (gender == 'M' || gender == 'm') {
            if (this.height <= 1.70) {
                if (age <= 20){
                    System.out.println("peso tipo F1");
                    pesoIdeal = (72.7 * this.height) - 58;
                    }
                    else if (age >= 40){
                    System.out.println("peso tipo F2");
                    pesoIdeal = (72.7 * this.height) - 45;
                }else{
                    System.out.println("peso tipo F3");
                    pesoIdeal = (72.7 * this.height) - 53;
                }
            } else {
                if (age < 40){
                    System.out.println("peso tipo F4");
                    pesoIdeal = (72.7 * this.height) - 50;
                }else{
                    System.out.println("peso tipo F5");
                    pesoIdeal = (72.7 * this.height) - 58;}
            }
        } else { // gender == 'F'
            if (height > 1.50) {
                if (age >= 35){
                    
                    System.out.println("peso tipo F1");
                    pesoIdeal = (62.1 * this.height) - 45;}
                else{
                    
                    System.out.println("peso tipo F2");
                    pesoIdeal = (62.1 * this.height) - 49;}
            } else {
                
                System.out.println("peso tipo F3");
                pesoIdeal = (62.1 * this.height) - 44.7;
            }
        }

        System.out.println("O peso ideal de " + name + " é " + String.format("%.2f", pesoIdeal) + " kg");
    }

    public void IMC() {
        double IdealWeight = weight / Math.pow(height, 2);

        if (IdealWeight <= 18.5) {
           System.out.println(name +" esta abaixo do peso"); 
        } else if(18.6 <= IdealWeight & IdealWeight <= 24.9){
            System.out.println(name +" esta no peso Ideal");
        }else if(25 <= IdealWeight & IdealWeight <= 29.9){
            System.out.println(name +" esta acima do peso");
        }else if(30 <= IdealWeight & IdealWeight <= 34.9){
            System.out.println(name +" possui obesidade de grau I");
        }else if(35 <= IdealWeight & IdealWeight <= 39.9){
            System.out.println(name +" possui obesidade de grau II(Severa)");
        }else if(40 <= IdealWeight){
            System.out.println(name +" possui obesidade de grau III(Mórbida)");
        }
    }

}
