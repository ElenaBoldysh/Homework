
public class HW2_5 {
    public static void main(String[] args) {
        // Пример использования метода
        try {
            String[][] array = {
                    {"1", "2", "3", "4"},
                    {"5", "6", "7", "8"},
                    {"9", "10", "11", "12"},
                    {"13", "14", "15", "16"}
            };
            int result = Array.processArray(array);
            System.out.println("Сумма элементов:" + result);

        } catch (MyArraySizeException e) {
            System.err.println("Ошибка размера массива:" + e.getMessage());
        } catch (MyArrayDataException e) {
            System.err.println("Ошибка данных в массиве:" + e.getMessage());
        }

        /*Задание 4
        // Попытка обратиться к элементу за пределами массива (вызовет исключение)
        int[][] intArray = new int[array.length][];
        for (int i = 0; i < array.length; i++) {
            intArray[i] = new int[array[i].length];
            for (int j = 0; j < array[i].length; j++) {
                intArray[i][j] = Integer.parseInt(array[i][j]);
            }
        }

        System.out.println("\nПреобразованный массив int:");
        System.out.println(intArray);
        try {
            int value = intArray[4][2]; // Строка 4 (индекс 4) не существует
            System.out.println("Значение элемента:" + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Ошибка:" + e.getMessage());
            System.err.println("Попытка доступа к элементу [" + 4 + "][" + 2 + "]");
        }
    }*/

    }
}
