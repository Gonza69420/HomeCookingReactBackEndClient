package com.homecooking.demo.data.entity;


import javax.persistence.*;
import java.sql.Date;
import java.util.Set;
import java.util.UUID;



@Entity
@Table(name = "chef")
public class Chef extends AbstractEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;
    private String firstName;
    private String lastName;
    private String mail;
    private String password;
    private String phoneNumber;
    private Boolean isActive;
    private String DNI;
    private Boolean isVerified;
    private Date VerificationDate;
    private String City;
    @OneToOne
    private Profile profile;
    @Enumerated(EnumType.STRING)
    @ElementCollection(fetch = FetchType.EAGER)
    private Set<Role> roles;



    public Chef(String fistName, String lastName, String mail, String password, String phoneNumber, Boolean isActive, String DNI, Boolean isVerified, Date VerificationDate, String City) {
        this.firstName = fistName;
        this.lastName = lastName;
        this.mail = mail;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.isActive = isActive;
        this.DNI = DNI;
        this.isVerified = isVerified;
        this.VerificationDate = VerificationDate;

    }

    public Chef() {

    }

    public UUID getId() {
        return id;
    }

    @Override
    public String toString() {
        return String.format(
                "Customer[firstName='%s', lastName='%s' , mail='%s', phoneNumber='%s', DNI='%s', isActive='%s', password='%s', isVerified='%s', VerificationDate='%s']",
                firstName, lastName, mail, phoneNumber, DNI, isActive, password, isVerified, VerificationDate);
    }

    public String getFirstName() {return firstName;}

    public String getLastName() {return lastName;}

    public String getMail() {return mail;}

    public String getPassword() {return password;}

    public String getPhoneNumber() {return phoneNumber;}

    public Boolean getActive() {return isActive;}

    public String getDNI() {return DNI;}

    public Role getRole() {return Role.ROLE_CHEF;}

    public String getCity() {return City;}

    public void setPassword(String password) {this.password = password;} //To be used only by the system when the user forgets the password

    public void setId(UUID idchef) {
        this.id =  idchef;
    }

    public Date getVerificationDate() {
        return VerificationDate;
    }

    public String setJob(String job) { return job;}

    public Boolean getVerified() {return isVerified;}

    public boolean isActive() {return isActive;}

    public void setActive(boolean b) {
        isActive = b;
    }

    public boolean checkPassword(String password) {
        return this.password.equals(password);
    }
}
