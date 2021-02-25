package com.company;


import java.util.Arrays;
import java.util.Scanner;

public class PortContainer implements Numarabil, Descarcare, Cloneable {
    char eticheta;
    TipContainer[] tipContainer = new TipContainer[4];
    int[] nrContainere = new int[4];

    //Constructor


    public PortContainer(char eticheta, TipContainer[] tipContainer, int[] nrContainere) {
        this.eticheta = eticheta;
        this.tipContainer = tipContainer;
        this.nrContainere = nrContainere;
    }

    public PortContainer() {

    }

    //Getteri Setteri
    public char getEticheta(){return eticheta;}
public void setEticheta(char eticheta){this.eticheta = eticheta;};

    public TipContainer[] getTipContainer() {
        return tipContainer;
    }

    public void setTipContainer(TipContainer[] tipContainer) {
        this.tipContainer = tipContainer;
    }

    public int[] getNrContainere() {
        return nrContainere;
    }

    public void setNrContainere(int[] nrContainere) {
        this.nrContainere = nrContainere;
    }

    //4.1. As itera si aici codul
    @Override
    public int getCapacitate() {
        int capacitate = 0;
        capacitate = capacitate + nrContainere[0] * 10 + nrContainere[1] * 25 + nrContainere[2] * 50 + nrContainere[3] * 100;
        return capacitate;
    }



    public Object dinString(String linie, String separator){
        Scanner lineScanner = new Scanner(linie);
        lineScanner.useDelimiter(separator);

        String numeClasa = lineScanner.next();

        System.out.println("Clasa citita: " + numeClasa);
        PortContainer local = new PortContainer();
        local.setEticheta(charA(lineScanner.next()));

        local.setTipContainer(TipContainer.values());
        local.setNrContainere(getNrContainere());
        return local;
    }

    private char charA(String next) {
        char ch= '0';
        for (int i = 0; i < next.length(); i++) {
            ch = next.charAt(i);

        }
        return ch;
    }


    // Pe baza interfeței Descarcare, să se realizeze descărcarea unei nave PortContainer
    // prin intermediul unor macarale robotizate. Fiecare macara este capabilă să manipuleze un anumit
    // tip de container. Macaralele robotizate sunt controlate în fire de execuție distincte. La un moment
    // dat doar o singură macara poate să ridice un container de un anumit tip de pe navă, celelalte macarale trebuind
    // să aștepte. Să se programeze lucrul concurențial al macaralelor robotizate astfel încât de pe nava PortContainer
    // să fie descărcate toate containerele pe care le-a transportat.

    //4. As itera codul mai bine
    @Override
   public int DescarcaContainer(PortContainer vas, Macara mc){

        int capacitate = getCapacitate();
        int[] volum = {10, 25, 50, 100};

        while(capacitate != 0) {

            for (int i = 0; i < tipContainer.length; i++) {

                if (nrContainere[i] != 0) {
                    capacitate -= nrContainere[i] * volum[i];
                }

            }

        }
        return capacitate;

    }

    //5. As curata codul de cel comentat(zombie code)
   /* @Override
  public String toString(){
        var stringBuilder = new StringBuilder();
        stringBuilder.append(String.format("Containerul %s are urmatoarele tipuri de containere: ", getEticheta()));
        stringBuilder.append(System.lineSeparator());

        stringBuilder.append(String.format("Din tipul %s exista %d",getTipContainer(), getNrContainere()));
        stringBuilder.append(System.lineSeparator());

        return stringBuilder.toString();
    }*/

    @Override
    public String toString() {
        return "PortContainer:" + System.lineSeparator() +
                "eticheta= " + eticheta + System.lineSeparator() +
                ", tipContainer= " + Arrays.toString(tipContainer)  + System.lineSeparator() +
                ", nrContainere= " + Arrays.toString(nrContainere)  + System.lineSeparator() +
                ';';
    }

}
