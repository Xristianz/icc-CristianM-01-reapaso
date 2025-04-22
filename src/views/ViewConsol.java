package views;

import Models.Persona;

public class ViewConsol {
    public void printPersonsArray(Persona[] personas){
        for (int i=0;i<personas.length; i++){
            System.out.println("nombre: " + personas[i].getNombre() + " Edad: " + personas[i].getEdad());
        }

    }

    public void printMessage(String message){


    }
    
}
