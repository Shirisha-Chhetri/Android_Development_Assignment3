package com.example.assignment3;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class DataActivity extends AppCompatActivity {

    private RecyclerView recycle;

    private String[] name = {"Shirisha","Sachita","Krishna","Pushpa","Niharika", "Sweta","Swita","Apurwa","Albish","Wasif",
            "Prizma","Dipesh","Saroj","Sagun","Milan"};
    private String[] address= {"Sanothimi","Sinamangal","Sinamangal","Koteshwor","Gujeshwori", "Bijaychowk","Gaushala",
            "Bhaktapur","Thimi","Gaushala", "Baneshwor","Tinkune","Balkot","kadaghari","Gongabu"};
    private String[] faculty = {"BBA","BBM","BBS","BSW","CSIT","BCA","BIM","BBA","BBM","BBS","BSW","CSIT","BCA","BIM",
            "BBA","BBM","BBS","BSW","CSIT"};
    private String[] semester = {"1st","2nd","3rd","4th","5th","6th","7th","8th","1st","2nd","3rd","4th","5th","6th","7th",
            "8th","1st","2nd","3rd","4th"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);
        getSupportActionBar().hide();
        recycle = findViewById(R.id.rv);
        recycle.setLayoutManager(new LinearLayoutManager(this));
        recycle.setAdapter(new CustomAdapter(this,name,address,faculty,semester));

    }
}
