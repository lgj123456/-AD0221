package com.example.yhdj.ad0221kuaidi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText edtCom;
    private EditText edtNo;
    private Button btnCom;
    private  Button btnDetail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    private void initViews() {
        edtCom = (EditText) findViewById(R.id.edt_com);
        edtNo = (EditText) findViewById(R.id.edt_no);
        btnCom = (Button) findViewById(R.id.btn_com);
        btnDetail = (Button) findViewById(R.id.btn_detail);

        btnCom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


        btnDetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
