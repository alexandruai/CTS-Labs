package ro.ase.acs.composite;

public interface HierarchicalNode {
    public float getSalary();
    public String getName();
    public void addHierarchicalNode(HierarchicalNode node);
    public void deleteHierarchicalNode(HierarchicalNode node);

    //Componenta abstracta
    default public HierarchicalNode searchHierarchicalName(String name) {
        throw new UnsupportedOperationException();
    }

}
