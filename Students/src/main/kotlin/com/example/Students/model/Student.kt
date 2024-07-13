package com.example.Students.model

import jakarta.persistence.*


@Entity
@Table(name = "students")
class Student
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
     var id: Long? = null

    @Column(name = "full_name", nullable = false)
     var fullName: String? = null

    @Column(name = "email", nullable = false)
     var email: String? = null

}

