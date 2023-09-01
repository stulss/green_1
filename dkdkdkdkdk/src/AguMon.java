/*
public class AguMon implements Character {
    private int experience=40;
    private int energy=50;
    private int level=1;


    @Override
    public  void eat(){
        energy+=25;
        System.out.println("에너지 회복!!");
        System.out.println("");
    }

    @Override
    public  void sleep(){
        energy+=10;
        System.out.println("에너지 회복!!");
        System.out.println("");
    }

    @Override
    public  void play(){
        energy-=30;
        experience+=30;
        System.out.println("에너지 소모!!");
        System.out.println("experience UP");
        System.out.println("");
    }
    @Override
    public  void train(){
        energy-=20;
        experience+=20;
        System.out.println("에너지 소모!!");
        System.out.println("experience UP");
        System.out.println("");
    }
    @Override
    public  void levelUP(){
        if(experience>60){
            experience-=40;
            level++;
            System.out.println("레벨업!!" + level);
            System.out.println("");
        }
    }
    @Override
    public  boolean endGame(){
        boolean returnValue=true;
        if(level>4){
            System.out.println("아구몬 진화~ 그레이몬!!");
            returnValue=false;
        } else if (energy<0) {
            System.out.println("아구몬이 죽었습니다.");
            returnValue=false;
        }
        return returnValue;
    }

    @Override
    public void printInfo() {
        System.out.println("=====================");
        System.out.println("     아구몬 정보창     ");
        System.out.println("  experience: "+experience);
        System.out.println("  energy: "+energy);
        System.out.println("  level: "+ level);
        System.out.println("=====================");
    }

}
*/