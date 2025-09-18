package com.iutblagnac.r303trace;

public class Personne {

    String nom ;
    String prenom ;
    boolean travail;

   
    /**
     * Constructeur par défaut
     */
    public Personne(){
        this.nom = "Pascal" ;
        this.prenom = "Bob" ;
        this.travail = false ;
    }

    /**
     * Constructeur avec paramètres
     * @param pNom
     * @param pPrenom
     */
    public Personne( String pNom,  String pPrenom){
        this.nom = pNom ;
        this.prenom = pPrenom ;
        this.travail = false ;
    }

    /**
     * Présente la personne si elle travaille ou pas
     * @return String
     */
    public String presenter(){
        if (!this.travail)
            return "Je suis " + prenom + "\n" + //
                        "Je suis " + prenom + "\n" + //
                        "Je suis " + prenom + ", je suis " + prenom + " " + nom;
        else 
            return "Me déranger pas je bricole, -_-";
    }

    /**
     * Défini si la personne travaille ou pas
     */
    public void travailler(){
        if (!travail){
            System.out.println(prenom + "va au travail !");
            travail = true ;
        }
        else{
            System.out.println(prenom + "rentre du travail !");
            travail = false ;
        }
    }
}
