/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package yatzy.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import yatzy.peli.Peli;

/**
 * Kuuntelee pelaajan hiirellä tekemiä valintoja
 * 
 * @author minnhann
 */
public class KlikkaustenKuuntelija implements ActionListener{
    private Peli peli;
    
    public KlikkaustenKuuntelija(Peli peli){
        this.peli = peli;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        peli.heitaNoppia();
    }
    
}
