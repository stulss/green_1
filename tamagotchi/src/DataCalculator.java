public class DataCalculator {

    AnimalData animalData = AnimalData.getInstance();

    public int dataPlus(int data,int max_data,int value){
        if (data < max_data) {
            data = data + value;
            if (data > max_data) {
                data = max_data;
            }
        }
        return data;
    }

    public int dataMinus(int data,int value){
        if (data > 0) {
            data = data - value;
            if (data < 0) {
                data = 0;
            }
        }
        return data;
    }

    public int dataMaxPlus(int max_data,int value){
        if (max_data<200){
            max_data+=value;
            if (max_data>200){
                max_data=200;
            }
        }
        return max_data;
    }

    public int dataMaxMinus(int max_data,int value){
        if (max_data>50){
            max_data-=value;
            if (max_data<50){
                max_data=50;
            }
        }
        return max_data;
    }
}
