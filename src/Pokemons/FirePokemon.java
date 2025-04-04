package Pokemons;

import java.util.ArrayList;
import Actions.Attack;

public class FirePokemon extends Pokemon {

    public FirePokemon(ArrayList<Attack> attacks, int hp, Type type, String name) {
        super(attacks, hp, type, name);
    }

    @Override
    public int doAttack(Attack attack) {

        return 0;
    }
}
