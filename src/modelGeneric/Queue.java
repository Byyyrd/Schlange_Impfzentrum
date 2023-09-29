package modelGeneric;

public class Queue <T>{
    //COMPLETE 1: Klasse Queue fertigstellen. Es fehlen: isEmpty(), enqueue(Person p), dequeue(), front()
    private Node<T> head;
    private Node<T> tail;

    /**
     * Eine leere Schlange wird erzeugt.
     * Objekte, die in dieser Schlange verwaltet werden, muessen vom Typ
     * Person sein.
     */

    public Queue(){
        head=null;
        tail=null;
    }

    /**
     * Die Anfrage liefert den Wert true, wenn die Schlange keine Objekte enthaelt,
     * sonst liefert sie den Wert false.
     *
     * @return true, falls die Schlange leer ist, sonst false
     */
    public boolean isEmpty(){
        return head == null || tail == null;
    }

    /**
     * Das Objekt p wird an die Schlange angehaengt.
     * Falls p gleich null ist, bleibt die Schlange unveraendert.
     *
     * @param p das anzuhaengende Objekt vom Typ Person
     */
    public void enqueue(T p){
        if(p != null){
            Node<T> n = new Node<T>(p);
            if (isEmpty()){
                head = n;
            }
            else{
                tail.setNext(n);
            }
            tail = n;
        }
    }

    /**
     * Das erste Objekt wird aus der Schlange entfernt.
     * Falls die Schlange leer ist, wird sie nicht veraendert.
     */
    public void dequeue(){
        if(!isEmpty()) {
            if(head.getNext() != null) {
                head = head.getNext();
            }else{
                head = null;
                tail = null;
            }
        }

    }

    /**
     * Die Anfrage liefert das erste Objekt der Schlange.
     * Die Schlange bleibt unveraendert.
     * Falls die Schlange leer ist, wird null zurueckgegeben.
     *
     * @return das erste Objekt der Schlange vom Typ Person oder null, falls die Schlange leer ist
     */
    public T front(){
        if (!isEmpty()) {
            return head.getContent();
        }
        return null;
    }

}
