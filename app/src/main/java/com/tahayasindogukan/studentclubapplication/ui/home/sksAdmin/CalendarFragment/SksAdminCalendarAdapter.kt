package com.tahayasindogukan.studentclubapplication.ui.home.sksAdmin.CalendarFragment

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.tahayasindogukan.studentclubapplication.R
import com.tahayasindogukan.studentclubapplication.core.entitiy.Request
import com.tahayasindogukan.studentclubapplication.databinding.SksAdminCalendarFragmentCardViewBinding


class SksAdminCalendarAdapter(var requestsList: List<Request>, val listener: MyClickListener) :
    RecyclerView.Adapter<SksAdminCalendarAdapter.CalendarViewHolder>() {


    inner class CalendarViewHolder(var view: SksAdminCalendarFragmentCardViewBinding) :
        RecyclerView.ViewHolder(view.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CalendarViewHolder {
        val binding =
            SksAdminCalendarFragmentCardViewBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        return CalendarViewHolder(binding)
    }

    fun setFilteredList(clubList: List<Request>) {
        this.requestsList = clubList
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int {
        return requestsList.size
    }

    //holder sayesinde card tasarımına ulaşıyoruz
    override fun onBindViewHolder(holder: CalendarViewHolder, position: Int) {
        val t = holder.view
        val document = requestsList[position]

        t.clubPhoto.setImageResource(R.drawable.image_deneme)

        t.requestsCardViewLayout.setOnClickListener {
            listener.onClick(document)
        }

    }
    interface MyClickListener {
        fun onClick(
            request: Request
        )
    }

}