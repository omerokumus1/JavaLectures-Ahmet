package Polymorphism;

import java.util.Scanner;

public class Polymorphism {


    public static void main(String[] args) {
        // bir subclass'ın super class yerine yazılabilmesidir.
        // polymorphism: çok biçimlilik = bir objenin birden fazla sıfatının/tipinin olması

        Laptop laptop = new Laptop("2500x1200");
//    Computer computer = new Keyboard();
        Computer c2 = new Laptop("2000x1200");

        Laptop[] laptops = {
                new GamingBook("1920x940", "AMD"),
                new WorkStation("1920x940", "16GB")
        };

//        GamingBook[] gamingBooks = {};
//        WorkStation[] workStations = {};

        showAllLaptops(laptops);
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        if (choice == 0)
            showGaminBooks(laptops);
        else
            showWorkstations(laptops);

        Chart chart = new Chart();
        chart.setComputer(new GamingBook("3540x2160", "Nvidia"));
        chart.setComputer(new WorkStation("1940x1260", "8GB"));

        chart.addItem(new GamingBook("3540x2160", "Nvidia"));
        chart.addItem(new WorkStation("1940x1260", "8GB"));
        chart.addItem(new Keyboard());

        chart.listItems();

    }

    private static void showWorkstations(Laptop[] laptops) {
        for (int i = 0; i < laptops.length; i++) {
            if (laptops[i] instanceof WorkStation)
                System.out.println(laptops[i]);
        }
    }

    private static void showGaminBooks(Laptop[] laptops) {
        for (int i = 0; i < laptops.length; i++) {
            if (laptops[i] instanceof GamingBook)
                System.out.println(laptops[i]);
        }
    }

    private static void showAllLaptops(Laptop[] laptops) {

        for (int i = 0; i < laptops.length; i++) {
            System.out.println(laptops[i]);
        }
    }



}
