package ro.ase.acs.template;

public class FineDinningLunch extends LunchTemplate{
    @Override
    protected void mainCourse() {
        System.out.println("Scoici Saint-Jacques");
    }

    @Override
    protected void dessert() {
        System.out.println("Tarta cu cuiocolata");
    }

    @Override
    protected void appetizer() {
        System.out.println("Foie-gras");
    }
}
