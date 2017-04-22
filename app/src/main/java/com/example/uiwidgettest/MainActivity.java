package com.example.uiwidgettest;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Process;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button button;
    private EditText editText;
    private ImageView imageView;
    private ProgressBar progressBar;
    private ProgressBar horizontionProgressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button)findViewById(R.id.button);
        editText = (EditText)findViewById(R.id.edit_text);
        imageView = (ImageView)findViewById(R.id.image_view);
        progressBar = (ProgressBar)findViewById(R.id.progress_bar);
        horizontionProgressBar = (ProgressBar)findViewById(R.id.hprogress_bar);

        button.setOnClickListener(this);
    }

//    获取EditText中的字符串内容
//    @Override
//    public void onClick(View v) {
//        switch (v.getId()){
//            case R.id.button:
//                String inputText = editText.getText().toString();
//                Toast.makeText(MainActivity.this,inputText,Toast.LENGTH_SHORT).show();
//                break;
//            default:
//                break;
//        }
//    }

//    //用button监听事件实现更换图片
//    public void onClick(View v){
//        imageView.setImageResource(R.drawable.phone_2);
//    }

//    //为圆形进度条绑定按钮
//    public void onClick(View v){
//        switch (v.getId()){
//            case R.id.button:
//                if(progressBar.getVisibility()==View.GONE)
//                {
//                    progressBar.setVisibility(View.VISIBLE);
//                }
//                else
//                {
//                    progressBar.setVisibility(View.GONE);
//                }
//        }
//    }


//    //设置水平进度条
//    public void onClick(View v){
//        int progress = horizontionProgressBar.getProgress();
//        progress = progress + 10;
//        horizontionProgressBar.setProgress(progress);
//    }

    //AlterDialog 的使用方法
    public void onClick(View v){
        AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
        dialog.setTitle("This is AlertDialog");
        dialog.setMessage("Something important");
        dialog.setCancelable(true);
        dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        dialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        dialog.show();
    }


    //ProgressDialog 的使用方法
//    public void onClick (View v){
//        ProgressDialog progressDialog = new ProgressDialog(MainActivity.this);
//        progressDialog.setTitle("This is ProgressDialog");
//        progressDialog.setMessage("Loading...");
//        progressDialog.setCancelable(true);
//        progressDialog.show();
//    }




}
