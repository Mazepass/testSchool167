package ru.mazepa.FirsSecurity.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;

@Entity
@Table(name = "person")
public class Person {


    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotEmpty
    @Column(name = "name")
    private String name;

    @Column(name = "username")
    @NotEmpty
    private String username;

    @NotEmpty
    @Column(name = "surname")
    private String surname;

    @Column(name = "year_of_birth")
    @Min(value = 1960 , message = "Год рождения должен быть больше чем, 1960")
    private int yearOfBirth;


    @NotEmpty
    @Column(name = "password")
    private String password;
    @Column(name = "role")
    private String role;




    @Column(name = "class")
    private int Classes;

    public Person() {

    }


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getClasses() {
        return Classes;
    }

    public void setClass(int aClass) {
        Classes = aClass;
    }
    public String getRole() {
        return role;
    }

    public void setClasses(int classes) {
        Classes = classes;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Person( String name, String username, String surname, int yearOfBirth, int classes) {
        this.name = name;
        this.username = username;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;
        Classes = classes;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", surname='" + surname + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                ", Classes=" + Classes +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

}