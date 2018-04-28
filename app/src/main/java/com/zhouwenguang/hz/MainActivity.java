package com.zhouwenguang.hz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.zhouwenguang.hz.entity.StudentBean;
import com.zhouwenguang.hz.gen.DaoMaster;
import com.zhouwenguang.hz.gen.DaoSession;
import com.zhouwenguang.hz.gen.StudentBeanDao;

import java.util.Date;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.btnOpenSerevice)
    Button btnOpenSerevice;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        DaoMaster.DevOpenHelper devOpenHelper = new DaoMaster.DevOpenHelper(MainActivity.this, "/mnt/sdcard/zhouwenguang.db", null);
        DaoMaster daoMaster = new DaoMaster(devOpenHelper.getWritableDatabase());
        DaoSession daoSession = daoMaster.newSession();
        final StudentBeanDao userDao = daoSession.getStudentBeanDao();
        btnOpenSerevice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StudentBean studentBean=new StudentBean();
                studentBean.setName("周文广");
                studentBean.setDate(new Date());
                userDao.insert(studentBean);
            }
        });



    }
}
