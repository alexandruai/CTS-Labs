package com.company;

import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    //3. As incerca sa centralizez datele ca sa nu mai existe atatea initializari pe drum
        int[] nrCont1 = {0, 1, 5, 8};
        int[] nrCont2 = {4, 2, 8, 10};
        int[] nrCont3 = {10, 2, 0, 5};

        TipContainer[] tipContainers = {TipContainer.Mic_10mc,
                TipContainer.Mediu_25mc,
                TipContainer.Mare_50mc,
                TipContainer.Jumbo_100mc};

        char nume1 = 'C';
        char nume2 = 'M';
        char nume3 = 'G';


        PortContainer port1 = new PortContainer(nume1, tipContainers, nrCont1);

        PortContainer port2 = new PortContainer(nume2, tipContainers, nrCont2);

        PortContainer port3 = new PortContainer(nume3, tipContainers, nrCont3);


        ArrayList<PortContainer> lista = new ArrayList<PortContainer>();

        lista.add(port1);
        lista.add(port2);
        lista.add(port3);


        //1.As crea intr-un fisier o interfata care  contine metodele de citire/ scriere din fisier
        //Desi ele sunt restranse la tema respectiva,
        // daca proiectul este extins pot fi folosite si de alte clase de obiecte

        //Fisier
        FileWriter outFile = null;
        BufferedWriter writer = null;

        try {
            System.out.println("Scriem fisierul text.");
            outFile = new FileWriter("PortContainer.csv", false);
            writer = new BufferedWriter(outFile);

            for (PortContainer i:lista) {
                System.out.println(i.toString());
                writer.write(i.toString());
                writer.newLine(); //
            }

            writer.close();
            outFile.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //3. As incerca sa centralizez datele ca sa nu mai existe atatea initializari pe drum
        ArrayDeque<PortContainer> coada = new ArrayDeque<PortContainer>();

        FileReader inFile = null;
        BufferedReader reader = null;

        try {
            System.out.println("Ctitim fisierul text!");
            inFile = new FileReader("PortContainer.csv");
            reader = new BufferedReader(inFile);

            Scanner fileScanner = new Scanner(reader);
            while(fileScanner.hasNext()) {
                String linie = fileScanner.nextLine();
                Scanner lineScanner = new Scanner(linie);
                lineScanner.useDelimiter(",");

                String clasaCitita = lineScanner.next();
                Class clasa = Class.forName(clasaCitita);

                Object local = clasa.getDeclaredConstructor().newInstance();
                if (local instanceof PortContainer) {
                    local = ((PortContainer) local).dinString(linie, ",");
                    coada.offerLast((PortContainer) local);
                }

     }
            reader.close();
            inFile.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException | NoSuchMethodException | InstantiationException |
                IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        //2. In locul acestui while as crea o functie pt golirea cozilor de nave in clasa macara
        //sau daca proiectul se extinde se poate pune intr-o interfata pt a fi folosita si de alte clase
        PortContainer iter = null;
        while(!coada.isEmpty()) {
            iter = coada.pollFirst();
            System.out.println(iter.toString());
        }

    }
}
