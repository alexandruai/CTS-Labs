package ro.ase.acs.main;

import java.util.HashMap;
import java.util.Map;

public class IoC {
    //Tema
    //Sol 2 pt Dependency Inversion: IoC
    //Indiciu Hashmap, Recomandat
    //Trebuie sa ai structura salvare cheie-valoare pt metoda register
    private Map<Class<?>, Class<?>> map = new HashMap<>();
    //Metoda de inregistrare
    public  void  register(Class<?> contract, Class<?> implementation){
        map.put(contract, implementation);
    }
    //Metoda generica
    public <T > T  resolve(Class<?> contract){
        try {
           return (T) map.get(contract).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
