public class Person implements Comparable<Person>
{
    private String name;
    private int height;
    private int age;

    public Person(String name, int age, int height)
    {
        this.name = name;
        this.height = height;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Person o)
    {
        if(this.getAge() > o.getAge())
            return -1;
        else if(this.getAge() < o.getAge())
            return 1;
        else
        {
            if(this.getHeight() > o.getHeight())
            {
                return -1;
            }
            if(this.getHeight() < o.getHeight())
            {
                return 1;
            }
            return 0;
        }
    }

    public String toString()
    {
        return name + " - " + " Age: " + age + " Height: " + height;
    }
}

