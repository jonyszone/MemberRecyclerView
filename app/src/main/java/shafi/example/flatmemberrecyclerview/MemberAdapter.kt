package shafi.example.flatmemberrecyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import shafi.example.flatmemberrecyclerview.MemberAdapter.MemberViewHolder

class MemberAdapter(private val context: Context, private val members: ArrayList<Member>) :
    RecyclerView.Adapter<MemberViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MemberViewHolder {
        val inflater = LayoutInflater.from(context)
        val itemView = inflater.inflate(R.layout.member_list, parent, false)
        return MemberViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MemberViewHolder, position: Int) {
        holder.nameTV.text = members[position].name
        holder.emailTV.text = members[position].email
        holder.phoneTV.text = members[position].phoneNo
        holder.memberIV.setImageResource(members[position].image)
    }

    override fun getItemCount(): Int {
        return members.size
    }

    class MemberViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var nameTV: TextView = itemView.findViewById(R.id.member_name)
        var emailTV: TextView = itemView.findViewById(R.id.member_email)
        var phoneTV: TextView = itemView.findViewById(R.id.member_phone)
        var memberIV: ImageView = itemView.findViewById(R.id.list_member)

    }
}