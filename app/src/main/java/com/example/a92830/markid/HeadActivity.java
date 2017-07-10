package com.example.a92830.markid;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.acker.simplezxing.activity.CaptureActivity;

public class HeadActivity extends BaseActivity implements View.OnClickListener {

    /**
     * 获取信息
     */
    private Button mGetInfo;
    /**
     * 登陆/注册
     */
    private Button mLogIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_head);
        initView();
    }

    private void initView() {
        mGetInfo = (Button) findViewById(R.id.get_info);
        mGetInfo.setOnClickListener(this);
        mLogIn = (Button) findViewById(R.id.log_in);
        mLogIn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.get_info:
                startActivityForResult(new Intent(HeadActivity.this, CaptureActivity.class),
                        CaptureActivity.REQ_CODE);
                break;
            case R.id.log_in:
                break;
        }
    }
}
