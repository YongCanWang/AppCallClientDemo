package com.example.administrator.client;

import android.content.ComponentName;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.tv).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                Intent mIntent = new Intent();
//                ComponentName mComp = new ComponentName("com.example.administrator.exampledemo","com.example.administrator.exampledemo.Main2Activity");//注意AcitivityName(目标应用程序)要完整的，带包名的PackageName的
//                mIntent.setComponent(mComp);
//                mIntent.setFlags(101);
//                mIntent.putExtra("data",1111);
//                startActivity(mIntent);


                //要调用另一个APP的activity所在的包名
                String packageName = "com.example.administrator.exampledemo";
                //要调用另一个APP的activity名字
                String activity = "com.example.administrator.exampledemo.Main2Activity";
                ComponentName component = new ComponentName(packageName, activity);
                Intent intent = new Intent();
                intent.setComponent(component);
                intent.setFlags(101);
                intent.putExtra("data", setData());
                startActivity(intent);


            }
        });

    }

    private String setData() {
      String  reqData = "调用者传递过来的数据";
        return reqData;
    }
}
