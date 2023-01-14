public class Boss {   // Создать класс Босса (Boss), с приватными полями здоровья
                      // урон и тип защиты.
                      // Добавить в класс геттеры и сеттеры для всех полей.
    private int heatlh;   // heatlh - здоровье
    private int hit;  // hit - урон
    private String protection; // protection - защита

   public Boss (int heatlh, int hit, String protection){
        this.heatlh = heatlh;
        this.hit = hit;
        this.protection = protection;
    }



    public int getHeatlh(int heatlh){
        return heatlh;}

    public void setHeatlh(int heatlh) {
        this.heatlh = heatlh;
    }

    public  int getHit(int hit){
    return hit;

   }
    public  void setHit(int hit){
        this.hit = hit;

   }

    public String getProtection(String protection){
        return protection;

   }
    public void setProtection(String protection){
        this.protection = protection;

   }
}
