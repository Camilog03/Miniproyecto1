package src.Pokemons;

import java.util.ArrayList;
import Pokemons.Type;
import src.Actions.Attack;

public class RockPokemon extends Pokemon {

    public RockPokemon(ArrayList<Attack> attacks, int hp, Type type, String name) {
        super(attacks, hp, type, name);
    }

    @Override
    public int doAttack(Attack attack) {
        return 0;
    }
}
