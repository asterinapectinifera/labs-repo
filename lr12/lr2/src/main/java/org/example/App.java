package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class App {

    // печать фильмов с заданным рейтингом
    public static void printFilms(List<Film> films, int rating) {
        System.out.println("Фильмы с рейтингом " + rating);
        Iterator<Film> iterator = films.iterator();
        while (iterator.hasNext()) {
            Film f = iterator.next();
            if (f.getRating() == rating) {
                System.out.println(f);
            }
        }
    }

    public static void main(String[] args) {
        List<Film> films = new ArrayList<>();
        films.add(new Film(1, "Начало", "Фантастика", 5, Arrays.asList(5, 4, 5, 4)));
        films.add(new Film(2, "Титаник", "Драма", 4, Arrays.asList(4, 3, 4, 5)));
        films.add(new Film(3, "Аватар", "Фэнтези", 3, Arrays.asList(2, 3, 2, 3)));
        films.add(new Film(4, "Джокер", "Триллер", 5, Arrays.asList(5, 5, 4, 5)));
        films.add(new Film(5, "Кошки", "Мюзикл", 1, Arrays.asList(1, 2, 1, 1)));
        films.add(new Film(6, "Интерстеллар", "Фантастика", 4, Arrays.asList(4, 5, 4, 4)));

        // удалить фильмы со средним рейтингом < 3
        Iterator<Film> iterator = films.iterator();
        while (iterator.hasNext()) {
            Film f = iterator.next();
            if (f.getAverageScore() < 3) {
                iterator.remove();
            }
        }

        System.out.println("После удаления фильмов со средним рейтингом < 3:");
        films.forEach(System.out::println);
        // повысить рейтинг фильмов со средним рейтингом >= 4
        for (int i = 0; i < films.size(); i++) {
            Film f = films.get(i);
            if (f.getAverageScore() >= 4 && f.getRating() < 5) {
                f.setRating(f.getRating() + 1);
            }
        }

        System.out.println("\nПосле повышения рейтинга (avg >= 4):");
        Iterator<Film> iterator2 = films.iterator(); 
        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }

        System.out.println();
        printFilms(films, 5);

        // сортировка по убыванию среднего рейтинга при совпадении — по названию в алфавитном порядке
        Comparator<Film> comparator = new Comparator<Film>() {
            @Override
            public int compare(Film a, Film b) {
                if (a.getAverageScore() > b.getAverageScore()) {
                    return -1;
                } else if (a.getAverageScore() < b.getAverageScore()) {
                    return 1;
                } else {
                    return a.getTitle().compareTo(b.getTitle());
                }
            }
        };

        Collections.sort(films, comparator);

        System.out.println("\nОтсортированный список (ID, название, средний рейтинг)");
        Iterator<Film> iterator3 = films.iterator();
        while (iterator3.hasNext()) {
            Film f = iterator3.next();
            System.out.printf("ID: %d | Название: %s | Средний рейтинг: %.2f%n",
                    f.getId(), f.getTitle(), f.getAverageScore());
        }

    }
}