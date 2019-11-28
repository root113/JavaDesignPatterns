package com.company;

import java.util.ArrayList;
import java.util.List;

public class CriteriaPatternDemo {

    public static void main(String[] args) {
        List<Person> person = new ArrayList<Person>();

        person.add(new Person("Robert","Male","Single"));
        person.add(new Person("John", "Male", "Married"));
        person.add(new Person("Laura", "Female", "Married"));
        person.add(new Person("Diana", "Female", "Single"));
        person.add(new Person("Mike", "Male", "Single"));
        person.add(new Person("Bobby", "Male", "Single"));

        Criteria male = new CriteriaMale();
        Criteria female = new CriteriaFemale();
        Criteria single = new CriteriaSingle();
        Criteria singleMale = new AndCriteria(single, male);
        Criteria singleOrFemale = new OrCriteria(single, female);

        System.out.println("Males: ");
        printPerson(male.meetCriteria(person));

        System.out.println("\nFemales: ");
        printPerson(female.meetCriteria(person));

        System.out.println("\nSingle Males: ");
        printPerson(singleMale.meetCriteria(person));

        System.out.println("\nSingle Or Females: ");
        printPerson(singleOrFemale.meetCriteria(person));
    }

    public static void printPerson(List<Person> person){
        for (Person personSearch : person) {
            System.out.println("Person : [ Name : " + personSearch.getName() + ", Gender : " + personSearch.getGender() + ", Marital Status : " + personSearch.getMaritalStatus() + " ]");
        }
    }
}
