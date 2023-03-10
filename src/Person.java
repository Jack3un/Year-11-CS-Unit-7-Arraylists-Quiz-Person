public class Person
{
    private String firstName;
    private String surname;
    private int age;
}

public Person(String a, String b, int c)
{
    firstName = a;
    surname = b;
    age = c;
}

public String getFirstName()
{
    return firstName;
}

public void setFirstName(String firstName)
{
    this.firstName = firstName;
}

public String getSurname()
{
    return surname;
}

public void setSurname(String lastName)
{
    this.surname= lastName;
}

public int getAge()
{
    return age;
}

public void setAge(int age)
{
    this.age = age;
}

public String toString()
{
    return firstName + surname + age;
}

