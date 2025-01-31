package com.trustt.SupportUser.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class SupportUserRequestDTO {
    private String name;
    private  String email;
    private String phone;
    private Date dob;
    private Date doj;
}
