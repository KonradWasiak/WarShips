/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.util.*;

/**
 *
 * @author wolsk
 */
public class ship {
    
    List <shipPart> czesciStatku;
    
    
    public ship(shipPart ... shipParts) {
        czesciStatku = new ArrayList<>();
        for (int i = 0;i < shipParts.length ; i++){
            czesciStatku.add(shipParts[i]);
        }
    }
    public void remove(){
        czesciStatku.remove(this);
    }
    
}
