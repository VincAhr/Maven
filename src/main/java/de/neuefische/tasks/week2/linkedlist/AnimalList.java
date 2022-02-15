package de.neuefische.tasks.week2.linkedlist;

public class AnimalList {

    private AnimalListItem head;

    //TODO methode selbst nochmal schreiben
    public void add(Animal value) {

       AnimalListItem list = new AnimalListItem(value);
        if(head == null){
            head = list;
        } else {
            AnimalListItem current = head;
            while(current.hasNext()){
                current = current.getNext();
            }
            current.setNext(list);
        }
    }

    //TODO methode selbst nochmal schreiben
    public void remove(Animal animal) {
        var prev = (AnimalListItem) null;
        for (AnimalListItem current = head; current != null; current = current.getNext()) {
            if (animal.equals(current.getValue())) {
                if (prev == null) {
                    head = head.getNext();
                } else {
                    prev.setNext(current.getNext());
                }
                break;
            }
            prev = current;
        }
    }

    @Override
    public String toString() {
        return head.toString();
    }


}
