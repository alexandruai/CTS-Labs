package ro.ase.acs.models;

import java.util.Scanner;

public class Atm implements IAtm{
    private Scanner scanner = new Scanner(System.in);

    @Override
    public float transaction() {
        System.out.println("Apasati 1 pentru retragere sau 2 pentru de punere");

        String tasta = scanner.nextLine();
        boolean isRetragere = false;

        if(tasta.equals("1")){
            isRetragere = true;
        } else if(tasta.equals("2")){
            isRetragere = false;
        }

        System.out.println("Introduce suma: ");

        float suma = Float.valueOf(scanner.nextFloat());

        if(isRetragere){
            return -suma;
        } else         return suma;

    }
}
