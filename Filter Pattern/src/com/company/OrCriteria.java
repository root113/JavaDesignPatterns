package com.company;

import java.util.List;

public class OrCriteria implements Criteria {
    private Criteria criteria;
    private Criteria otherCriteria;

    public OrCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> person) {
        List<Person> firstCriteriaItems = criteria.meetCriteria(person);
        List<Person> otherCriteriaItems = otherCriteria.meetCriteria(person);

        for(Person personSearch : otherCriteriaItems){
            if(!firstCriteriaItems.contains(personSearch))
                firstCriteriaItems.add(personSearch);
        }
        return firstCriteriaItems;
    }
}
