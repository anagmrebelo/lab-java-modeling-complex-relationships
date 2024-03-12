package com.example.demo.model;

import com.example.demo.model.utils.GuestStatus;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "guests")
public class Guest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Enumerated(EnumType.STRING)
    private GuestStatus guestStatus;
}
