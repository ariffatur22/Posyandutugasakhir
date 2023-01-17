package com.posyandu.chrisnaputra.posyandu.data_anak

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Toast
import com.posyandu.chrisnaputra.posyandu.R
import com.posyandu.chrisnaputra.posyandu.api.ApiHelper
import kotlinx.android.synthetic.main.kelola_anak.*
import kotlinx.android.synthetic.main.progressbar.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class KelolaAnakActivity : AppCompatActivity() {

    var listAnak: ArrayList<DataAnakMdl> = ArrayList()
    var adapter: KelolaAnakAdapter = KelolaAnakAdapter(listAnak, this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.kelola_anak)

//        recyclerview

        recyclerview.adapter = adapter
        getAnak()

    }

    private fun getAnak() {
        progressBar?.visibility = View.VISIBLE

        val apiService = ApiHelper.initService()
        val call = apiService.getAnak()
        call.enqueue(object : Callback<List<DataAnakMdl>> {
            override fun onResponse(call: Call<List<DataAnakMdl>>, response: Response<List<DataAnakMdl>>) {
                progressBar.visibility = View.GONE

                val data = response.body()
                if (data!!.isNotEmpty()) {
                    listAnak?.clear()
                    listAnak.addAll(data)
                    adapter?.notifyDataSetChanged()

                } else {
                    Toast.makeText(applicationContext, "Tidak ada daftar anak", Toast.LENGTH_SHORT).show()
                }

            }

            override fun onFailure(call: Call<List<DataAnakMdl>>, t: Throwable) {
                progressBar.visibility = View.GONE
                t.printStackTrace()
                t.printStackTrace()
                Toast.makeText(applicationContext, "Cek koneksi internet anda!", Toast.LENGTH_SHORT).show()

            }
        })
    }

}

