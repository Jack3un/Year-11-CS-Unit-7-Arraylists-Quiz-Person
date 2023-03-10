import java.util.ArrayList;
import java.util.Collections;

public class PersonFactory
{
    private ArrayList<Person> allPersons;

    public PersonFactory()
    {
        allPersons = new ArrayList<>();
    }
    public void addPerson(Person person)
    {
        int original_size = allPersons.size();
        for(int i = 0; i < allPersons.size(); i++)
        {
            String string1 = person.getSurname();
            String string2 = allPersons.get(i).getSurname();
            if(string2.compareTo(string1 >= 0))
                allPersons.add(i,person);
        }
        if(original_size == allPersons.size())
            allPersons.add(person);
    }
    public ArrayList<Person> under18()
        ArrayList<Person> u18List = new ArrayList<>();
    for(Person person: allPersons)
    {
        if(person.getAge() < 18)
            u18List.add(person);
    }
    return u18List;

    public boolean checkSurname(String Surname)
    {
        for (Person person : allPersons)
        {
            if (person.getSurname().equals(Surname))
                return true;
        }
        return false;
    }
}


