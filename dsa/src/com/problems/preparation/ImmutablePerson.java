package com.problems.preparation;

import java.util.Objects;

public final class ImmutablePerson {
    private final String name;
    private final int age;

    public ImmutablePerson(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public static ImmutablePerson of(int age, String name){
        return new ImmutablePerson(age, name);
    }

    public int getAge(){
        return this.age;
    }

    public String getName(){
        return this.name;
    }

    @Override
    public boolean equals(Object object){
        if(this == object){
            return true;
        }else if(object == null || getClass() != object){
            return false;
        }
        ImmutablePerson person = (ImmutablePerson) object;
        return age == person.getAge() && name.equals(person.getName());
    }

    @Override
    public int hashCode(){
        return Objects.hash(age, name);
    }
}
