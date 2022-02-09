import java.util.ArrayList;
import java.util.Arrays;
public class Runner {
    public static void main(String[] args) {
        ArrayList<Integer> intList14 = new ArrayList<Integer>(Arrays.asList(1, 1, 2, 4, 5, 2, 2, 1, 6, 4, 4, 7, 1, 8, 4, 2));
        ArrayListAlgorithms.removeDuplicates(intList14);
        System.out.println(intList14);
        ArrayList<Integer> intList15 = new ArrayList<Integer>(Arrays.asList(1, 1, 1, 2, 1, 1, 1, 1, 3, 2, 1, 2, 2, 4, 3));
        ArrayListAlgorithms.removeDuplicates(intList15);
        System.out.println(intList15);
        ArrayList<Integer> intList16 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayListAlgorithms.removeDuplicates(intList16);
        System.out.println(intList16);





    }
}

