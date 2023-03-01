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
        Comparator<Person> comparator= (p1, p2) ->{
            Set<String> p1_set=new HashSet<>(List.of(p1.getSurname().split("\\P{IsAlphabetic}+")));
            Set<String> p2_set=new HashSet<>(List.of(p2.getSurname().split("\\P{IsAlphabetic}+")));
            if (p1_set.size()<p2_set.size()) return -1;
            else if ((p1_set.size()==p2_set.size())) return Integer.compare(p1.getAge(), p2.getAge());
            return 1;
        };
        Collections.sort(pl, comparator);
        for (Person p: pl){
            System.out.println(p.toString());
        }
    }
}