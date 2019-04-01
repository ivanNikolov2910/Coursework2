package starWarDesign;

public abstract class Battleship{
    protected long id;
    protected String name;
    protected Color color;
    protected int attackDamage;
    protected int life;
    protected int shield;
    protected int capacity;

    public Battleship(long id, String name, Color color, int attackDamage, int life, int shield, int capacity) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.attackDamage = attackDamage;
        this.life = life;
        this.shield = shield;
        this.capacity = capacity;
    }

    public abstract void attack(Battleship attackedBattleship);

    public abstract void takeDamage(int damage);

    public boolean isDestroyed(){
        if (this.life <= 0){
            return true;
        }
        return false;
    }
}

