public class HW2_2 {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        methodFive(1,2);
        methodSix(-3);
        methodSeven(-2);
        methodEight("Well done!", 5);
        methodNine(2024);
        methodTen(args);
        methodEleven(args);
        methodTwelve(args);
        methodThirteen(args);
        methodFourteen(7,3);
    }
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    public static void checkSumSign() {
        int a = 4;
        int b = -3;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
    public static void printColor() {
        int value = 123;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }
    public static void compareNumbers() {
        int a = 25;
        int b = 32;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
    public static void methodFive(int a, int b) {
        int sum = a + b;
        boolean isInRange = (sum >= 10) && (sum <= 20);
        System.out.println(isInRange);
    }
    public static void methodSix(int number) {
        if (number >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }
    public static void methodSeven(int number) {
        boolean negative = number < 0;
        System.out.println(negative);
    }
    public static void methodEight(String str, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(str);
        }
    }
    public static void methodNine(int year) {
        boolean yearNow = false;
        if ((year% 4 == 0 && year% 100!= 0) || (year% 400 == 0)) {
            yearNow = true;
        }
        System.out.println(yearNow);
    }
    public static void methodTen(String[] args) {
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.print("Исходный массив: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            }
            else if (array[i] == 1) {
                array[i] = 0;
            }
        }
        System.out.print("Изменённый массив: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public static void methodEleven(String[] args) {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public static void methodTwelve(String[] args) {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.print("Исходный массив: ");
        for (int i = 0; i < array.length; i++)  {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < array.length; i++){
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }
        System.out.print("Изменённый массив: ");
        for (int num: array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    public static void methodThirteen(String[] args) {
        int size = 5;
        int[][] array = new int[size][size];
        for (int i = 0; i < size; i++) {
            array[i][i] = 1; // Главная диагональ
            array[i][size -1 -i] = 1; // Побочная диагональ
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void methodFourteen(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }
        System.out.print("Массив: ");
        for (int value: array) {
            System.out.print(value + " ");
        }
    }
}
