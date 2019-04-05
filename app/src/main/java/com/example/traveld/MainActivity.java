package com.example.traveld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    /*private Button GetPersonalInf;
    private Button GetStartTime;
    private Button GetEndTime;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button getPerInf = (Button) findViewById(R.id.getPersonalInf);
        getPerInf.setOnClickListener(this);
        Button getStartTime = (Button) findViewById(R.id.getStartTime);
        getStartTime.setOnClickListener(this);
        Button getEndTime = (Button) findViewById(R.id.getEndTime);
        getEndTime.setOnClickListener(this);
        Button getAimLocation = (Button) findViewById(R.id.getAimLocation);
        getAimLocation.setOnClickListener(this);
    }


    @Override
    public void onClick(View view){
        switch (view.getId()){
            case R.id.getPersonalInf:
                Toast.makeText(this,"获取个人偏好",Toast.LENGTH_SHORT).show();;
            case R.id.getStartTime:
                Toast.makeText(this,"获取出发时间",Toast.LENGTH_SHORT).show();
            case R.id.getEndTime:
                Toast.makeText(this,"获取结束时间",Toast.LENGTH_SHORT).show();
            case R.id.getAimLocation:
                Toast.makeText(this,"获取目的地城市",Toast.LENGTH_SHORT).show();
        }
    }

}
