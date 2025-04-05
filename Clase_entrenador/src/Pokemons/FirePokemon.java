package Pokemons;

import java.util.ArrayList;
import Actions.Attack;
//import Actions.TypeOfDamage;

public class FirePokemon extends Pokemon {

    public FirePokemon(ArrayList<Attack> attacks, int hp, Type fire, String name) {
        super(attacks, hp, fire, name);
    }

    @Override
    public int doAttack(Attack attack) {

        return 0;
    }
    
}
