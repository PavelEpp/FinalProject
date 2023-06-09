import java.util.*;

/*Подумать над структурой класса Ноутбук для магазина техники — выделить поля и методы. Реализовать в Java.
        Создать множество ноутбуков.
        Написать метод, который будет запрашивать у пользователя критерий (или критерии)
        фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
        “Введите цифру, соответствующую необходимому критерию:
        1 - ОЗУ
        2 - Объём ЖД
        3 - Операционная система
        4 - Цвет …
        Далее нужно запросить минимальные значения для указанных критериев — сохранить параметры
        фильтрации можно также в Map.
        Отфильтровать ноутбуки из первоначального множества и вывести проходящие по условиям.
*/
public class Project1 {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("Samsung", 16, 512, "Windows", "cherry");
        Laptop laptop2 = new Laptop("Lenovo", 8, 256, "Windows", "black");
        Laptop laptop3 = new Laptop("Macbook", 32, 512, "MacOS", "silver");

        Set<Laptop> laptops = new HashSet<>();
        laptops.add(laptop1);
        laptops.add(laptop2);
        laptops.add(laptop3);

        System.out.println(laptops);
//        System.out.println(laptop2);
//        System.out.println(laptop3);

        Map<Integer, String> filter = new HashMap<>();
//        filter.put(1, "ОЗУ");
//        filter.put(2, "Объем жесткого диска");
//        filter.put(3, "Операционная система");
//        filter.put(4, "Цвет");

        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("Задайте критерии фильтрации: \n" +
                    "1 - ОЗУ\n" +
                    "2 - Объём ЖД\n" +
                    "3 - Операционная система\n" +
                    "4 - Цвет\n" +
                    "5 - Запустить поиск");
            int input = scanner.nextInt();
            switch (input) {
                case 1:
                    System.out.println("Введите минимальный объем памяти: ");
                    filter.put(1, scanner.next());
                    break;
                case 2:
                    System.out.println("Введите минимальный объем жесткого диска:");
                    filter.put(2, scanner.next());
                    break;
                case 3:
                    System.out.println("Введите операционную систему: ");
                    filter.put(3, scanner.next());
                    break;
                case 4:
                    System.out.println("Введите цвет ноутбука:");
                    filter.put(4, scanner.next());
                    break;
                case 5:
                    flag = false;
                    break;
            }
        }

        System.out.println(filter);

    }
}