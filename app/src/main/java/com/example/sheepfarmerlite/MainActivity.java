package com.example.sheepfarmerlite;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {
    private TextView status;
    @Override public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout root = new LinearLayout(this);
        root.setOrientation(LinearLayout.VERTICAL);
        root.setPadding(28, 36, 28, 28);
        root.setGravity(Gravity.CENTER_HORIZONTAL);
        root.setBackgroundColor(Color.rgb(248, 249, 251));

        TextView title = new TextView(this);
        title.setText("Sheep Farmer Lite");
        title.setTextSize(24);
        title.setTextColor(Color.rgb(35, 45, 55));
        root.addView(title);

        TextView hint = new TextView(this);
        hint.setText("独立基础界面原型 · 不连接第三方服务");
        hint.setTextSize(14);
        hint.setPadding(0, 12, 0, 24);
        root.addView(hint);

        EditText sheepId = new EditText(this);
        sheepId.setSingleLine(true);
        sheepId.setHint("输入目标 ID（仅用于界面演示）");
        root.addView(sheepId, new LinearLayout.LayoutParams(-1, -2));

        Button start = new Button(this);
        start.setText("开始");
        root.addView(start, new LinearLayout.LayoutParams(-1, -2));

        Button stop = new Button(this);
        stop.setText("停止");
        root.addView(stop, new LinearLayout.LayoutParams(-1, -2));

        status = new TextView(this);
        status.setText("状态：待机");
        status.setTextSize(16);
        status.setPadding(0, 20, 0, 0);
        root.addView(status);

        start.setOnClickListener(v -> status.setText("状态：演示中（未执行自动化操作）"));
        stop.setOnClickListener(v -> status.setText("状态：已停止"));
        setContentView(root);
    }
}
