package pe.com.retrofind.models

import io.reactivex.Observable
import retrofit2.http.GET


interface SubjectInfertace {

    @GET("subjects")
    fun getAllSubjects(): Observable<List<Subject>>
}