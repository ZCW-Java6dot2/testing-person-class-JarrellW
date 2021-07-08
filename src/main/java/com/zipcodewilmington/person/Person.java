package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;
    private String hairColor;
    private String eyeColor;
    private int height;
    private int weight;
    private String skinColor;



    public Person() {
      this.name = "";
      this.age = Integer.MAX_VALUE;
      this.hairColor = "";
      this.eyeColor = "";
      this.height = Integer.MAX_VALUE;
      this.weight =  Integer.MAX_VALUE;
      this.skinColor = "";


    }

    public Person(int age) {
        this.age = age;

    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;

    }
    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;

    }
    public void setHeight(int height) {
        this.height = height;

    }
    public void setWeight(int weight) {
        this.weight = weight;

    }
    public void setSkinColor(String skinColor) {
        this.skinColor = skinColor;

    }


    public String getHairColor() {
        return this.hairColor;
    }

    public String getSkinColor() {
        return this.skinColor;
    }

    public Integer getWeight() {
        return this.weight;
    }

    public Integer getHeight() {
        return this.height;
    }

    public String getEyeColor() {
        return this.eyeColor;
    }

    public String getName() {
        return this.name;
    }

    public Integer getAge() {
        return this.age;
    }
}
