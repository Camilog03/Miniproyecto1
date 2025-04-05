import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import Pokemons.Type;
import Pokemons.WaterPokemon;
import Pokemons.ElectricPokemon;
import Pokemons.FirePokemon;
import Pokemons.FlyingPokemon;
import Pokemons.GroundPokemon;
import Pokemons.PlantPokemon;
import Pokemons.Pokemon;
import Pokemons.RockPokemon;

public class Trainer {
    private String trainerName;
    private ArrayList<Pokemon> list = new ArrayList<Pokemon>();
    private static final byte MAX_POKEMON = 3;

    public Trainer(String trainerName, ArrayList<Pokemon> list) {
        this.trainerName = trainerName;
        this.list = new ArrayList<Pokemon>();
    }
    //Getters and setters
    public String getTrainerName() {
        return trainerName;
    }

    public void setTrainerName(String trainerName) {
        this.trainerName = trainerName;
    }

    public ArrayList<Pokemon> getList() {
        return list;
    }

    public void setList(ArrayList<Pokemon> list) {
        this.list = list;
    }

    public static byte getMaxPokemon() {
        return MAX_POKEMON;
    }
    
    //Method to add pokemon to team randomly
    public void addRandomPokemon(ArrayList<Pokemon> available){
        Random rand = new Random();
        for (int i = 0; i < getMaxPokemon(); i++) {
            int index = rand.nextInt(available.size());
            list.add(available.get(index));
            available.remove(index);
        }
    }
    
    //Method to add pokemon created by the trainer
    public void addCreatedPokemon(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Vamos a crear tus pokemones!");

        for (int i = 0; i < getMaxPokemon(); i++) {
            System.out.println("Pokemon " + (i+1));
            System.out.println("Ingresa el nombre de tu pokemon:");
            String name = sc.nextLine();

            System.out.println("Ingresa la vida (hp) de tu pokemon: ");
            int hp = sc.nextInt();
            sc.nextLine();

            System.out.println("Tipos disponibles de pokemon:");
            for (Type types : Type.values()) {
                System.out.println("- " + types);
            }

            boolean option = false;
            Type type = null;
            //To receive a valid option
            while(!option){
                System.out.println("Ingresa el tipo de tu pokemon:");
                String election = sc.nextLine().toUpperCase();

                for (Type t : Type.values()) {
                    if(t.name().equals(election)){
                        type = t;
                        option=true;
                        break;
                    }
                }

                if (!option) {
                    System.out.println("Tipo inválido. Intenta de nuevo.");
                }
            }
            //Create the pokemon according to its type
            switch (type) {
                case ELECTRIC:
                    list.add(new ElectricPokemon(null, hp, type, name));
                    break;
                case FIRE:
                    list.add(new FirePokemon(null, hp, type, name));
                    break;
                case FLYING:
                    list.add(new FlyingPokemon(null, hp, type, name));
                    break;
                case GROUND:
                    list.add(new GroundPokemon(null, hp, type, name));
                    break;
                case PLANT:
                    list.add(new PlantPokemon(null, hp, type, name));
                    break;
                case ROCK:
                    list.add(new RockPokemon(null, hp, type, name));
                    break;
                case WATER:
                    list.add(new WaterPokemon(null, hp, type, name));
                    break;
                default:
                    break;
            }

        }
        sc.close();
    }

    //Method to sort pokemon from least to most health
    public void Sortlist(ArrayList<Pokemon> teamCreated){
        
    }

}
