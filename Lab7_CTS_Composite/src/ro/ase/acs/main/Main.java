package ro.ase.acs.main;

import ro.ase.acs.composite.Angajat;
import ro.ase.acs.composite.Department;
import ro.ase.acs.composite.HierarchicalNode;
import ro.ase.acs.composite.Manager;

public class Main {
    public static void main(String[] args) {
        Angajat ang = new Angajat();
        ang.setName("Daniel");
        ang.setSalary(2000);
        Angajat ang2 = new Angajat();
        ang2.setName("Maria");
        ang2.setSalary(3000);
        Angajat ang3 = new Angajat();
        ang3.setName("Pavel");
        ang3.setSalary(2000);
        Manager m1 = new Manager();
        m1.setName("Mircea");
        m1.setSalary(6000);
        Manager m2 = new Manager();
        m2.setName("Carla");
        m2.setSalary(7000);
        Department d = new Department();
        m1.addHierarchicalNode(ang);
        m1.addHierarchicalNode(ang2);
        m2.addHierarchicalNode(m1);
        m2.addHierarchicalNode(ang3);
        d.setName("Financial");
        System.out.println(m2);
        m1.deleteHierarchicalNode(ang);
        d.addHierarchicalNode(ang);
        m2.addHierarchicalNode(d);
        System.out.println(d);
        System.out.println(m2);
        HierarchicalNode node = m1.searchHierarchicalName("Maria");
        System.out.println(node);

    }
}
