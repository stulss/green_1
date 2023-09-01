public class AnimalData {
    private static AnimalData instance = null;
    private AnimalData(){}
    public static AnimalData getInstance(){
        if (instance == null){
            instance = new AnimalData();
        }
        return instance;
    }

    private int hp=50;
    private int sp=50;
    private int loneliness=50;
    private int happy=50;
    private int starve=100;



    public int getHp() {return hp;}
    public void setHp(int hp) {this.hp = hp;}
    public int getSp() {return sp;}
    public void setSp(int sp) {this.sp = sp;}
    public int getLoneliness() {return loneliness;}
    public void setLoneliness(int loneliness) {this.loneliness = loneliness;}
    public int getHappy() {return happy;}
    public void setHappy(int happy) {this.happy = happy;}
    public int getStarve() {return starve;}
    public void setStarve(int starve) {this.starve = starve;}

}

