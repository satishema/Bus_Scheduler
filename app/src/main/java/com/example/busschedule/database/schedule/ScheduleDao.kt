package com.example.busschedule.database.schedule

import androidx.room.Dao
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

/**
 * Created by Satish V on 15-July-2022.
 * Company : HighOnSwift Pvt ltd
 * Email   : iamsatishema@gmail.com
 */
@Dao
interface ScheduleDao {

    @Query("SELECT * FROM schedule ORDER BY arrival_time ASC")
    fun getAll(): Flow<List<Schedule>>

    @Query("SELECT * FROM schedule WHERE stop_name = :stopName ORDER BY arrival_time ASC")
    fun getByStopName(stopName: String): Flow<List<Schedule>>

}