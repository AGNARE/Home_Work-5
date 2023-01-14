public class Hero {
    private  int hp;   // hp - Здоровье
    private  int damage; // damage - урон
    private String superpower = "Magic"; //  superpower - Суперспособность

    public Hero(int hp, int damage, String superpower){
        this.hp = hp;
        this.damage = damage;
        this.superpower = superpower;
    }
    public Hero (int damage, int hp){
        this.damage = damage;
        this.hp = hp;
    }

    public int getHp(){return hp;}

    public int getDamage(){return damage;}

    public String getSuperpower(){return superpower;}

}
