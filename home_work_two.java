public class home_work_two {

        public static void main(String[] args) {

            //1. Задать целочисленный массив, состоящий из элементов 0 и 1.
            // Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
            System.out.println("\r\n1 - задание");
            int[] myArray1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
            for (int i = 0; i < myArray1.length; i++) {
                myArray1[i] = myArray1[i] == 1 ? 0 : 1;
                System.out.print(myArray1[i] + " ");
            }

            //2. Задать пустой целочисленный массив размером 8.
            // Написать метод, который помощью цикла заполнит его значениями 1 4 7 10 13 16 19 22;
            System.out.println("\r\n2 - задание");
            int[] myArray2 = new int[8];
            myArray2[0] = 1;
            for (int i = 1, j = 1; i < myArray2.length; i++) myArray2[i] = j += 3;
            for (int x : myArray2) System.out.print(x + " ");

            //3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ], написать метод,
            // принимающий на вход массив и умножающий числа меньше 6 на 2;
            System.out.println("\r\n3 - задание");
            int[] myArray3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
            for (int i = 0; i < myArray3.length; i++) {
                if (myArray3[i] < 6) myArray3[i] *= 2;
                System.out.print(myArray3[i] + " ");
            }

            //4. Задать одномерный массив. Написать методы поиска в нём минимального и максимального элемента;
            System.out.println("\r\n4 - задание");
            int[] myArray4 = {11, 6, 4, 3, 12, 5, 6, 3, 5, 9, 10, 2};
            int min = myArray4[0], max = myArray4[0], indMax = 0, indMin = 0;
            for (int i = 0; i < myArray4.length; i++) {
                if (myArray4[i] > max) {
                    max = myArray4[i];
                    indMax = i;
                }
                if (myArray4[i] < min) {
                    min = myArray4[i];
                    indMin = i;
                }
            }
            System.out.println("Максимальный элемент находится в массиве под индексом " + indMax + " со значением  = " + max);
            System.out.println("Минимальный элемент находится в массиве под индексом " + indMin + " со значением  = " + min);

            //5**. Создать квадратный целочисленный массив (количество строк и столбцов одинаковое),
            // заполнить его диагональные элементы единицами, используя цикл(ы);
            System.out.println("\r\n5** - задание");
            final int MAX = 5;
                int[][] myArray5 = new int[MAX][MAX];
                    for (int i = 0; i < myArray5.length /2 + 1 ; i++) {
                    for (int j =  i; j < myArray5.length - i; j++) {
                        myArray5[i][j] = 1;
                        myArray5[myArray5.length - i - 1][j] = 1;
                }
            }
            for (int []row:myArray5){
                for (int value: row){
                    System.out.print(" " + value + " ");
                }
                System.out.println();
            }
        }
}
