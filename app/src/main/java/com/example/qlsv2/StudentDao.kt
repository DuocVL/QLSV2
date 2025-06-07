package com.example.qlsv2

import androidx.room.*

@Dao
interface StudentDao {
    @Insert
    suspend fun insert(student: Student)

    @Query("SELECT * FROM students")
    suspend fun getAll(): List<Student>

    @Delete
    suspend fun delete(student: Student)
}
