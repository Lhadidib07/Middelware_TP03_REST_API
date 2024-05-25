package Models;

import jakarta.xml.bind.annotation.XmlRootElement;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
@XmlRootElement
public class Carnet implements Serializable {

    // dans le carnet chaque adresse est associer a une personne
    HashMap<Personne,Adresse> ListAdresse = new HashMap<Personne,Adresse>();
    public String nom;

    public Carnet(HashMap<Personne,Adresse> listAdresse, String nom) {
        ListAdresse = listAdresse;
        this.nom = nom;
    }

    public Adresse getAdresse(Personne personne) {
        return ListAdresse.get(personne);
    }

    public Personne getPersonne(Adresse adresse) {
        for (Personne personne : ListAdresse.keySet()) {
            if (ListAdresse.get(personne).equals(adresse)) {
                return personne;
            }
        }
        return null;
    }

    public void addPersonne(Personne personne,Adresse adresse) {
        ListAdresse.put(personne,adresse);
    }

    public void removePersonne(Personne personne) {
        ListAdresse.remove(personne);
    }

    public Carnet() {

    }

    public HashMap<Personne, Adresse> getListAdresse() {
        return ListAdresse;
    }

}
