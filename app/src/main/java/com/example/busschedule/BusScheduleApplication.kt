package com.example.busschedule

import android.app.Application
import com.example.busschedule.database.schedule.AppDatabase

/**
 * Created by Satish V on 15-July-2022.
 * Company : HighOnSwift Pvt ltd
 * Email   : iamsatishema@gmail.com
 */
class BusScheduleApplication : Application() {
    val database: AppDatabase by lazy { AppDatabase.getDatabase(this) }
}