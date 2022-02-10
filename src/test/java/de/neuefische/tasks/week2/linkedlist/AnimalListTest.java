package de.neuefische.tasks.week2.linkedlist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AnimalListTest {

//    @Test
//    void shoulgivebackbird(){
//
//        AnimalList liste = new AnimalList();
//        Animal bird = new Animal("bird");
//        liste.add(bird);
//        String actual = liste.toString();
//
//        Assertions.assertEquals(bird, actual);
//    }

    @Test
    void addOneAnimal() {
        var list = new AnimalList();                      // Leere Liste list erstellen
        Animal bird = new Animal("Bird");           // Erzeuge Objekt bird vom Typ Animal und übergebe an den Konstruktor "Bird"
        list.add(bird);                                   // füge den Inhalt des Objekts bird der Liste list hinzu
        assertEquals("Bird", list.toString());    // Vergleiche expected "Bird" mit dem aktuellen Wert der Liste,
    }                                                     // Liste gibt keine Strings deshalb muss toString aufgerufen werden

    @Test
    void testMoreThanOneAnimal() {
        AnimalList list = new AnimalList();
        list.add(new Animal("Bird"));
        list.add(new Animal("Ape"));
        list.add(new Animal("Dog"));
        assertEquals("Bird -> Ape -> Dog", list.toString());
    }

    @Test
    void removeAnimalFromList() {
    var list = new AnimalList();
    list.add(new Animal("Plane"));
    list.add(new Animal("Horse"));
    list.remove(new Animal("Plane"));
    assertEquals("Horse", list.toString());

    }


}

