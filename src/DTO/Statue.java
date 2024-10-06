
package DTO;

import java.util.Scanner;
public class Statue extends Item {
    private int weight;
    private String colour;

    public Statue() {
        super();
        weight = 0;
        colour = "";
    }

    public Statue(int weight, String colour) {
        this.weight = weight;
        this.colour = colour;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
    public void outputStatue(){
        System.out.println("Weight: " + weight);
         System.out.println("Colour: " + colour);
    }
    public void inputStatue(){
        Scanner sc = new Scanner(System.in);
         System.out.println("Weight: ");
         this.weight = sc.nextInt();
         sc.nextLine();
          System.out.println("Colour: ");
          this.colour = sc.nextLine();
          
    }
}
