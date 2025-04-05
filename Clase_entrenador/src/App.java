import Pokemons.*;
import java.util.ArrayList;
import java.util.Scanner;

//import Actions.Attack;
//import Actions.TypeOfDamage;

public class App implements CreateRandomPokemon{
    public static void main(String[] args) throws Exception {
        int option;
        App app = new App();
        Scanner scanner = new Scanner(System.in);

        //Inicio menú
        System.out.println("-----------¡¡¡BINVENIDO AVENTURERO!!!-----------");
        System.out.println("");
        System.out.println("Para empezar, escribe los nombres de los entrendores: ");

        //Creación entrenadores
        Trainer entrenador1 = new Trainer(null, null);
        Trainer entrenador2 = new Trainer(null, null);
        //Asignación nombres de entrenadores
        System.out.print("Nombre entrenador 1: ");
        entrenador1.setTrainerName(scanner.nextLine());
        System.out.print("Nombre entrenador 2: ");
        entrenador2.setTrainerName(scanner.nextLine());
        /* 
        System.out.println(entrenador1.getTrainerName());
        System.out.println(entrenador2.getTrainerName());
        */

        System.out.println("¡¡Perfecto!! Ahora pasemos a elegir tu equipo poquemón");
        System.out.println("Entrenador " + entrenador1.getTrainerName() + " Deseas crear tu equipo? ");
        System.out.println("1. Crear equipo");
        System.out.println("2. Dame un equipo aleatorio");
        System.out.print("Digita tu opción: ");
        option = scanner.nextInt();
        if(option == 1){
            entrenador1.addCreatedPokemon();
            entrenador1.Sortlist(entrenador1.getList());
            System.out.println("El equipo de " + entrenador1.getTrainerName() + " es: ");
            for (Pokemon p:entrenador1.getList()){
                System.out.println(p);
            }
            
        }
        if (option == 2){
            entrenador1.addRandomPokemon(app.createPokemon());
            entrenador1.Sortlist(entrenador1.getList());
            System.out.println("El equipo de " + entrenador1.getTrainerName() + " es: ");
            for (Pokemon p:entrenador1.getList()){
                System.out.println(p);
            }
            scanner.close();
        }
        
    }
    
    //Método que crea una lista de pokemones para elegir aleatoriamente
    @Override
    public ArrayList<Pokemon> createPokemon() {
        ArrayList<Pokemon> list = new ArrayList<Pokemon>();
        list.add(new ElectricPokemon(null, 300, Type.ELECTRIC, "Raikou"));
        list.add(new ElectricPokemon(null, 500, Type.ELECTRIC, "Magneton"));
        list.add(new FirePokemon(null, 350, Type.FIRE, "Ninetales"));
        list.add(new FirePokemon(null, 800, Type.FIRE, "Charizard"));
        list.add(new FlyingPokemon(null, 900, Type.FLYING, "Corviknight"));
        list.add(new FlyingPokemon(null, 750, Type.FLYING, "Vespiquen"));
        list.add(new GroundPokemon(null, 450, Type.GROUND, "Onix"));
        list.add(new GroundPokemon(null, 600, Type.GROUND, "Ursaluna"));
        list.add(new PlantPokemon(null, 250, Type.PLANT, "Bulbasaur"));
        list.add(new PlantPokemon(null, 700, Type.PLANT, "Serperior"));
        list.add(new RockPokemon(null, 600, Type.ROCK, "Pupitar"));
        list.add(new RockPokemon(null, 950, Type.ROCK, "Rhyperior"));
        list.add(new WaterPokemon(null, 400, Type.WATER, "Blastoise"));
        list.add(new WaterPokemon(null, 100, Type.WATER, "Vaporeon"));
        return list;
   }
}