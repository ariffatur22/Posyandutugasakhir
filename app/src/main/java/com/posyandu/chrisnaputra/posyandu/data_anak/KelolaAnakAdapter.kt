package com.posyandu.chrisnaputra.posyandu.data_anak

import android.content.Context
import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.posyandu.chrisnaputra.posyandu.R
import kotlinx.android.synthetic.main.item_kelola_anak.view.*

class KelolaAnakAdapter(val items: ArrayList<DataAnakMdl>, val context: Context) : RecyclerView.Adapter<ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_kelola_anak, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var mData = items?.get(position)
        holder?.tvName?.text = mData?.nama_anak
        var no = position + 1
        holder?.tvId.text = "$no ."

        holder.mView?.setOnClickListener {
            DataAnakMdl.DataAnakObj.anak = mData

            val intent  = Intent(context,DetailAnakActivity::class.java)
            context.startActivity(intent)
        }
    }

    // Gets the number of animals in the list
    override fun getItemCount(): Int {
        return items.size
    }


}

class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    // Holds the TextView that will add each animal to
    val tvName = view.item_anak_name
    val tvId = view.item_anak_id
    var mView = view
}