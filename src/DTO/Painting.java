
package DTO;
import java.util.Scanner;
public class Painting extends Item {
    private int height;
    private int width;
    boolean isWatercolour;
    boolean isFramed;

    public Painting() {
        super();
        height = 0;
        width = 0;
        isWatercolour = true;
        isFramed = true;
    }

    public Painting(int height, int width, boolean isWatercolour, boolean isFramed) {
        this.height = height;
        this.width = width;
        this.isWatercolour = isWatercolour;
        this.isFramed = isFramed;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public boolean isIsWatercolour() {
        return isWatercolour;
    }

    public void setIsWatercolour(boolean isWatercolour) {
        this.isWatercolour = isWatercolour;
    }

    public boolean isIsFramed() {
        return isFramed;
    }

    public void setIsFramed(boolean isFramed) {
        this.isFramed = isFramed;
    }
    public void outputPaiting(){
        System.out.println("height" + height);
        System.out.println("width" + width);
        System.out.println("Is Watercolour: " + isWatercolour);
        System.out.println("Is Framed: " + isFramed);    
    }
     public void inputPainting() {
        input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Height? ");
        this.height = sc.nextInt();
        System.out.println("Width? ");
        this.width = sc.nextInt();
        System.out.println("Is Watercolour(true/false)?");
        this.isWatercolour = sc.nextBoolean();
        System.out.println("Is Framed(true/false)?");
        this.isFramed = sc.nextBoolean(); sc.nextLine();
    }
}
