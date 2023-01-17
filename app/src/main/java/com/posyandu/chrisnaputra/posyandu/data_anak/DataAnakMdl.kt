package com.posyandu.chrisnaputra.posyandu.data_anak

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button

import com.posyandu.chrisnaputra.posyandu.R

class DataAnakMdl {
    var no_KMS: String? = null
    var no_ibu: String? = null
    var no_staf: String? = null
    var nama_anak: String? = null
    var kelahiran: String? = null
    var penolong: String? = null
    var tgl_lahir: String? = null
    var tempat_lahir: String? = null
    var BB_lahir: String? = null
    var TB_lahir: String? = null
    var jkel: String? = null
    var tgl_pendataan: String? = null
    var nama_ibu: String? = null

    object DataAnakObj {
        var anak: DataAnakMdl = DataAnakMdl()
    }
}


