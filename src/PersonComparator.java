import java.util.*;
public class PersonComparator implements Comparator<Person>{
    @Override
    public int compare(Person p1, Person p2){
        Set<String> p1_set=new HashSet<>(List.of(p1.getSurname().split("\\P{IsAlphabetic}+")));
        Set<String> p2_set=new HashSet<>(List.of(p2.getSurname().split("\\P{IsAlphabetic}+")));
        if (p1_set.size()<p2_set.size()) return -1;
        else if ((p1_set.size()==p2_set.size())&&(p1.getAge()<p2.getAge())) return -1;
        return 1;
    }
}
