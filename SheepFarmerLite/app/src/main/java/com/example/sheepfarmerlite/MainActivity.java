package com.example.sheepfarmerlite;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class MainActivity extends Activity {
    private TextView status;
    private boolean running = false;
    private int dp(float v) { return (int)(v * getResources().getDisplayMetrics().density + 0.5f); }
    @Override public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setStatusBarColor(Color.rgb(248,250,252));
        getWindow().setNavigationBarColor(Color.rgb(248,250,252));
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        ScrollView scroll = new ScrollView(this);
        LinearLayout root = new LinearLayout(this); root.setOrientation(LinearLayout.VERTICAL);
        root.setPadding(dp(20),dp(24),dp(20),dp(24)); root.setBackgroundColor(Color.rgb(248,250,252));
        scroll.addView(root); setContentView(scroll);
        TextView title = new TextView(this); title.setText("Sheep Farmer Lite"); title.setTextSize(25); title.setTextColor(Color.rgb(15,23,42)); title.setTypeface(null,1); root.addView(title);
        TextView subtitle = new TextView(this); subtitle.setText("基础界面示例 · 启动后直接进入"); subtitle.setTextSize(14); subtitle.setTextColor(Color.rgb(100,116,139)); LinearLayout.LayoutParams sp = new LinearLayout.LayoutParams(-1,-2); sp.topMargin=dp(6); root.addView(subtitle,sp);
        TextView label = new TextView(this); label.setText("目标羊 ID"); label.setTextSize(15); label.setTextColor(Color.rgb(51,65,85)); label.setTypeface(null,1); LinearLayout.LayoutParams lp=new LinearLayout.LayoutParams(-1,-2); lp.topMargin=dp(28); root.addView(label,lp);
        EditText id = new EditText(this); id.setSingleLine(true); id.setHint("输入目标羊 ID"); id.setPadding(dp(14),dp(12),dp(14),dp(12)); root.addView(id,new LinearLayout.LayoutParams(-1,dp(54)));
        Button start = new Button(this); start.setText("开始"); LinearLayout.LayoutParams bp=new LinearLayout.LayoutParams(-1,dp(52)); bp.topMargin=dp(22); root.addView(start,bp);
        Button stop = new Button(this); stop.setText("停止"); LinearLayout.LayoutParams bp2=new LinearLayout.LayoutParams(-1,dp(52)); bp2.topMargin=dp(10); root.addView(stop,bp2);
        status = new TextView(this); status.setText("状态：待命"); status.setTextSize(14); status.setTextColor(Color.rgb(71,85,105)); status.setPadding(dp(14),dp(14),dp(14),dp(14)); status.setBackgroundColor(Color.rgb(226,232,240)); LinearLayout.LayoutParams stp=new LinearLayout.LayoutParams(-1,-2); stp.topMargin=dp(18); root.addView(status,stp);
        TextView note = new TextView(this); note.setText("注意：这是独立基础界面。开始/停止目前只更新界面状态，尚未连接原软件的自动化脚本或服务接口。"); note.setTextSize(13); note.setTextColor(Color.rgb(100,116,139)); LinearLayout.LayoutParams np=new LinearLayout.LayoutParams(-1,-2); np.topMargin=dp(18); root.addView(note,np);
        start.setOnClickListener(v -> { running=true; status.setText("状态：已点击开始（尚未连接自动化功能）"); });
        stop.setOnClickListener(v -> { running=false; status.setText("状态：已停止"); });
    }
}
