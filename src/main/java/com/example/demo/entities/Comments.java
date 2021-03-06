package com.example.demo.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "comments")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Comments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id")
    private Long id;

    @Column(name = "comment" ,columnDefinition = "TEXT")
    private String comment;

    @Column(name = "addedDate")
    private Date addedDate;

    @ManyToOne(fetch = FetchType.EAGER)
    private Items items;

    @ManyToOne(fetch = FetchType.LAZY)
    private Users authors;
}
