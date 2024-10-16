package Klass;

import java.util.*;

public class Klass {

    Scanner scanner = new Scanner(System.in);
    private String klassName;
    private int countUnit;
    private String klassPlace;
    private String klassDay;
    private String klassClock;
    private int klassDuration;


    public String getKlassName() {
        return klassName;
    }

    public int getcountUnit() {
        return countUnit;
    }

    public String getklassPlace() {
        return klassPlace;
    }

    public String getklassDay() {
        return klassDay;
    }

    public String getklassClock() {
        return klassClock;
    }

    public int getklassDuration(){
        return klassDuration;
    }


    // for get and save lessons and classess*
    public void getInfoKlass() {
        System.out.print("\tEnter Name of Klass: ");
        klassName = scanner.next();

//        classess.add(klassName);

        System.out.print("\tEnter Count of Unit of Klass: ");
        countUnit = scanner.nextInt();

        System.out.print("\tEnter Place of Klass: ");
        klassPlace = scanner.next();

        System.out.print("\tEnter Day of Klass: ");
        klassDay = scanner.next();

        System.out.print("\tEnter Clock of Klass: ");
        klassClock = scanner.next();

        System.out.print("\tEnter Duration of Klass (min): ");
        klassDuration = scanner.nextInt();

    }

}
