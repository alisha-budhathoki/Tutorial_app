//package com.example.smartgk.Database;
//
//import androidx.lifecycle.LiveData;
//import androidx.room.Dao;
//import androidx.room.Insert;
//import androidx.room.OnConflictStrategy;
//import androidx.room.Query;
//
//import java.util.List;
//
//@Dao
//public interface BooksDao {
//    @Query("SELECT * FROM BookData")
//    LiveData<List<BookData>> getAllBooks();
//
//    @Query("DELETE FROM BookData")
//    public void nukeTable();
//
//    @Insert(onConflict = OnConflictStrategy.REPLACE)
//    void insertAll(BookData... bookData);
//}
