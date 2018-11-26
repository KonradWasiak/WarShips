/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baza.element;

import java.time.LocalDate;

/**
 *
 * @author wolsk
 */
public interface IOsoba {

    LocalDate getData();

    //Getter & Setter
    int getIdOsoby();

    String getName();

    String getSur();

    void setData(LocalDate d);

    void setName(String imie);

    void setSur(String sur);
    
}
