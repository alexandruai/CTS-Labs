package ro.ase.acs.zamfi;

public class Main {

    public static void main(String[] args) {
        Reteta reteta1 = new Reteta(23, 43.3f, "Popescu");
        Reteta reteta2 = (Reteta) reteta1.copiazaReteta();
        System.out.println(reteta1);
        System.out.println(reteta2);
    }
}
