package src.Pokemons;

import java.util.ArrayList;
import src.Actions.Attack;

public abstract class Pokemon {
    private String name;
    private Type type;
    private int hp;
    private ArrayList<Attack> attacks = new ArrayList<Attack>();


    public Pokemon(ArrayList<Attack> attacks, int hp, Type type, String name) {
        this.attacks = attacks;
        this.hp = hp;
        this.type = type;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public int getHp() {
        return hp;
    }
    public void setHp(int hp) {
        this.hp = hp;
    }


    public ArrayList<Attack> getAttacks() {
        return attacks;
    }

    public abstract int doAttack(Attack attack);

    public void receiveDamage(int damage){
        this.hp -= Math.max(0, this.hp - damage);
    }
}
