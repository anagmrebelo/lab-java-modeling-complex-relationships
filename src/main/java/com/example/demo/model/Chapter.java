package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Data
@Entity
@Table(name = "chapters")
public class Chapter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String district;
    @OneToOne
    @JoinColumn(name = "member_id")
    private Member president;
    @ManyToMany
    @JoinTable(
            name="chapter_nurses",
            joinColumns = @JoinColumn(name = "chapter_id"),
            inverseJoinColumns = @JoinColumn(name = "nurse_id")
    )
    private List<Member> list;
}
