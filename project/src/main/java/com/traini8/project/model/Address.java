package com.traini8.project.model;

import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Embeddable class representing the address of a Training Center.
 */


@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Address {

    @NotBlank(message = "Detailed address is required")
    private String detailedAddress;            // Complete address (street, etc.)

    @NotBlank(message = "City is required")
    private String city;                        // Name of the city

    @NotBlank(message = "State is required")
    private String state;                    // Name of the state

    @Pattern(regexp = "\\d{6}", message = "Pincode should be exactly 6 digits")
    private String pincode;                // Postal code (Pincode) for the address


}
