public class Main {
    public static void main(String[] args) {
        int[] array = { 16, 23, 8, -3, 7, -12, 19};

        for(int k: array){
            System.out.print(k + " ");
        }
        System.out.println();


        //sorting
        for(int gap = array.length/2; gap > 0; gap /= 2){
            for(int i = gap; i < array.length; i++){
                int new_ = array[i];

                int j = i;

                while(j >= gap && array[j - gap] > new_){
                    array[j] = array[j - gap];
                    j -= gap;
                }
                array[j] = new_;
            }
        }

        for(int k: array){
            System.out.print(k + " ");
        }
        System.out.println();

    }

}