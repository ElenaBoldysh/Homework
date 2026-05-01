public class Array {
    public static int processArray(String[][] array) throws MyArraySizeException, MyArrayDataException {
        if (array == null) {
            throw new MyArraySizeException("Массив не должен быть null");
        }
        if (array.length!=4) {
            throw new MyArraySizeException("Ожидаемый размер массива: 4 строки, получено: " + array.length);
        }
        for (int i = 0; i < 4; i++) {
            if (array[i] == null) {
                throw new MyArraySizeException("Строка" + i + "массива не должна быть null");
            }

            if (array[i].length!= 4) {
                throw new MyArraySizeException(
                        "Ожидаемый размер строки: 4 элемента, в строке" + i + "получено:" + array[i].length
                );
            }
        }
        System.out.println("Массив имеет корректный размер 4x4. Обработка продолжается...");

        // Логика обработки массива
        int sum = 0;
        for (int i = 0; i < 4; i ++) {
            for (int j = 0; j < 4; j ++) {
                try {
                    sum += Integer.parseInt (array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException (
                            "Некорректные данные в ячейке [" + i + "][" + j + "]:" + array[i][j]
                    );
                }
            }
        }

        return sum;
    }
}
