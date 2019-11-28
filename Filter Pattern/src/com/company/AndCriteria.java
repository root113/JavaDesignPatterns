package com.company;

import java.util.List;

public class AndCriteria implements Criteria {
    private Criteria criteria;
    private Criteria otherCriteria;

    public AndCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> person) {
        List<Person> firstCriteriaPerson = criteria.meetCriteria(person);
        return otherCriteria.meetCriteria(firstCriteriaPerson);
    }
}
