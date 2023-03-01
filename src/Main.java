import java.util.*;

public class Main{
    public static void main(String[] args) {
        List <Person> pl=new ArrayList<>();
        //добавить людей
        pl.add(new Person("Алексей", "Мартынов Щедрин", 24));
        pl.add(new Person("Александр", "Мартынов", 40));
        pl.add(new Person("Иван", "Иванов Петров Андреев", 17));
        pl.add(new Person("Богдан", "Воронов Грачев Соколов Соловьёв", 24));
        pl.add(new Person("Ольга", "Белова Краснова", 22));
        System.out.println("Список до сортировки: ");
        for (Person p: pl){
            System.out.println(p.toString());
        }
        System.out.println("Список после сортировки по возрастанию знатности: ");
        Collections.sort(pl, new PersonComparator());
        for (Person p: pl){
            System.out.println(p.toString());
        }
    }
}