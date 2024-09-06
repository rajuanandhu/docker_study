package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonTypeId;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class docker {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String column1;
    private String column2;
}
