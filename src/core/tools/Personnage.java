/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core.tools;

/**
 *
 * @author ldumay
 */

/**
 * Class - Personnage
 * <br>
 * <br>private String nom;
 * <br>private String prenom;
 * <br>
 * <br>Constructor :
 * <br>- Personnage()
 * <br>- Personnage(String nom, String prenom)
 * <br>
 * <br>Functions :
 * <br>
 * <br>Basic getter :
 * <br>- getNom()
 * <br>- getPrenom()
 * <br>
 * <br>Basic setter :
 * <br>- setNom()
 * <br>- setPrenom()
 * <br>
 * <br>End.
 */
public class Personnage {
    
    private String nom;
    private String prenom;
    
    /**
     * Constructor
     * 
     * Personnage()
     */
    public Personnage(){}
    
    /**
     * Constructor
     * 
     * Personnage(String nom, String prenom)
     * @param nom
     * @param prenom
     */
    public Personnage(String nom, String prenom){
        this.nom = nom;
        this.prenom = prenom;
    }
    
    // The methods of basic getter below.
    public String getNom(){ return this.nom; }
    public String getPrenom(){ return this.prenom; }
    
    // The methods of basic setter below.
    public void setNom(String nom){ this.nom = nom; }
    public void setPrenom(String prenom){ this.prenom = prenom; }
    
    @Override
    public String toString(){
        return "Personnage : "+this.nom+" "+this.prenom;
    }
}
