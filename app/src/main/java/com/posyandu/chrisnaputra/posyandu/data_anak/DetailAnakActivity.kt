package com.posyandu.chrisnaputra.posyandu.data_anak

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.posyandu.chrisnaputra.posyandu.R
import kotlinx.android.synthetic.main.data_anak.*

class DetailAnakActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.data_anak)

        setData(DataAnakMdl.DataAnakObj.anak)
    }

    private fun setData(anak: DataAnakMdl) {
        nama.text = anak?.nama_anak
        tempatlahir.text = anak?.tempat_lahir
        tgllahir.text = anak?.tgl_lahir
        jeniskelamin.text = anak?.jkel
        bblahir.text = anak?.BB_lahir +" kg"
        pblahir.text = anak?.TB_lahir+" cm"
        namaibu.text = anak?.nama_ibu
        tglpendataan.text = anak?.tgl_pendataan
    }
}
