package com.example.supporthub1.model;

import javax.persistence.*;

@Entity
@Table(name="Employee")
public class User {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private  String lastName;

    @Column(name="password")
    private String  password;

    @Column(name="email_id")
    private String emailId;

    @Column(name="phone_no")
    private long  phoneNo;


    public User(){

    }


    public User(int id,String firstname,String lastname,String emailId,String  password,int phoneNo){
        this.firstName=firstname;
        this.lastName=lastname;
        this.password=password;
        this.emailId=emailId;
        this.id=id;
        this.phoneNo=phoneNo;

    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }




    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }




    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }




    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }




    public long getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(long phoneNo) {
        this.phoneNo = phoneNo;
    }



    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
}
