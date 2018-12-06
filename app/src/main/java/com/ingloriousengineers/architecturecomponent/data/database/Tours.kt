package com.ingloriousengineers.architecturecomponent.data.database

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverters

data class Tours(
    val tours: List<Tour>
)

@Entity(tableName = "tour")
data class Tour(
    val description: String,
    val isVisible: Boolean,
    val rating: Double,
    @TypeConverters(Schedule::class)
    val schedule: List<Schedule>,
    @TypeConverters(TourCity::class)
    val tour_cities: List<TourCity>,
    val tour_days: Int,
    @PrimaryKey
    val tour_id: Int,
    val tour_name: String,
    val tour_price: Int,
    val tour_thumbnail: String,
    val tour_type: String
)

@Entity
data class Schedule(
    @PrimaryKey (autoGenerate = true)
    val scheduleId: Int,
    val description: String,
    val title: String
)

@Entity
data class TourCity(
    @PrimaryKey(autoGenerate = true)
    val cityId: Int,
    val city: String
)