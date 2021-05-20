package ro.ase.acs.main;

import ro.ase.acs.template.FineDinningLunch;
import ro.ase.acs.template.LunchTemplate;
import ro.ase.acs.template.RomanianCuisineLunch;

public class Main {
    public static void main(String[] args) {
        LunchTemplate lunchTemplate = new FineDinningLunch();
        lunchTemplate.takeLunch();
        System.out.println();
        System.out.println("-------------------Romanian Lunch--------------------");
        System.out.println();
        lunchTemplate = new RomanianCuisineLunch();
        lunchTemplate.takeLunch();
    }
}
