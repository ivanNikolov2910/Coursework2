package starWarDesign;

public class MilenniumFalcon extends Battleship{
    private int dodge;

    public MilenniumFalcon(long id, String name, Color color, int attackDamage, int life, int shield, int capacity) {
        super(id, name, color, attackDamage, life, shield, capacity);
    }


    @Override
    public void attack(Battleship attackedBattleship) {
        attackedBattleship.takeDamage(this.attackDamage*2);
    }

    @Override
    public void takeDamage(int damage) {
        if (this.shield > 0){
            this.shield -= (damage + 200);
        }else if (this.shield <=0 && this.life > 0){
            this.life -= (damage + 200);
        }
    }
}

