// 박세진 , 2023.09.11

public class GoDungeon {
    War war = new War();

    public void DungeonMenu() {
        System.out.println("1.고블린 소굴");
        System.out.println("2.오크의 전초기지");
        System.out.println("3.나이트 엘프의 숲");
        System.out.println("4.얼어붙은 설산");
        System.out.println("5.마을로 돌아가기 ");
    }
    public void Update(Charactor c) {
        DungeonMenu();
        switch (ScannerManager.Scan()) {
            case 1:
                war.Fight(c,1);
                break;
            case 2:
                war.Fight(c,2);
                break;
            case 3:
                war.Fight(c,3);
                break;
            case 4:
                war.Fight(c,4);
                System.out.println("Game Clear!!!");
                System.exit(0);
                break;
            case 5:
                break;
            default:
                System.out.println("그런 번호는 없습니다.");
                break;
        }
    }
}
