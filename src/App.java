
import Controllers.PersonaController;
import Models.Persona;
import views.ViewConsol;
public class App {
    public static void main(String[] args) throws Exception {
        Persona[] personas = new Persona[] {
            new Persona("Juan",25),
            new Persona("Maria", 30),
            new Persona("Carlos", 22),
            new Persona("Ana", 28),
            new Persona("Luis", 35),
            new Persona("Sofia", 27),
            new Persona("Miguel", 40),
            new Persona("Laura", 40),
            new Persona("Pedro", 29),
            new Persona("Elena", 26),
            

        };
        ViewConsol v = new ViewConsol();
        v.printPersonsArray(personas);
        System.out.println("ordenado");
        PersonaController ordenar = new PersonaController();
        ordenar.ordenarPorEdad(personas);
        v.printPersonsArray(personas);
        PersonaController buscar = new PersonaController();
        buscar.buscarPorEdad(personas, 22);
        System.out.println("buscar");
        System.out.println(buscar);




        /// TODO: GENERAR INSTNACIA DE CONTROLLE Y ORDENAR EL METODO DESPUES BUSCAR POR
        /// LA EDAD

    }
}
