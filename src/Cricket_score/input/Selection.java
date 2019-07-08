/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cricket_score.input;

import Cricket_score.uiDesign.Gui;

/**
 *
 * @author Pankajan
 */
public class Selection implements Input{
    Gui gui;
    
    public Selection(Gui gui){
        this.gui = gui;
    }

    @Override
    public String getInput() {
        return gui.getSelection().getSelectedItem().toString();
    }
    
}
