package com.example.yhdj.ad0221kuaidi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private EditText edtCom;
    private EditText edtNo;
    private Button btnCom;
    private  Button btnDetail;
    private Gson mGson;
    private RecyclerView mRecyclerView;
    private Myadapter mMyadapter;
    private List<kuaidiNoList.ResultBean> list = new ArrayList<kuaidiNoList.ResultBean>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mGson = new Gson();
        initViews();
        list.add(new kuaidiNoList.ResultBean());
    }

    private void initViews() {
        edtCom = (EditText) findViewById(R.id.edt_com);
        edtNo = (EditText) findViewById(R.id.edt_no);
        btnCom = (Button) findViewById(R.id.btn_com);
        btnDetail = (Button) findViewById(R.id.btn_detail);
        mRecyclerView = (RecyclerView) findViewById(R.id.recycleView);


        final LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);

        btnCom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new Thread(new Runnable() {
                    @Override
                    public void run() {

                        kuaidiUtils.getRequest2();

                        mMyadapter = new Myadapter(kuaidiUtils.getKuaidiNoList());
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {


                                mRecyclerView.setLayoutManager(linearLayoutManager);
                                mRecyclerView.setAdapter(mMyadapter);
                                mMyadapter.notifyDataSetChanged();
                            }
                        });

                    }
                }).start();

            }
        });


        btnDetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        String com = edtCom.getText().toString();
                        String no = edtNo.getText().toString();
                        kuaidiUtils.getRequest1(com,no);
                    }
                }).start();
            }
        });
    }
}
