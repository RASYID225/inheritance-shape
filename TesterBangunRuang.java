

import java.util.Scanner;


public class TesterBangunRuang {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        System.out.println("Choose one :");
        System.out.println("1.Circle\n 2.Rectangle\n 3.Cube ");
        String pilihan = p.nextLine();


        if(pilihan.equals("1")){
            System.out.println("Shape Details : ");
            System.out.println("name : ");
            String name = p.nextLine();
            System.out.println("Color : ");
            String color = p.nextLine();
            System.out.println("Radius : ");
            int radius = p.nextInt();
        }else if (pilihan.equals("2")) {
            System.out.println("Shape Details : ");
            System.out.println("Name : ");
            String name = p.nextLine();
            System.out.println("Color : ");
            String color = p.nextLine();
            System.out.println("Length :");
            int length = p.nextInt();
            System.out.println("Width : ");
            int width = p.nextInt();
        } if (pilihan.equals("3")) {
           System.out.println("Shape Details : ");
           System.out.println("Name : ");
           String name = p.nextLine(); 
           System.out.println("Color : ");
           String color = p.nextLine();
           System.out.println("Length : ");
           int length = p.nextInt();
           System.out.println("Width : ");
           int width = p.nextInt();
           System.out.println("Height : ");
           int height = p.nextInt();
        }    
}

}