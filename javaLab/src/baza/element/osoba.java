package baza.element;

import java.time.LocalDate;

/**
 *
 * @author wolsk
 */
public class osoba implements IOsoba {
    
    String name;
    String surname;
    LocalDate data;
    final int idOsoby;
    
    osoba(int id){
        idOsoby = id;
        name ="unk";
        surname ="unk";
    }
    osoba(int id,String n,String sur){
        this(id);
        name =n;
        surname = sur;
    }
    
    //Getter & Setter
    @Override
    public int getIdOsoby() {
        return idOsoby;
    }
    @Override
    public String getName(){
        return name;
    }
    @Override
    public LocalDate getData(){
        return data; 
    }
    @Override
    public String getSur(){
        return surname;
    }
    @Override
    public void setName(String imie){
        name = imie;
    }
    @Override
    public void setSur(String sur){
        surname = sur;
    }
    @Override
    public void setData(LocalDate d){
        data = d;
    }

    @Override
    public String toString() {
        
            return "osoba: " + "name=" + name + ", surname=" + surname + ", data=" + data + ", idOsoby=" + idOsoby + '}';       
    }
}
