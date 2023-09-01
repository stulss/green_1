public class Acting {

    DataCalculator dataCalculator = new DataCalculator();
    AnimalData animalData = AnimalData.getInstance();
    Status status = new Status();

    public void excercise(){
        animalData.setMax_hp(dataCalculator.dataMaxPlus(animalData.getMax_hp(),5));
        animalData.setHp(dataCalculator.dataMinus(animalData.getHp(),5));
        animalData.setSp(dataCalculator.dataMinus(animalData.getSp(),5));
        animalData.setStarve(dataCalculator.dataMinus(animalData.getStarve(),5));
        status.nowStatus();

    }

    public void shower() {
        animalData.setHp(dataCalculator.dataPlus(animalData.getHp(), animalData.getMax_hp(),10));
        animalData.setSp(dataCalculator.dataMinus(animalData.getSp(),10));
        animalData.setHappy(dataCalculator.dataPlus(animalData.getHappy(),animalData.getMax_happy(),6));
        status.nowStatus();
    }

    public void walk(){
        animalData.setHp(dataCalculator.dataPlus(animalData.getHp(), animalData.getMax_hp(),10));
        animalData.setSp(dataCalculator.dataMinus(animalData.getSp(),10));
        animalData.setLoneliness(dataCalculator.dataMinus(animalData.getLoneliness(),10));
        animalData.setHappy(dataCalculator.dataPlus(animalData.getHappy(), animalData.getMax_happy(),10));
        animalData.setStarve(dataCalculator.dataPlus(animalData.getStarve(), animalData.getMax_starve(),10));
        status.nowStatus();
    }

    public void sleep() {
        animalData.setHp(
                dataCalculator.dataPlus(
                        animalData.getHp(),
                        animalData.getMax_hp(),
                        20));

        animalData.setSp(dataCalculator.dataPlus(animalData.getSp(), animalData.getMax_sp(),20));
        animalData.setLoneliness(dataCalculator.dataMinus(animalData.getLoneliness(),10));
        animalData.setHappy(dataCalculator.dataPlus(animalData.getHappy(), animalData.getMax_happy(),20));
        animalData.setStarve(dataCalculator.dataMinus(animalData.getStarve(),20));
        status.nowStatus();
    }

    public void food(int food) {

        animalData.setHappy(dataCalculator.dataPlus(animalData.getHappy(), animalData.getMax_happy(),10));
        animalData.setHp(dataCalculator.dataPlus(animalData.getHp(), animalData.getMax_hp(),15));
        animalData.setSp(dataCalculator.dataPlus(animalData.getSp(), animalData.getMax_sp(),15));


        status.nowStatus();

    }
}
