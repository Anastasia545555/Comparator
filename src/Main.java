import java.util.*;
import java.util.function.Predicate;

public class Main{
    public static void main(String[] args) {
        List <Person> pl=new ArrayList<>();
        //добавить людей
        pl.add(new Person("Алексей", "Мартынов Щедрин", 24));
        pl.add(new Person("Александр", "Мартынов", 40));
        pl.add(new Person("Иван", "Иванов Петров Андреев", 17));
        pl.add(new Person("Богдан", "Воронов Грачев Соколов Соловьёв", 24));
        pl.add(new Person("Ольга", "Белова Краснова", 22));
        pl.add(new Person("Олег", "Львов", 12));
        System.out.println("Список до сортировки: ");
        printList(pl);
        System.out.println("Список после сортировки по возрастанию знатности: ");
        Collections.sort(pl, new PersonComparator());
        printList(pl);
        System.out.println("Список после судаления людей, не достигших 18-летия: ");
        Predicate<Person> t = person -> person.getAge()<18;
        pl.removeIf(t);
        printList(pl);
    }

    public static void printList(List<Person> pl) {
        for (Person p: pl){
            System.out.println(p.toString());
        }
    }
}