package com.example.liuyueyue.seekbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;
/*
* setMax:设置seekbar的最大数值
* setProgress:设置seekbar当前的数值
* setSeondaryProgress:设置seekbar的第二数值，即当前拖动条推荐的数值
* */
/*需要用到的监听器接口：OnSeekBarChangeListener*/
/*三大监听器
* 1.onProgressChanged  数值改变
* 2.onStartTrackingTouch  开始拖到
* 3.onStopTrackingTouch   停止拖到*/
public class MainActivity extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener{
private SeekBar seekBar;
    private TextView tv1,tv2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        seekBar = (SeekBar) findViewById(R.id.seekBar);
        seekBar.setOnSeekBarChangeListener(this);
        tv1 = (TextView) findViewById(R.id.tv1);
        tv2 = (TextView) findViewById(R.id.tv2);

}
    //数值改变
    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        tv1.setText("正在拖动");
        tv2.setText("当前数值是："+progress);
    }
//开始拖动
    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {
        tv1.setText("开始拖动");
    }
//停止拖动
    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {
        tv1.setText("停止拖动");
    }
}
