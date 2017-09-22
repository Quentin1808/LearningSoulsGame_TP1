package characters;

public class Hero {

    private String name;
    private int life;
    private int maxLife;
    private int stamina;
    private int maxStamina;

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

    public Hero() {
        this.setName("Gregooninator");
        this.setLife(100);
        this.setStamina(50);
        this.setMaxLife(100);
        this.setMaxStamina(50);
    }

    public Hero(String name) {
        this();
        this.setName(name);

    }

    public void printStats() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "[ characters.Hero ]\t" + this.getName() + "\tLIFE: " + this.getLife() + "\tSTAMINA: " + this.getStamina() + "\t" + (this.isAlive()? ("(ALIVE)"):("(DEAD)"));
    }

    public boolean isAlive() {
        return (this.getLife()>0);
    }


    // 6)La visibilité optimale est protected car elle permet d'accéder à la méthode depuis le même package

    // 7)La visibilité optimale est public car il n'y a qu'elle qu'y permet d'accéder à la méthode
}
