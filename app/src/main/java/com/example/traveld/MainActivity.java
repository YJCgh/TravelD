package com.example.traveld;

import android.content.DialogInterface;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.traveld.DatePicker.CustomDatePicker;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private DrawerLayout mDrawerLayout;

    private TextView mTvSelectedDate, mTvSelectedTime;

    private CustomDatePicker mDatePicker, mTimerPicker;

    private AlertDialog alertDialog; //多选框

    private Button getPerInf;
    private Button getStartTime;
    private Button getEndTime;
    private Button getAimLocation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getPerInf = (Button) findViewById(R.id.getPersonalInf);
        getPerInf.setOnClickListener(this);
        getStartTime = (Button) findViewById(R.id.getStartTime);
        getStartTime.setOnClickListener(this);
        getEndTime = (Button) findViewById(R.id.getEndTime);
        getEndTime.setOnClickListener(this);
        getAimLocation = (Button) findViewById(R.id.getAimLocation);
        getAimLocation.setOnClickListener(this);

    }


    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.getPersonalInf:
                Toast.makeText(this,"获取个人偏好",Toast.LENGTH_SHORT).show();

                //alertDialog.show();
            case R.id.getStartTime:
                setContentView(R.layout.data_choose_main);
            case R.id.getEndTime:
                Toast.makeText(this,"获取结束时间",Toast.LENGTH_SHORT).show();
            case R.id.getAimLocation:
                Toast.makeText(this,"获取目的地城市",Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.toolbar, menu);
        return true;
    }

    public void showMutilAlertDialog(View view){
        final String[] items = {"个人偏好1","个人偏好2","个人偏好3","个人偏好4","个人偏好5","个人偏好6"};
        AlertDialog.Builder alertBuilder = new AlertDialog.Builder(this);
        alertBuilder.setTitle("选择个人偏好");
        alertBuilder.setMultiChoiceItems(items, null, new DialogInterface.OnMultiChoiceClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i, boolean isCheked) {
                if (isCheked){
                    Toast.makeText(MainActivity.this,"choose" + items[i], Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(MainActivity.this,"取消选择" + items[i],Toast.LENGTH_SHORT).show();
                }
            }
        });

        alertBuilder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                alertDialog.dismiss();
            }
        });

        alertBuilder.setNegativeButton("取消", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                alertDialog.dismiss();
            }
        });

        alertDialog = alertBuilder.create();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.backup:
                Toast.makeText(this,"点击返回按钮",Toast.LENGTH_SHORT).show();
                break;
            case R.id.delete_item_button:
                Toast.makeText(this,"点击删除按钮",Toast.LENGTH_SHORT).show();
                break;
            case R.id.set_tool_button:
                Toast.makeText(this,"点击设置按钮",Toast.LENGTH_SHORT).show();
                break;

            case android.R.id.home:
                mDrawerLayout.openDrawer(GravityCompat.START);
                break;

            default:
        }
        return true;
    }


}
