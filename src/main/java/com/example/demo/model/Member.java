package com.example.demo.model;

import com.example.demo.model.utils.Status;
import jakarta.persistence.*;
import lombok.Data;
import org.springframework.stereotype.Repository;

import java.sql.Date;

@Data
@Entity
@Table(name = "nurses")
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @Enumerated(EnumType.STRING)
    private Status status;
    private Date renewal_date;
}
