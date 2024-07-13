package com.example.Students.Controller

import com.example.Students.model.Student
import com.example.Students.service.StudentService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/students")
class StudentController {
    @Autowired
    lateinit var studentService: StudentService

    @GetMapping
    fun list ():List <Student> {
        return studentService.list()
    }

    @PostMapping
    fun save(@RequestBody student: Student) : ResponseEntity<Student> {
        return ResponseEntity(studentService.save(student), HttpStatus.OK)
    }

    @PutMapping
    fun update(@RequestBody student: Student): ResponseEntity<Student> {
        return ResponseEntity(studentService.update(student), HttpStatus.OK)
    }

    @DeleteMapping("/{id}")
    fun delete(@PathVariable("id") id: Long): Boolean? {
        return studentService.delete(id)
    }
}