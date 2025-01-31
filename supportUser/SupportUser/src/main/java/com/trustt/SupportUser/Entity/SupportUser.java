package com.trustt.SupportUser.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.Date;

@Entity
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "supportuser")
public class SupportUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "code", unique=true, nullable = false )
    private String code;

    @Column(name = "name" , nullable = false)
    private String name;

    @Email
    @Column(name = "email", unique = true, nullable = false)
    private String email;

    @Column(name="phone", unique = true, nullable = false)
    private String phone;

    @Column(name = "dob", nullable = false)
    private Date dob;

    @Column(name = "doj", nullable = false)
    private Date doj;

    @Column(nullable = false, columnDefinition = "VARCHAR(20) DEFAULT 'NOT SPECIFIED'")
    private String gender = "NOT SPECIFIED";
}
