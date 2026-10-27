package org.example;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class App {

    static void task1() throws IOException {
        System.out.println("1");
        File file = new File("music.txt");

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write("Моя любимая музыка:\n");
            writer.write("Группа: Samurai drive\n");
            writer.write("Альбом: Samurai drive\n");
            writer.write("Песня: Hunt\n");
            writer.write("Жанр: электроника\n");
        } finally {
            System.out.println("Запись в " + file.getName() + " завершена");
        }
        if (!file.exists()) {
            throw new FileNotFoundException("Файл не существует: " + file.getName());
        }
        System.out.println("Данные о файле:");
        System.out.println("  Имя: " + file.getName());
        System.out.println("  Размер: " + file.length() + " байт");
        System.out.println("  Последнее изменение: " + file.lastModified());
        System.out.println("  Путь: " + file.getAbsolutePath());
        System.out.println("  Существует: " + file.exists());
        System.out.println("  Можно читать: " + file.canRead());
        System.out.println("  Можно писать: " + file.canWrite());
        System.out.println("  Это файл: " + file.isFile());
        System.out.println("  Это каталог: " + file.isDirectory());

        System.out.println("\nСодержимое файла:");
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            boolean hasContent = false;
            while ((line = reader.readLine()) != null) {
                System.out.println("  " + line);
                hasContent = true;
            }
            if (!hasContent) {
                throw new IllegalStateException("Файл не содержит строк: " + file.getName());
            }
        } finally {
            System.out.println("Чтение " + file.getName() + " завершено.");
        }
    }


    static void task2() throws IOException {
        System.out.println("\n2");
        File f = new File("f_task2.txt");
        Scanner sc = new Scanner(System.in);

        try (PrintWriter writer = new PrintWriter(new FileWriter(f))) {
            System.out.println("Введите 10 целых чисел:");
            for (int i = 0; i < 10; i++) {
                System.out.print("  Число " + (i + 1) + ": ");
                try {
                    int num = sc.nextInt();
                    writer.println(num);
                } catch (InputMismatchException e) {
                    String bad = sc.next();
                    throw new IllegalArgumentException(
                            "Ожидалось целое число, получено: \"" + bad + "\"", e);
                }
            }
        } finally {
            System.out.println("Ввод чисел завершён.");
        }

        int sum = 0, count = 0;
        System.out.println("\nЧисла из файла:");
        try (Scanner fileScanner = new Scanner(f)) {
            while (fileScanner.hasNextInt()) {
                int num = fileScanner.nextInt();
                System.out.print(num + " ");
                sum += num;
                count++;
            }
        }
        if (count == 0) {
            throw new IllegalStateException("В файле нет чисел: " + f.getName());
        }
        double avg = (double) sum / count;
        System.out.println("\nСреднее арифметическое: " + avg);
    }

    static void task3() throws IOException {
        System.out.println("\n3");
        File f = new File("f_task3.txt");
        File g = new File("g_task3.txt");
        File h = new File("h_task3.txt");
        Random random = new Random();

        try (PrintWriter writer = new PrintWriter(new FileWriter(f))) {
            for (int i = 0; i < 20; i++) {
                writer.println(random.nextInt(201) - 100);
            }
        } finally {
            System.out.println("Файл f сформирован.");
        }

        int totalRead = 0;
        try (Scanner scanner = new Scanner(f);
             PrintWriter writerG = new PrintWriter(new FileWriter(g));
             PrintWriter writerH = new PrintWriter(new FileWriter(h))) {

            while (scanner.hasNextInt()) {
                int num = scanner.nextInt();
                totalRead++;
                if (num % 10 == 0) writerG.println(num);
                else writerH.println(num);
            }
        } finally {
            System.out.println("Распределение по g и h завершено.");
        }

        if (totalRead == 0) {
            throw new IllegalStateException("Файл f пуст: " + f.getName());
        }

        System.out.println("\nФайл f_task3.txt:");
        printFile(f);
        System.out.println("Файл g_task3.txt (оканчивающиеся на 0):");
        printFile(g);
        System.out.println("Файл h_task3.txt (остальные):");
        printFile(h);
    }

    static void task4() throws IOException {
        System.out.println("\n4");
        File file = new File("noise.txt");
        Scanner sc = new Scanner(System.in);
        sc.useLocale(java.util.Locale.US); // разделитель — точка

        try (PrintWriter writer = new PrintWriter(new FileWriter(file))) {
            System.out.println("Введите 15 значений уровня шума (дБ), разделитель — точка:");
            for (int i = 0; i < 15; i++) {
                System.out.print("  Значение " + (i + 1) + ": ");
                try {
                    double value = sc.nextDouble();
                    if (value < 0) {
                        throw new IllegalArgumentException(
                                "Уровень шума не может быть отрицательным: " + value);
                    }
                    writer.println(value);
                } catch (InputMismatchException e) {
                    String bad = sc.next();
                    throw new IllegalArgumentException(
                            "Ожидалось вещественное число, получено: \"" + bad + "\"", e);
                }
            }
        } finally {
            System.out.println("Ввод уровня шума завершён.");
        }

        double sum = 0;
        int count = 0;
        try (Scanner fileScanner = new Scanner(file)) {
            while (fileScanner.hasNextDouble()) {
                sum += fileScanner.nextDouble();
                count++;
            }
        }
        if (count == 0) {
            throw new IllegalStateException("Файл не содержит значений шума: " + file.getName());
        }
        System.out.println("Средний уровень шума: " + (sum / count) + " дБ");
    }

    static void task5() throws IOException {
        System.out.println("\n5");
        File f = new File("f_task5.txt");
        Random random = new Random();

        try (PrintWriter writer = new PrintWriter(new FileWriter(f))) {
            for (int i = 0; i < 10; i++) {
                writer.println(random.nextInt(41) - 10);
            }
        } finally {
            System.out.println("Файл f_task5.txt сформирован.");
        }

        int count = 0, total = 0;
        System.out.print("Числа в файле: ");
        try (Scanner scanner = new Scanner(f)) {
            while (scanner.hasNextInt()) {
                int num = scanner.nextInt();
                System.out.print(num + " ");
                total++;
                if (num > 10) count++;
            }
        } finally {
            System.out.println("\nПодсчёт завершён.");
        }

        if (total == 0) {
            throw new IllegalStateException("Файл пуст: " + f.getName());
        }
        System.out.println("Количество чисел > 10: " + count);
    }


    static void printFile(File file) throws IOException {
        try (Scanner scanner = new Scanner(file)) {
            boolean hasLine = false;
            while (scanner.hasNextLine()) {
                System.out.println("  " + scanner.nextLine());
                hasLine = true;
            }
            if (!hasLine) {
                throw new IllegalStateException("Файл пуст: " + file.getName());
            }
        }
    }

    public static void main(String[] args) {
        try {
            task1();
            task2();
            task3();
            task4();
            task5();
        } catch (FileNotFoundException e) {
            System.err.println("\nФАЙЛ НЕ НАЙДЕН " + e.getMessage());
        } catch (IOException e) {
            System.err.println("\nОШИБКА ВВОДА-ВЫВОДА " + e.getMessage());
        } catch (InputMismatchException e) {
            System.err.println("\nНЕВЕРНЫЙ ВВОД " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.err.println("\nНЕКОРРЕКТНЫЙ АРГУМЕНТ " + e.getMessage()
                    + (e.getCause() != null ? " (причина: " + e.getCause().getMessage() + ")" : ""));
        } catch (IllegalStateException e) {
            System.err.println("\nНЕКОРРЕКТНОЕ СОСТОЯНИЕ " + e.getMessage());
        } catch (Exception e) {
            System.err.println("\nНЕИЗВЕСТНАЯ ОШИБКА " + e);
        } finally {
            System.out.println("\nПрограмма завершена.");
        }
    }
}