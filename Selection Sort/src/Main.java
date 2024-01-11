public class Main {
    public static void main(String[] args) {
        int[] array = { 13, 25, 2, 6, 55, -53, 21 };

        for(int j : array){
            System.out.print(j + " ");
        }
        System.out.println();

        for(int lastUnsorted = array.length - 1; lastUnsorted > 0; lastUnsorted--){
            int max_v = 0;
            for(int i = 1; i <= lastUnsorted; i++){
                if(array[i] > array[max_v]) {
                    max_v = i;
                }
            }
            swap(array, max_v, lastUnsorted);
        }

        for (int j : array) {
            System.out.print(j + " ");
        }
    }


    public static void swap(int[] array, int i, int j){
        if(i == j) {
            return;
        }
        else {
            int temp;
            temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
}