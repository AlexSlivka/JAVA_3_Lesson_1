import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] arr1 = {1, 3, 4, 5, 7, 8, 9, 6};
        String[] arrString = {"jbjhb", "uguyguyg", "ibbbb"};
        changeElemetsOfArray(arr1,1,2);
        changeElemetsOfArray(arrString,1,2);

        ArrayList<String> arrayLists = arrayToList(arrString);
        System.out.println(arrayLists);

        Box<Apple> box1 = new Box<>();
        Box<Orange> box2 = new Box<>();


        }

    public static void changeElemetsOfArray(Object[] arr, int indexFirstElement, int indexSecondElement) {
        if (indexFirstElement == indexSecondElement) {
            System.out.println("Индексы элементов массива совпадают. Операция невозможна.");
        } else if (indexFirstElement <= arr.length && indexSecondElement <= arr.length) {
            Object changeElement = arr[indexFirstElement];
            arr[indexFirstElement] = arr[indexSecondElement];
            arr[indexSecondElement] = changeElement;
        } else {
            System.out.println("Индексы элементов за пределами массива. Операция невозможна.");
        }
        for (Object c:arr) {
            System.out.print(c.toString() + " ");
        }
        System.out.println("");
    }

    public static <T> ArrayList<T> arrayToList(T[] arr){
        return new ArrayList<>(Arrays.asList(arr));
    }


}

