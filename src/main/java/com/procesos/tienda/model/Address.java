package com.procesos.tienda.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NonNull;
import org.aspectj.bridge.IMessage;

@Entity
@Data
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "street address is required")
    @Size(min = 8, max = 255, message = "street address max 255 characters")
    private String streetAddress;

    @NotNull(message = "city address is required")
    @Size(min = 8, max = 255, message = "city max 255 characters")
    private String city;

    @NotNull(message = "state address is required")
    @Size(min = 8, max = 100, message = "state max 100 characters")
    private String state;

    @NotNull(message = "postal code address is required")
    @Size(min = 8, max = 10, message = "postal code max 10 characters")
    private String postalCode;

    private Boolean status = Boolean.TRUE;
    @ManyToOne()
    @JoinColumn(name = "id_user", referencedColumnName = "id")
    private User user;
}

