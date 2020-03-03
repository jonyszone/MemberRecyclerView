package shafi.example.flatmemberrecyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MemberAdapter extends  RecyclerView.Adapter<MemberAdapter.MemberViewHolder>{
    private Context context;
    private ArrayList<Member> members;

    public MemberAdapter(Context context, ArrayList<Member> members){
        this.context = context;
        this.members = members;
    }

    @NonNull
    @Override
    public MemberViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(context);
       View itemView = inflater.inflate(R.layout.member_list,parent, false);
        return new MemberViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MemberViewHolder holder, int position) {
        holder.nameTV.setText(members.get(position).getName());
        holder.emailTV.setText(members.get(position).getEmail());
        holder.phoneTV.setText(members.get(position).getPhoneNo());
        holder.memberIV.setImageResource(members.get(position).getImage());
    }

    @Override
    public int getItemCount() {
       return members.size();
    }

    class MemberViewHolder extends RecyclerView.ViewHolder {
        TextView nameTV,emailTV,phoneTV;
        ImageView memberIV;

        public MemberViewHolder(@NonNull View itemView) {
            super(itemView);
            nameTV = itemView.findViewById(R.id.member_name);
            emailTV = itemView.findViewById(R.id.member_email);
            phoneTV = itemView.findViewById(R.id.member_phone);
            memberIV = itemView.findViewById(R.id.list_member);
        }
    }
}
