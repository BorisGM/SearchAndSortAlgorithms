import java.util.Scanner;


public class BinarySearch {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        //Get the number of elements to create a tree
        System.out.println("Enter the number of elements: ");

        int  count = sc.nextInt();

        //Create an array
        int[] num = new int[count];

        //Store the elements in an array
        System.out.println("Enter the elements: ");

        for(int i=0; i<count; i++) {
            num[i] = sc.nextInt();
        }

        System.out.println("Enter the search element: ");

        int  searchValue = sc.nextInt();

        int first = 0;

        int last = count - 1;

        int middle = (first+last)/2;

        while ( first <= last ) {

            if (num [middle] < searchValue) {

                first = middle + 1;


            } else if ( num [middle] == searchValue ) {

                System.out.println("The search element is present in the location: " + (middle + 1));
                break;

            } else {

                last = middle - 1;
            }

            middle = (first+last)/2;
        }

        if(first>last)
            System.out.println("The search element " + searchValue + " is not found in the tree.");
    }


}
