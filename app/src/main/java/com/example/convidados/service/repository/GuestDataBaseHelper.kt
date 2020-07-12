package com.example.convidados.service.repository

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import com.example.convidados.service.constants.DataBaseConstants

class GuestDataBaseHelper(context: Context) : SQLiteOpenHelper(context,  DATABASE_NAME, null, DATABASE_VERSION){
    override fun onCreate(db: SQLiteDatabase) {
        db.execSQL(CREATE_TABLE_GUEST)
    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {

    }

    companion object {
        private const val DATABASE_VERSION = 1
        private const val DATABASE_NAME = "Convidados.db"

        private const val CREATE_TABLE_GUEST = ("create_table " + DataBaseConstants.GUEST.TABLE_NAME + "("
                + DataBaseConstants.GUEST.COLUMNS.ID + "integer primary key autoincrement, "
                + DataBaseConstants.GUEST.COLUMNS.NAME + "text, "
                + DataBaseConstants.GUEST.COLUMNS.PRESENCE + "integer);")
    }

}