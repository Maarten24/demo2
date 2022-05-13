package de.schule;

/**
 * Ein einfache Klasse um Personen zu generieren
 */
public class Person {
    private String name;

    /**
     * Das ist das private Feld mit dem Alter des Objektes
     */
    private int alter;


    /**
     * 
     * @return Der Name des Objektes
     */
    public String getName(){
        return name;
    }

    /**
     * 
     * @param pName Setzt den Namen des Objektes
     */
    public void setName(String pName){
        this.name = pName;
    }
}
