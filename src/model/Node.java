package model;

public class Node {
    private Person content;
    private Node next;

    /**
     * Ein neues Objekt vom Typ Node wird erschaffen.
     * Der Inhalt wird per Parameter gesetzt. Der Verweis ist leer.
     *
     * @param p das Inhaltselement des Knotens vom Typ Person
     */

    public Node(Person p){
        content=p;
        next=null;
    }

    /**
     * Liefert das naechste Element des aktuellen Knotens.
     *
     * @return das Objekt vom Typ Node, auf das der aktuelle Verweis zeigt
     */

    public Node getNext() {
        return next;
    }

    /**
     * Der Verweis wird auf das Objekt, das als Parameter uebergeben wird,
     * gesetzt.
     *
     * @param pNext der Nachfolger der Node
     */

    public void setNext(Node pNext) {
        this.next = pNext;
    }

    /**
     * Liefert das Inhaltsobjekt des Knotens vom Typ Person.
     *
     * @return das Inhaltsobjekt des Knotens
     */

    public Person getContent() {
        return content;
    }
}
