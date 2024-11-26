import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;


public class Main {

    public static void main(String[] args) {
        TreeSet<Person> candidates = new TreeSet<>(new SpacePersonComparator());
        candidates.add(new Person("Sonya Popova", 35, 15));
        candidates.add(new Person("Dazdraperma Sponzhova", 33, 15));
        candidates.add(new Person("Salavat Netologshvili", 23, 13));
        candidates.add(new Person("Sasha Sun", 31, 15));
        candidates.add(new Person("Svetlana Morkov", 38, 15));
        candidates.add(new Person("Sasha Sosnova", 38, 11));

        Iterator<Person> it = candidates.iterator();
        System.out.println(it.next());
        System.out.println(it.next());
    }
}


class Person {
    private String name;
    private int age;
    private int experience;

    public Person(String name, int age, int experience) {
        this.name = name;
        this.age = age;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getExperience() {
        return experience;
    }

    @Override
    public String toString() {
        return name;
    }
}


//Критерии отбора таковы. При сравнении двух кандидатов лучший выбирается по принципу:
//
//тот у кого больше опыта; если опыт одинаковый то
//тот, у кого в имени с фамилией (т.е. name) больше букв s или S (от слова space - космос; было решено, что медийность - важная часть космонавтики); если по этому критерию оказываются равны, то
//тот, у кого имя с фамилией (т.е. name) короче (так легче будет запоминать имена астронавтов по всему миру)

class SpacePersonComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        if (o1.getExperience() != o2.getExperience()) {
            return Integer.compare(o2.getExperience(), o1.getExperience());
        }
        int sCount = Integer.compare(countS(o2.getName()), countS(o1.getName()));
        if (sCount != 0) {
            return sCount;
        } else {
            return Integer.compare(o1.getName().length(), o2.getName().length());
        }
    }

    private int countS(String name) {
        int count = 0;
        for (Character c: name.toLowerCase().toCharArray()) {
            if ('c' == c) {
                count++;
            }
        }
        return count;
    }
}