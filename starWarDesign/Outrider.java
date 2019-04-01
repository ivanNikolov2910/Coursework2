package starWarDesign;

public class Outrider extends Battleship{
    private int plasmaDefence;

    public Outrider(long id, String name, Color color, int attackDamage, int life, int shield, int capacity, int plasmaDefence) {
        super(id, name, color, attackDamage, life, shield, capacity);
        this.plasmaDefence = plasmaDefence;
        this.life += 100;

    }

    @Override
    public void attack(Battleship attackedBattleship) {
        attackedBattleship.takeDamage(this.attackDamage);
    }

    @Override
    public void takeDamage(int damage) {
        if (this.shield > 0){
            this.shield -= (damage - 50);
        }else if (this.shield <=0 && this.life > 0){
            this.life -= (damage - 50);
        }
    }
}


