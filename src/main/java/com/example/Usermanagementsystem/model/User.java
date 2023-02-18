package com.example.Usermanagementsystem.model;


import jakarta.persistence.*;

import javax.validation.constraints.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long userId;

    @NotNull(message = "Username cannot be null")
    @Size(min = 4, max = 30, message = "Username must be between 4 and 30 characters")
    @Column(name = "username", nullable = false, length = 30)
    private String username;

    @NotNull(message = "Date of birth cannot be null")
    @Pattern(regexp = "\\d{4}-\\d{2}-\\d{2}", message = "Date of birth should be in the format YYYY-MM-DD")
    @Column(name = "date_of_birth", nullable = false)
    private String dateOfBirth;

    @NotNull(message = "Email cannot be null")
    @Email(message = "Invalid email format")
    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @NotNull(message = "Phone number cannot be null")
    @Pattern(regexp = "\\d{2}-\\d{8,10}", message = "Phone number should be in format xx-xxxxxxxxxx with first two digits as country code")
    @Column(name = "phone_number", nullable = false, length = 12)
    private String phoneNumber;

    @Column(name = "date", nullable = false)
    private LocalDate date;

    @Column(name = "time")
    private String time;

    public User() {}

    public User(String username, String dateOfBirth, String email, String phoneNumber, LocalDate date, LocalTime time) {
        this.username = username;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.date = date;
        this.time = time.format(DateTimeFormatter.ISO_LOCAL_TIME);
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }


    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", date=" + date +
                ", time=" + time +
                '}';
    }
}
