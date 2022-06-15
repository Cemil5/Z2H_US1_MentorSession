package week_09;

public class Fighter {

    public String name;
    public int health;
    public int damagePerAttack;

    public void setInfo(String name, int health, int damagePerAttack) {
        this.name = name;
        this.health = health;
        this.damagePerAttack = damagePerAttack;
    }

    public String toString() {
        return name;
    }
}
