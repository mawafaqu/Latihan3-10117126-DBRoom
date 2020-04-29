package com.mawafaqu.roomdb;

import androidx.room.Database;
import androidx.room.RoomDatabase;
//Tanggal Pengerjaan : 28 April 2020
//Deskripsi : Mengerjakan Aktivis Dao, AktivisEntity, AppDatabase dan MainActivity
//10117126
// Mawa Faqu
// IF4

@Database(entities = {AktivisEntity.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {

    public abstract AktivisDao aktivisDao();
}
