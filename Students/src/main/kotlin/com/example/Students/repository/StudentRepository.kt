package com.example.Students.repository

import com.example.Students.model.Student
import org.springframework.data.jpa.repository.JpaRepository

interface StudentRepository: JpaRepository<Student, Long> {
    fun findById (id: Long?): Student?
}