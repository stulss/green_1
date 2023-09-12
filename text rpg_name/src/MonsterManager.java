import java.util.LinkedList;
import java.util.List;

public class MonsterManager {

    private static MonsterManager instance = null;

    public static MonsterManager getInstance(){
        if(instance==null){
            instance = new MonsterManager();
        }
        return instance;
    }

     protected MonsterManager(){MonsterList = new LinkedList<>();}


    private List<Monster> MonsterList;

    protected void GoblinList()
    {
        // Monster creation
        MonsterList.add(new Monster("고블린", 10, 1, 0, 9));
        MonsterList.add(new Monster("고블린", 10, 1, 0, 9));
        MonsterList.add(new Monster("고블린보스", 14, 2, 0, 9));
    }

    protected void OrkList()
    {
        // Monster creation
        MonsterList.add(new Monster("오크", 12, 3, 0, 9));
        MonsterList.add(new Monster("오크", 12, 3, 0, 9));
        MonsterList.add(new Monster("오크보스", 26, 4, 0, 9));
    }
    protected void ElfList()
    {
        // Monster creation
        MonsterList.add(new Monster("나이트엘프정찰병", 12, 5, 0, 9));
        MonsterList.add(new Monster("나이트엘프정찰병", 12, 5, 0, 9));
        MonsterList.add(new Monster("나이트엘프네임드", 15, 7, 0, 9));
        MonsterList.add(new Monster("나이트엘프보스", 20, 8, 0, 9));
    }
    protected void LastBoss()
    {
        // Monster creation
        MonsterList.add(new Monster("리치왕 아서스 메놀드", 92, 9, 1, 11));
    }



    public Monster getMonsterList(int i) {
        return MonsterList.get(i);
    }

    public void remove(){MonsterList.remove(0);}
}
