
//import java.util.Random;
//        public class Main {
//            public static String permission(int age, int temperature) {
//                if (age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30) {
//                    return "Можно идти гулять";
//                } else if (age < 20 && temperature >= 0 && temperature <= 28) {
//                    return "Можно идти гулять";
//                } else if (age > 45 && temperature >= -10 && temperature <= 25) {
//                    return "Можно идти гулять";
//                } else {
//                    return "Оставайтесь дома";
//                }
//            }
//        public static void main(String[] args) {
//
//            for (int i = 0; i < 5; i++) {
//                int age = generateRandomAge();
//                int temperature = getRandomTemperature();
//                System.out.println("Возраст: " + age + ", Температура: " + temperature + " - " + permission(age, temperature));
//            }
//        }
//public static int generateRandomAge() {
//    Random random = new Random();
//    return random.nextInt(100);
//}
//        public static int getRandomTemperature() {
//            Random random = new Random();
//            return random.nextInt(66) - 30;
//        }
//}




//public class Main {
//    public static void main(String[] args) {
//        // Создаем массив из 15 дробных чисел
//        double[] numbers = {1.5, 2.5, -3.0, -4.5, 3.3, 4.2, -1.1, 2.8, 3.9, 5.1, -2.4, 4.0, -3.6, 2.3, 1.7};
//
//        // Переменные для подсчета суммы и количества положительных чисел после первого отрицательного числа
//        double sum = 0;
//        int count = 0;
//        boolean foundNegative = false; // Флаг для отслеживания первого отрицательного числа
//
//        // Проходим через массив с помощью цикла for-each
//        for (double number : numbers) {
//            if (foundNegative) {
//                // Если нашли первое отрицательное число, считаем только положительные числа после него
//                if (number > 0) {
//                    sum += number;
//                    count++;
//                }
//            } else if (number < 0) {
//                // Если нашли первое отрицательное число, устанавливаем флаг в true
//                foundNegative = true;
//            }
//        }
//
//        // Вычисляем среднее арифметическое и выводим его на экран
//        if (count > 0) {
//            double average = sum / count;
//            System.out.println("Среднее арифметическое положительных чисел после первого отрицательного: " + average);
//        } else {
//            System.out.println("После первого отрицательного числа нет положительных чисел.");
//        }
//    }
//}




//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int number = scanner.nextInt();
//        switch (number) {
//            case 1:
//                System.out.println("One");
//                break;
//            case 2:
//                System.out.println("Two");
//                break;
//            case 3:
//                System.out.println("Three");
//                break;
//            default:
//                System.out.println("Another number");
//                break;
//        }
//        scanner = new Scanner(System.in);
//        String name = scanner.nextLine();
//        switch (name) {
//            case "John":
//                System.out.println("Hello, John!");
//                break;
//            case "Alice":
//                System.out.println("Welcome, Alice!");
//                break;
//            default:
//                System.out.println("Hello, guest!");
//                break;
//        }
//
//        // Hi Sensei
//    }
//}







//import java.util.Random;
//
//public class Main {
//
//    public static String permission(int age, int temperature) {
//        if (age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30) {
//            return "Можно идти гулять";
//        } else if (age < 20 && temperature >= 0 && temperature <= 28) {
//            return "Можно идти гулять";
//        } else if (age > 45 && temperature >= -10 && temperature <= 25) {
//            return "Можно идти гулять";
//        } else {
//            return "Оставайтесь дома";
//        }
//    }
//
//    public static int generateRandomAge() {
//        Random random = new Random();
//        return random.nextInt(46);
//    }
//
//    public static void main(String[] args) {
//
//        for (int i = 0; i < 5; i++) {
//            int age = generateRandomAge();
//            int temperature = getRandomTemperature();
//            System.out.println("Возраст: " + age + ", Температура: " + temperature + " - " + permission(age, temperature));
//        }
//    }
//
//    public static int getRandomTemperature() {
//        Random random = new Random();
//        return random.nextInt(66) - 30;
//    }
//}






//import java.util.Arrays;
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        for (int i = 1; i <= 5; i = i + 1) {
//            System.out.println("Hello " + i);
//        }
//        System.out.println("-----------------");
//        for (int i = 1; i <= 10; i++) { // i = i + 1 => i++ (increment)
//            System.out.println("5 x " + i + " = " + 5 * i);
//        }
//        System.out.println("-----------------");
//        for (int i = 10; i >= 1; i--) { // i = i - 1 => i-- (decrement)
//            System.out.println("7 x " + i + " = " + 7 * i);
//        }
//        System.out.println("-----------------");
//        for (int i = 10; i >= 2; i = i - 2) { // i = i - 2 => i -= 2; i = i * 7 => i *= 7
//            System.out.println("9 x " + i + " = " + 9 * i);
//        }
//        System.out.println("-----------------");
//        int m = 0;
//        while (m < 3) {
//            System.out.println("JAVA " + m);
//            m++;
//        }
//        String str = "#";
//        while (str.length() <= 5) {
//            System.out.println(str);
//            str = str + "#";
//        }
//        System.out.println("-----------------");
//        int j = 0;
//        while (j > 0) {
//            System.out.println("Hello " + j);
//            j--;
//        }
//
//        do {
//            System.out.println("Hello " + j);
//            j--;
//        } while (j > 0);
//
//        String[] robots = new String[7];
//        /*robots[0] = "R2D0";
//        robots[1] = "R2D1";
//        robots[2] = "R2D2";
//        robots[3] = "R2D3";
//        robots[4] = "R2D4";*/
//        for (int k = 0; k < robots.length; k++) {
//            robots[k] = "R2D" + k;
//        }
//        System.out.println(Arrays.toString(robots));
//
//        String[] students = {"John", "Jane", "Julie", "Jack"};
//        for (String element : students) {
//            System.out.println("Hi " + element);
//        }
//        System.out.println("-----------------");
//        int[] numbers = {2, -13, 4, -10, 31};
//        for (int index = 0; index < numbers.length; index++) {
//            if (numbers[index] < 0) {
//                break; // Экстренно прерывает работу всего цикла
//            }
//            System.out.println(numbers[index]);
//        }
//        System.out.println("-----------------");
//        // int[] numbers = {2, -13, 4, -10, 31};
//        for (int index = 0; index < numbers.length; index++) {
//            if (numbers[index] < 0) {
//                continue; // Прерывает текущий круг цикла
//            }
//            System.out.println(numbers[index]);
//        }
//
//        while (true) {
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("Enter a number (to exit enter zero): ");
//            int number = scanner.nextInt();
//            if (number == 0) {
//                break;
//            }
//            System.out.println("Number times 2: " + number * 2);
//        }
//
//        for (int i = 1; i <= 3; i++) {
//            System.out.println("Внешний цикл " + i);
//            for (int n = 1; n <= 5; n++) { // nested loop
//                System.out.println("Внутренний цикл " + n);
//            }
//        }
//    }
//}


public class Main {
    public static void main(String[] args) {
        double[] numbers = {1.5, 2.5, -3.1, -4.2, 3.3, 4.4, -1.5, 2.6, 3.7, 5.8, -2.9, 4.0, -3.6, 2.3, 1.7};

        double sum = 0;
        int count = 0;
        boolean foundNegative = false;
        for (double number : numbers) {
            if (foundNegative) {

                if (number > 0) {
                    sum += number;
                    count++;
                }
            } else if (number < 0) {
                foundNegative = true;
            }
        }

        if (count > 0) {
            double average = sum / count;
            System.out.println("Среднее арифметическое положительных чисел (после первого отрицательного): " + average);
            System.out.println("(" + Example(numbers) + ") = " + sum + "/" + count);
        } else {
            System.out.println("После первого отрицательного числа нет положительных чисел.");
        }
    }

    public static String Example(double[] numbers) {
        StringBuilder example = new StringBuilder();
        boolean foundNegative = false;

        for (double number : numbers) {
            if (foundNegative) {
                if (number > 0) {
                    example.append((int) number).append(", ");
                }
            } else if (number < 0) {
                foundNegative = true;
                example.append((int) number).append(", ");
            } else {
                example.append((int) number).append(", ");
            }
        }

        if (example.length() > 0) {
            example.setLength(example.length() - 2);
        }

        return example.toString();
    }
}
