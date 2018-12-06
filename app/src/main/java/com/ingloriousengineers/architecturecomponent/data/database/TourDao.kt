package com.ingloriousengineers.architecturecomponent.data.database

import androidx.room.*


@Dao
interface TourDao {

    // get all tours
    @Query("SELECT * FROM tour")
    fun getTours(): List<Tour>

    // Inserts multiple tours
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertTours(tours: Tour)

    // Deletes a single user
    @Delete
    fun delete(tour: Tour)
}