package shafi.example.flatmemberrecyclerview

import shafi.example.flatmemberrecyclerview.R
import java.util.ArrayList

class Member(val image: Int, val name: String, val phoneNo: String, val email: String) {

    companion object {
        fun memberArrayList(): ArrayList<Member> {
            val members = ArrayList<Member>()
            members.add(Member(R.drawable.member, "Shafi", "01245555445", "ip@gmail.com"))
            members.add(Member(R.drawable.member2, "Tawheed", "01252245", "tw@gmail.com"))
            members.add(Member(R.drawable.member3, "Ghalib", "01254564", "gh@gmaili.com"))
            members.add(Member(R.drawable.member4, "Mehedi", "01245365", "md@gmali.com"))
            return members
        }
    }
}