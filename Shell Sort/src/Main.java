public class Main {
    public static void main(String[] args) {
        int[] array = { 16, 23, 8, -3, 7, -12, 19};

        for(int k: array){
            System.out.print(k + " ");
        }
        System.out.println();


        //sorting
        for(int gap = array.length/2; gap > 0; gap /= 2){
            //it is decreasing the gap by over 2 at every iteration until it is 0
            for(int i = gap; i < array.length; i++){
                //it is looking array's gap element
                int new_ = array[i];//it is actually temporary variable to store array's i element.

                int j = i;//j is also temporary variable to store i, we will decrease the j so, we don't want to change i.

                while(j >= gap && array[j - gap] > new_){//i's value can be max array.length and, We are looking to j's
                                                         //value and j-gap's value so, I start from end, I end at the
                                                         //beginning + gap's value AND if j-gap's value is smaller than
                                                         //our temporary new_ value we should enter the while statement.
                    array[j] = array[j - gap];//Assign smaller one to the bigger one so, it will do i.e. 4,2,3,5 to 4,2,4,5
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