package com.example.Grades.model

import jakarta.persistence.*

@Entity
@Table(name = "grades")
class Grade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    var id: Long? = null

    @Column(name = "grade", nullable = false)
    var grade: String? = null

    @Column(name = "students_id")
    var studenstId: Int? = null

}
