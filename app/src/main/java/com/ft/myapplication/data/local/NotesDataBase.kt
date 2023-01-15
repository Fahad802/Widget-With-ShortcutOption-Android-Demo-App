package com.ft.myapplication.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.ft.myapplication.data.local.dao.NoteDao
import com.ft.myapplication.data.local.entities.NoteEntity

@Database(entities = [NoteEntity::class], version = 1, exportSchema = false)
abstract class NotesDataBase : RoomDatabase() {

    abstract fun noteDao(): NoteDao
}
