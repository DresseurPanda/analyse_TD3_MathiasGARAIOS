package com.iutblagnac.r303trace;

public class Personne {

    String nom ;
    String prenom ;
    boolean travail;


    public Personne(){
        this.nom = "Pascal" ;
        this.prenom = "Bob" ;
        this.travail = false ;
    }

    public Personne( String pNom,  String pPrenom){
        this.nom = pNom ;
        this.prenom = pPrenom ;
        this.travail = false ;
    }

    public void presenter(){
        if (this.travail)
            System.out.println("Je suis " + prenom + "\n" + //
                        "Je suis " + prenom + "\n" + //
                        "Je suis " + prenom + ", je suis " + prenom + " " + nom);
        else 
            System.out.println("Me déranger pas je bricole, -_-");
    }

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
