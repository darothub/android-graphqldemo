package com.darot.graphqlsample

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.apollographql.apollo.ApolloCall
import com.apollographql.apollo.ApolloClient
import com.apollographql.apollo.api.Response
import com.apollographql.apollo.exception.ApolloException
import com.example.graphqlsample.GetCountryQuery
import com.orhanobut.logger.AndroidLogAdapter
import com.orhanobut.logger.Logger
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Logger.addLogAdapter(AndroidLogAdapter())
        val apolloClient = ApolloClient.builder().serverUrl("https://countries.trevorblades.com/").build()

//        submit.setOnClickListener {
//            var netCall = apolloClient.query(GetCountryQuery.builder().code(editText.text.toString()).build())
//            netCall.enqueue(object : ApolloCall.Callback<GetCountryQuery.Data>(){
//                override fun onFailure(e: ApolloException) {
//                    Logger.e(e.localizedMessage ?: "ERROR")
//                }
//
//                override fun onResponse(response: Response<GetCountryQuery.Data>) {
//                    Logger.d(response.data.toString())
//                    runOnUiThread {
//                        Toast.makeText(this@MainActivity, response.data.toString(), Toast.LENGTH_LONG).show()
//                    }
//                }
//
//            })
//        }

    }
}
