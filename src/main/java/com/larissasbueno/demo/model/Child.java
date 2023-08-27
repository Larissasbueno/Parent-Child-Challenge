package com.larissasbueno.demo.model;


import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "CHILD")
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Child {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME")
    private String name;

    @ManyToOne
    @JoinColumn(name = "FATHER_ID")
    private Parent father;

    @ManyToOne
    @JoinColumn(name = "MOTHER_ID")
    private Parent mother;


    public Child() {
    }
}
