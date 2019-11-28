package com.company;

import java.util.ArrayList;
import java.util.List;

public class CriteriaSingle implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> person) {
        List<Person> singlePersons = new ArrayList<Person>();

        for (Person personSearch : person) {
            if(personSearch.getMaritalStatus().equalsIgnoreCase("SINGLE")){
                singlePersons.add(personSearch);
            }
        }
        return singlePersons;
    }
}
