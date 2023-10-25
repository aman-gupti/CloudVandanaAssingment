import java.util.Random;
class ShuffleArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        Random rand = new Random();
        System.out.println("Original Array:");
        for(int arr:array){
            System.out.print(arr+" ");
        }
        
        for (int i =array.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);

            // Swap array[i] and array[j]
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }

        System.out.println("\nShuffled Array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}