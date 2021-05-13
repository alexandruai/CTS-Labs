package ro.ase.acs.memento;

public class Joc {
    ManageriSalvari manageriSalvari;
    TablaJoc tablaJoc;

    public Joc() {
        this.manageriSalvari = new ManageriSalvari();
        this.tablaJoc = new TablaJoc();
    }

    public boolean verificaCastigator() {
        //...
        return false;
    }

    public void adaugaX(int linie, int coloana){
        tablaJoc.adaugaSimbol('X', linie, coloana);
    }

    public void adaugaO(int linie, int coloana){
        tablaJoc.adaugaSimbol('O', linie, coloana);
    }

    public void afisareTabla() {
        if (tablaJoc != null) {
            char matrice[][] = tablaJoc.getTabla();
            for (int i = 0; i < matrice.length; i++) {
                for (int j = 0; j < matrice[i].length; j++) {
                    System.out.print(matrice[i][j] + " ");

                }
                System.out.println();
            }
        }

    }

    public  void salvareTablaJoc() throws CloneNotSupportedException {
        manageriSalvari.salvare(tablaJoc);
    }

    public void restaurare(){
        tablaJoc = manageriSalvari.restaurare();
    }
}
