package com.trustt.SupportUser.Util;

import com.trustt.SupportUser.DTO.SupportUserRequestDTO;
import jakarta.validation.ValidationException;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

@Component
public class SupportUserValidator {

    public void supportUserValidator(SupportUserRequestDTO requestDTO) {
        // Validate Name
        if (requestDTO.getName().length() < 3) {
            throw new ValidationException("User name should consist of a minimum of 3 characters.");
        }
        if (requestDTO.getName().length() > 50) {
            throw new ValidationException("User name should not exceed the limit of 50 characters.");
        }
        if (!requestDTO.getName().matches("[a-zA-Z ]+")) {
            throw new ValidationException("User name should not contain special characters.");
        }

        // Validate Phone Number
        if (requestDTO.getPhone().length() != 10) {
            throw new ValidationException("Phone number should consist of exactly 10 digits.");
        }

        try {
            // If the field is of type Date, convert it to LocalDate
            LocalDate dojDate = convertToLocalDate(requestDTO.getDoj());
            if (dojDate.isAfter(LocalDate.now())) {
                throw new ValidationException("Date of Joining (DOJ) should not be a future date.");
            }

            // Parse the Date of Birth (DOB)
            LocalDate dobDate = convertToLocalDate(requestDTO.getDob());

            // Validate that the DOB is on or before 2004-12-31
            if (dobDate.isAfter(LocalDate.of(2004, 12, 31))) {
                throw new ValidationException("Date of Birth (DOB) should be on or before 2004.");
            }
        } catch (Exception e) {
            throw new ValidationException("Invalid date format.");
        }
    }

    // Method to convert Date to LocalDate
    private LocalDate convertToLocalDate(Date date) {
        if (date != null) {
            return date.toInstant()
                    .atZone(ZoneId.systemDefault())
                    .toLocalDate();
        } else {
            throw new ValidationException("Date cannot be null.");
        }
    }
}
