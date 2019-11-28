package com.company;

import java.util.ArrayList;
import java.util.List;

public class CriteriaMale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> person) {
        List<Person> malePerson = new ArrayList<Person>();

        for(Person personSearch : person){
            if(personSearch.getGender().equalsIgnoreCase("Male"))
                malePerson.add(personSearch);
        }
        return malePerson;
    }
}
