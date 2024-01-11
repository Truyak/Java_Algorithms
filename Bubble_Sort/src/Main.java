public class Main {

    public static void main(String[] args) {
        int[] array = {23, 15, -44, 6, 54, 12, -5};

        int i;

        for(i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }

        System.out.println();

        for(int lastUnsortedIndex = array.length-1; lastUnsortedIndex > 1; lastUnsortedIndex--){
            for(i = 0; i < lastUnsortedIndex; i++){
                if(array[i] > array[i+1]){
                    swap(array, i, i+1);
                }
            }
        }


        for(i = 0; i < 7; i++){
            System.out.print(array[i] + " ");
        }
    }

    public static  void swap(int[] array, int i, int j){
        if(i == j){
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;

    }
}