package ru.mazepa.FirsSecurity.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import org.hibernate.validator.constraints.br.CPF;

@Entity
@Table(name = "person")
public class Person {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    @NotEmpty(message = "Заполните данную область")
    @Size(min = 5, max = 12, message = "Имя должно быть от 5 до 12 символов длиной")
    @Column(name = "username")
    private String username;


    @Column(name = "year_of_birth")
    @Min(value = 1960 , message = "Год рождения должен быть больше чем, 1960")
    private int yearOfBirth;

    @Column(name = "password")
    private String password;



    @Column(name = "role")
    private String role;

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Person() {

    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", yearOfBith=" + yearOfBirth +
                ", password='" + password + '\'' +
                '}';
    }

    public Person( String username, int yearOfBirth) {

        this.username = username;
        this.yearOfBirth = yearOfBirth;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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
}
