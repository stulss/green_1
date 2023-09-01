public class MainUpdate {

    private  Pet pet;

    public void Initialzie()
    {
        while(true)
        {
            System.out.println("1. 강아지: ");
            System.out.println("2. 고양이 ");
            System.out.println("캐릭터를 선택하세요 : ");

            int choice = ScanManager.Scan();

            switch(choice)
            {
                case 1:
                    pet = new Dog();
                    break;

                case 2:
                    pet = new Cat();
                    break;
                default:

                    break;
            }

            if(choice != 1 && choice != 2)
                continue;

            pet.initialize();
            break;
        }
    }

    private void MainMenu()
    {
        System.out.println("** 매뉴 **");
        System.out.println("1. 산책");
        System.out.println("2. 먹기");
        System.out.println("3. 잠자기");
        System.out.println("0. 게임 종료");
        System.out.print("매뉴를 선택해주세요: ");
    }

    public int Update()
    {
        MainMenu();

        switch(ScanManager.Scan())
        {
            case 0:
                System.out.println("게임이 종료됩니다.");
                return 1;

            case 1:
                pet.walk();
                break;

            case 2:
                pet.eat();
                break;

            case 3:
                pet.sleep();
                break;

            case 4:
                pet.bark();
                break;

            default:
                System.out.println("잘못 입력 했습니다.");
                System.out.println("다시 입력하세요");
                break;
        }

        return 0;
    }
}


























