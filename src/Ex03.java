import java.util.ArrayList;
import java.util.Collections;

public class Ex03
{
    private ArrayList<Person> persons;

    public Ex03()
    {
        this.persons = new ArrayList<>();
        populateList();
    }

    private void populateList()
    {
        persons.add(new Person("Ben",48,175));
        persons.add(new Person("John",45,170));
        persons.add(new Person("Trump",70,180));
        persons.add(new Person("Duck",3,45));
        persons.add(new Person("Pug",3,35));
        persons.add(new Person("Rowan",24,170));
        persons.add(new Person("Anna",24,160));
        persons.add(new Person("Christie",28,185));
        persons.add(new Person("Tom",28,170));
        persons.add(new Person("Rune",35,170));
        sortList();
    }

    private void sortList()
    {
        Collections.sort(persons);
        for(Person person : persons)
            System.out.println(person);
    }
}
