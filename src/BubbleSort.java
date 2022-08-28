public class BubbleSort {
    public static void main(String[] args) {
//        int[] numbers = {25,12,89,45,65,35};
//        int temp;
//        for(int i=0;i<numbers.length;i++) {
//            for(int j=0;j<numbers.length;j++) {
//                if(numbers[i] < numbers[j]) {
//                    temp = numbers[i];
//                    numbers[i] = numbers[j];
//                    numbers[j] = temp;
//                }
//            }
//        }
//
//        System.out.println("Sorted list:");
//        for(int i=0;i<numbers.length;i++)
//            System.out.println(numbers[i]);
//    }
        int[] numbers = {25, 30, 40, 100, 123, 5, 3, 1, 70};
        int temp;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i] < numbers[j]){
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }

            }

        }
        System.out.println("Sorted list:");
        for (int number : numbers) {
            System.out.println(number);

        }
    }
}
