public class EnhancedPlayer {

    private String fullName;
    private int healthPercantage;
    private String weapon;

    public EnhancedPlayer(String fullName) {
        this(fullName, 100, "Sword");
    }

    public EnhancedPlayer(String fullName, int health, String weapon) {
        this.fullName = fullName;
        if (health <= 0){
            this.healthPercantage = 1;
        } else if (health > 100) {
            this.healthPercantage = 100;
        } else {
            this.healthPercantage = health;
        }
        this.weapon = weapon;
    }

    public void loseHealth(int damage){
        healthPercantage = healthPercantage - damage;
        if (healthPercantage <= 0) {
            System.out.println("Player knocked out of game");
        }
    }
    public int healthRemaining(){
        return healthPercantage;
    }
    public void restoreHealth(int extraHealth){
        healthPercantage = healthPercantage + extraHealth;
        if (healthPercantage > 100) {
            System.out.println("Player restored to 100");
            healthPercantage = 100;
        }
    }
}
