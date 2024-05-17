package com.example.projectone

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView


//To Create Adapter for RecyclerView
//And Make It Template
class MyAdapter(private val CatsList: ArrayList<Cats>) :
    RecyclerView.Adapter<MyAdapter.MyViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return MyViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return CatsList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = CatsList[position]
        holder.titleImage.setImageResource(currentItem.titleImage)
        holder.titleHeading.text = currentItem.heading
    }


    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val titleImage: ShapeableImageView = itemView.findViewById(R.id.imagee)
        val titleHeading: TextView = itemView.findViewById(R.id.tvHeading)

    }

}


//                                  Recycler View Template


//#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end
//
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import androidx.recyclerview.widget.RecyclerView
//
//class ${NAME} : RecyclerView.Adapter<${Model}Adapter.${ViewHolder_NAME}>() {
//
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ${ViewHolder_NAME} {
//        val view = LayoutInflater.from(context).inflate(R.layout.${item_NAME}, parent, false)
//        return ${ViewHolder_NAME}(view)
//    }
//
//    override fun getItemCount() = OJGName.size
//
//    override fun onBindViewHolder(holder: ${ViewHolder_NAME}, position: Int) {
//        holder.bind(data[position])
//    }
//
//    class ${ViewHolder_NAME}(itemView: View) : RecyclerView.${ViewHolder_NAME}(itemView) {
//        fun bind(item: ${Model}) = with(itemView) {
//        // TODO: Bind the data with View
//    }
//    }
//}


