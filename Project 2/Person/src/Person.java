public class Person
{
    private int age;
    private String name;

    public Person()
    {}

    public Person (String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age)
    {
        this.age=age;
    }

    public void setName(String name)
    {
        this.name=name;
    }

    public boolean has_same_name(Person i)
    {
        String n= i.getName();
        boolean flag = false;
        if (name.equals(n))
            flag = true;
        return flag;
    }

    public boolean has_same_age(Person i)
    {
        int ageA = i.getAge();
        boolean flag = false;
        if (age == ageA)
            flag =true;
        return flag;
    }

    public boolean is_younger_than(Person i)
    {
        int a = i.getAge();
        boolean flag = false;
        if (age < a)
            flag =true;
        return flag;
    }

    public boolean is_older_than(Person i)
    {
        int a = i.getAge();
        boolean flag = false;
        if (age > a)
            flag = true;
        return flag;
    }

    public String toString() {
        return "N(" +this.getName()+"),A("+this.getAge()+")";
    }
}
