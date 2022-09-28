package com.example.addressbookapplication.Dto;


import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Data
public class AddressBookDTO {

    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message = "First name is Invalid")
    public String firstName;

    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message = "Last name is Invalid")
    public String lastName;
    @Pattern(regexp ="^[0-9]{10}$",message="Phone number is not valid")
    public String phoneNumber;
    @NotNull(message = "Email Cannot Be Empty")
    @Pattern(regexp = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$",message = "Email Is Invalid")
    private String email;
    @NotEmpty(message="address cannot be empty")
    public String address;
    @NotEmpty(message="address cannot be empty")
    public String city;
    @NotEmpty(message="address cannot be empty")
    public String state;
    @NotNull(message="address cannot be empty")
    public int zip;

    public AddressBookDTO(String firstName, String lastName, String phoneNumber, String email,
                          String address, String city, String state, int zip) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

}
