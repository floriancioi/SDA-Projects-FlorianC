package main.java.Exercises;

public class ProgramelPahar {
    public static void main(String[] args) {
        String pahar1="Bere";
        String pahar2="Vin";
        System.out.println(pahar1+" "+pahar2);
        String pahar3=pahar1;
        pahar1=pahar2;
        pahar2=pahar3;
        System.out.println(pahar1+ " "+pahar2);
    }

}
