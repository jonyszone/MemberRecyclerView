package shafi.example.flatmemberrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView memberRV = findViewById(R.id.memberRV);
        MemberAdapter memberAdapter = new MemberAdapter(this, Member.memberArrayList());
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        memberRV.setLayoutManager(linearLayoutManager);
        memberRV.setAdapter(memberAdapter);
    }
}
