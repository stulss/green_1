public class Main {

    public static void main(String[] args) {

        ScanManager.Initialize();

        MainUpdate Main = new MainUpdate();
        Main.Initialzie();

        double delayTime = 3000; // 1000 분의 1초
        long deltaTime = System.currentTimeMillis();

        while(true){
            if(deltaTime + delayTime < System.currentTimeMillis())
            {
                deltaTime = System.currentTimeMillis();
                
                // ** 루프
                //Main.MainMenu();
                int result = Main.Update();

                if(result == 1)
                    return;
            }
        }

    }
}