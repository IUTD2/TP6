/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tp6;

import iut.Ecran;
import iut.*;
import javax.swing.JOptionPane;

/**
 *
 * @author aguidet
 */
public class TP6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ecran e = new Ecran("Essai",800,600);
        e.setVisible(true);        
                
        Fenetre f = new Fenetre(e);
        Label l = new Label(f,80,100,80,20);
        l.setTexte("Ceci est un label");
        BoiteTexte b = new BoiteTexte(f,200,100,80,20);
        Bouton btn = new Bouton(f,300,100,60,20);
        btn.setTexte("Bouton");        
        btn.setOnClick(new Action(){ public void executer(){JOptionPane.showMessageDialog(null, "Clic sur bouton");} });
        
        CaseCocher c = new CaseCocher(f,50,130,80,20);
        c.setEtat(true);
        c.setTexte("Ceci est une case à cocher");
        Groupe g = new Groupe(f,300,200,180,300);
        BoutonRadio b1 = new BoutonRadio(g,350,240,150,30);
        b1.setTexte("CHoix 1");
        BoutonRadio b2 = new BoutonRadio(g,350,290,150,30);
        b2.setTexte("Choix 2");
        b2.setEtat(true);
        Liste li = new Liste(f,20,220,100,80);
        li.ajoute("Item 1");
        li.ajoute("Item 2");
        li.ajoute("Item 3");
        
        Combo comb = new Combo(f,500,150,100,30);
        comb.ajoute("Item 1");
        comb.ajoute("Item 2");
        comb.ajoute("Item 3");                       
    
    }
    
}
