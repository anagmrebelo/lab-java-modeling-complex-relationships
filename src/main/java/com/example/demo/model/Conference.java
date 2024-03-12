package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Conference extends Event{
    @OneToMany
    @JoinColumn(name = "event_id")
    private List<Guest> speakers;
}
