package Interfaces;

import MobaGame.Heros.Assassin;
import MobaGame.Heros.Hero;
import MobaGame.Heros.Mage;
import MobaGame.Heros.Marksman;

import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Tiger t = new Tiger();
        Chicken c = new Chicken();
        Apple a = new Apple();
        Laviva l = new Laviva();
        t.howToEat();
        c.howToEat();
        a.howToEat();
        l.howToEat();
        System.out.println("Can tiger move?: " + t.canMove());
        System.out.println("Can chicken move?: " + c.canMove());
        System.out.println("Can apple move?: " + a.canMove());
        int data = t.data;
        int data2= Movable.data;
        // interface'ler data tipi olarak kullanılabilir
        Movable movable; // programming to interface, dependency injection
        // interface'lerden obje üretilemez. new Movable(); hata verir.
        movable = new Tiger();
        movable = new Apple();
        Movable[] movables = {new Tiger(), new Apple(), new Chicken()}; // polimorfik yapı
//        Hero[] heros = {new Assassin(), new Marksman(), new Mage()}

        Laviva l1 = new Laviva(40);
        Laviva l2 = new Laviva(30);
        System.out.println("l1 > l2?: " + (l1.compareTo(l2)));

        String s1 = "s1";
        String s2 = "s2";

        Apple[] apples = new Apple[10];
        initializeApples(apples);
//        Arrays.sort(apples);
        Laviva[] lavivas = new Laviva[10];
        initializeLavivas(lavivas);
        System.out.println(Arrays.toString(lavivas));
        Arrays.sort(lavivas);
        System.out.println(Arrays.toString(lavivas));

        Calendar calendar = new GregorianCalendar(2013, 2, 1);
        Calendar calendar1 = calendar;
        Calendar calendar2 = (Calendar) calendar.clone();
        System.out.println("calendar == calendar1? : " + (calendar == calendar1));
        System.out.println("calendar == calendar2? : " + (calendar == calendar2));

        int[] arr1 = {1,2,3,4,54,5};
        int[] arr2 = arr1.clone();
        System.out.println("arr1 == arr2?:" + (arr1==arr2));
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }

    private static void initializeApples(Apple[] apples){
        Random random = new Random();
        for (int i = 0; i < apples.length; i++) {
            apples[i] = new Apple(random.nextInt(200)+30);
        }
    }

    private static void initializeLavivas(Laviva[] lavivas){
        Random random = new Random();
        for (int i = 0; i < lavivas.length; i++) {
            lavivas[i] = new Laviva(random.nextInt(10)+30);
        }
    }
}
