package com.example.busschedule.database.schedule

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Created by Satish V on 15-July-2022.
 * Company : HighOnSwift Pvt ltd
 * Email   : iamsatishema@gmail.com
 */
@Entity
data class Schedule(
    @PrimaryKey val id: Int,
    @NonNull @ColumnInfo(name = "stop_name") val stopName: String,
    @NonNull @ColumnInfo(name = "arrival_time") val arrivalTime: Int
)
