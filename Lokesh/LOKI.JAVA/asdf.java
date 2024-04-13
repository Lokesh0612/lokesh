public class sasa{
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int element1 = 2;
        searchElement(array1, element1);

        int[] array2 = {1, 3, 4, 56, 89};
        int element2 = 90;
        searchElement(array2, element2);
    }

    public static void searchElement(int[] array, int element) {
        int index = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println("Found at index " + index);
        } else {
            System.out.println("Not found");
        }
    }
}