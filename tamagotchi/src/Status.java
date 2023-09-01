public class Status {

    AnimalData animalData = AnimalData.getInstance();

    public void nowStatus(){
        if(animalData.getHp()<30){
            System.out.println("너무 아파요~");
        }
        if(animalData.getSp()<30){
            System.out.println("너무 지쳐요~");
        }
        if(animalData.getLoneliness()<30){
            System.out.println("너무 외로워요~");
        }
        if(animalData.getHappy()<30){
            System.out.println("너무 슬퍼요~");
        }
        if(animalData.getStarve()<30){
            System.out.println("너무 배고파요~");
        }
    }

    public void printStatus(){
        System.out.println(" hp: "+ animalData.getHp()+"\n" +
                " sp: "+ animalData.getSp()+"\n"+
                " loneliness: "+ animalData.getLoneliness()+"\n"+
                " happy: "+ animalData.getHappy()+"\n"+
                " starve: "+ animalData.getStarve()+"\n"+
                " max_hp: "+ animalData.getMax_hp()+"\n"+
                " max_sp: "+ animalData.getMax_sp()+"\n"+
                " max_loneliness: "+ animalData.getMax_loneliness()+"\n"+
                " max_happy: "+ animalData.getMax_happy()+"\n"+
                " max_starve: "+ animalData.getMax_starve()+"\n"
        );
        nowStatus();
    }


}
