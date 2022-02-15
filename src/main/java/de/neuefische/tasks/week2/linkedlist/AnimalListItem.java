package de.neuefische.tasks.week2.linkedlist;

public class AnimalListItem {

 private Animal value;
 private AnimalListItem next;

    public AnimalListItem(Animal value) {
        this.value = value;
    }

    public Animal getValue() {
        return value;
    }

    public void setValue(Animal value) {
        this.value = value;
    }

    // toString methode ist rekursiv, weil next am Ende der Funktion nochmals aufgerufen wird
    public String toString() {
        var result = value.toString();
        if (next != null) {                         //Methode läuft solange durch, bis next auf null zeigt
            result += " -> " + next;
        }
        return result;
    }

    // Abfrage ob letzes Element oder nicht
    public boolean hasNext(){
       return next != null;
        }

    public AnimalListItem getNext() {
        return next;
    }

    public void setNext(AnimalListItem next) {
        this.next = next;
    }

}




