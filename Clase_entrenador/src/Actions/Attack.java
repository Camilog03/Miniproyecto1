package Actions;

public class Attack {
    private String name;
    private TypeOfDamage typeOfDamage;
    private int attackPower;


    public Attack(String name, TypeOfDamage typeOfDamage, int attackPower) {
        this.name = name;
        this.typeOfDamage = typeOfDamage;
        this.attackPower = attackPower;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public TypeOfDamage getTypeOfDamage() {
        return typeOfDamage;
    }


    public void setTypeOfDamage(TypeOfDamage typeOfDamage) {
        this.typeOfDamage = typeOfDamage;
    }


    public int getAttackPower() {
        return attackPower;
    }


    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }
    
}



