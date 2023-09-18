package com.plcoding.graphqlcountriesapp.domain

//To interact with API
interface CountryClient {

    suspend fun getCountries(): List<SimpleCountry>
    suspend fun getCountry(code: String): DetailedCountry?
}