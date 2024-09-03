package com.example.oziggyrealestate.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table

public class UserAppRole {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String title;

    @CreationTimestamp
    @Temporal(TemporalType.TIME)
    @Column(name = "create_on",updatable = false,nullable = false)
    private Date createdOn;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updated_on",updatable = false,nullable = false)
    private Date updatedOn;




}

