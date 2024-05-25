package Models;

import java.io.Serializable;

public class Adresse implements Serializable {



    private String nom_rue;
    private int num_rue;
    private String nom_ville;

    private int code_zip; // code postal


    public Adresse(String nom_rue, int num_rue, String nom_ville, int code_zip) {
        this.nom_rue = nom_rue;
        this.num_rue = num_rue;
        this.nom_ville = nom_ville;
        this.code_zip = code_zip;
    }

    public Adresse() {
    }

    public String getNom_rue() {
        return nom_rue;
    }

    public void setNom_rue(String nom_rue) {
        this.nom_rue = nom_rue;
    }
    public int getNum_rue() {
        return num_rue;
    }
    public void setNum_rue(int num_rue) {
        this.num_rue = num_rue;
    }
    public String getNom_ville() {
        return nom_ville;
    }
    public void setNom_ville(String nom_ville) {
        this.nom_ville = nom_ville;
    }
    public int getCode_zip() {
        return code_zip;
    }
    public void setCode_zip(int code_zip) {
        this.code_zip = code_zip;
    }

    @Override
    public String toString() {
        return "Adresse{" +
                "nom_rue='" + nom_rue + '\'' +
                ", num_rue=" + num_rue +
                ", nom_ville='" + nom_ville + '\'' +
                ", code_zip=" + code_zip +
                '}';
    }

}
