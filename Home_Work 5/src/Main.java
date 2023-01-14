import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        System.out.println("============ HEROES ===========");
        for (int i = 0; i < createHeroes().length; i++) {
            Hero hero = createHeroes()[i];
            System.out.println("Damage: " + hero.getDamage() + " Health: " + hero.getHp());
        }
        System.out.println("============= BOSS =============");
        Boss boss = new Boss(900, 93, "Phisic");
        System.out.println("Health: " + boss.getHeatlh(900) + " Hit: " + boss.getHit(93) + " Protection: " + boss.getProtection("Phisic"));
    }
    public static Hero[] createHeroes(){
        Hero heroes = new Hero(20,300);
        Hero heroes1 = new Hero(15,260);
        Hero heroes2 = new Hero(25,210);
        Hero[] allHeroes = new Hero[]{heroes,heroes1,heroes2};
        return allHeroes;
    }
}