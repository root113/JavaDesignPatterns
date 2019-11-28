package com.company;

import java.util.ArrayList;
import java.util.List;

public class CriteriaFemale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> person) {
        List<Person> femalePersons = new ArrayList<Person>();

        for (Person personSearch : person) {
            if(personSearch.getGender().equalsIgnoreCase("FEMALE")){
                femalePersons.add(personSearch);
            }
        }
        return femalePersons;
    }
}
