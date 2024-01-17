public class Main {
    public static void main(String[] args) {
        int[] array = { 12, 34, -5, 6, 23, 2 };

        for(int j : array) System.out.print(j + " ");
        System.out.println();

        //sorting
        for(int firstUnsorted = 1; firstUnsorted < array.length ; firstUnsorted++){
            int comp = array[firstUnsorted];
            for(int i = firstUnsorted; i > 0 && array[i - 1] > comp; i--){
                if(array[i - 1] <= comp){
                    array[i] = comp;
                    break;
                }
                else {
                    array[i] = array[i - 1];
                    array[i - 1] = comp;
                }
            }
        }

        for(int j : array) System.out.print(j + " ");
    }

}