package characters;

public class Monster {

    private String name;
    private int life;
    private int maxLife;
    private int stamina;
    private int maxStamina;
    private static int INSTANCES_COUNT = 0;

    protected void setLife(int life) {
        this.life = life;
    }

    public int getLife() {
        return life;
    }

    public int getMaxLife() {
        return maxLife;
    }

    protected void setMaxLife(int maxLife) {
        this.maxLife = maxLife;
    }

    public int getMaxStamina() {
        return maxStamina;
    }

    protected void setMaxStamina(int maxStamina) {
        this.maxStamina = maxStamina;
    }

    public int getStamina() {
        return stamina;
    }

    protected void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    public Monster() {
        INSTANCES_COUNT++;
        this.setName("Monster_" + INSTANCES_COUNT);
        this.setLife(10);
        this.setStamina(10);
        this.setMaxLife(10);
        this.setMaxStamina(10);

    }

    public Monster(String name) {
            this();
            this.setName(name);

    }

    public void printStats() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "[ characters.Monster ]\t" + this.getName() + "\tLIFE: " + this.getLife() + "\tSTAMINA: " + this.getStamina() + "\t" + (this.isAlive() ? ("(ALIVE)") : ("(DEAD)"));
    }

    public boolean isAlive() {
        return (this.getLife() > 0);
    }


}
