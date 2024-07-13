package com.example.Grades.repository

import com.example.Grades.model.Grade
import org.springframework.data.jpa.repository.JpaRepository

interface GradeRepository : JpaRepository<Grade, Long?> {
    fun findById (id:Long?):Grade?
}