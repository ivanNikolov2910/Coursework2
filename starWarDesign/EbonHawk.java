package starWarDesign;

public class EbonHawk extends Battleship {

    public EbonHawk(long id, String name, Color color, int attackDamage, int life, int shield, int capacity) {
        super(id, name, color, attackDamage, life, shield, capacity);

    }
    @Override
    public void attack(Battleship attackedBattleship) {}

    @Override
    public void takeDamage(int damage) {}

    public void heal(int heal) {this.life += heal;}
}


