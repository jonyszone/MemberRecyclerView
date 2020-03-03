package shafi.example.flatmemberrecyclerview;

import java.util.ArrayList;

public class Member {
    private int image;
    private String name;
    private String phoneNo;
    private String email;

    public Member(int image, String name, String phoneNo, String email) {
        this.image = image;
        this.name = name;
        this.phoneNo = phoneNo;
        this.email = email;
    }

    public int getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public String getEmail() {
        return email;
    }

    public static ArrayList<Member> memberArrayList(){
        ArrayList<Member> members = new ArrayList<>();
        members.add(new Member(R.drawable.member,"Shafi","01245555445","ip@gmail.com"));
        members.add(new Member(R.drawable.member2,"Tawheed","01252245","tw@gmail.com"));
        members.add(new Member(R.drawable.member3,"Ghalib","01254564","gh@gmaili.com"));
        members.add(new Member(R.drawable.member4,"Mehedi","01245365","md@gmali.com"));
        return members;
    }
}


