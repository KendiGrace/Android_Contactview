package com.example.contactrecyclerview.DI

import android.content.Context
import com.example.contactrecyclerview.DataBase.ContactDao
import com.example.contactrecyclerview.DataBase.ContactDataBase
import com.example.contactrecyclerview.DataBase.ContactsApp
import com.example.contactrecyclerview.Repository.ContactsRepository
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Singleton
    @Provides
    fun provideDatabase(@ApplicationContext appContext: Context):
            ContactDataBase {
        return ContactDataBase.getDatabase(appContext)
    }

    @Singleton
    @Provides
    fun provideContactsDao(database: ContactDataBase): ContactDao {
        return database.contactDao()
    }

@Singleton
@Provides
fun provideContactRepository(contactDao: ContactDao):ContactsRepository{
    return ContactsRepository(contactDao)
}


}
