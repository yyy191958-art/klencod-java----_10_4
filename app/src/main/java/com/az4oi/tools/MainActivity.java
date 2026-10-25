package com.az4oi.tools;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.content.ClipboardManager;
import android.content.ClipData;
import android.content.Context;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.ScrollView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // إنشاء ScrollView لتصاميم الأدوات المتعددة بسلاسة
        ScrollView scrollView = new ScrollView(this);
        scrollView.setBackgroundColor(Color.parseColor("#121212"));

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setGravity(Gravity.CENTER_HORIZONTAL);
        layout.setPadding(30, 30, 30, 30);

        // عنوان التطبيق الرئيسي
        TextView title = new TextView(this);
        title.setText("🔥 تطبيق أدوات البايثون الشاملة 🔥");
        title.setTextColor(Color.parseColor("#00FF66"));
        title.setTextSize(20);
        title.setGravity(Gravity.CENTER);
        title.setPadding(0, 10, 0, 30);
        layout.addView(title);

        // إضافة الأزرار للأدوات الـ 7
        addToolButton(layout, "📋 1. أداة رشق انستغرام وتيك توك", getScript1());
        addToolButton(layout, "📋 2. أداة صيد حسابات فيسبوك", getScript2());
        addToolButton(layout, "📋 3. أداة صيد يوزرات تليجرام 🕷️", getScript3());
        addToolButton(layout, "📋 4. أداة لودو (صيد دائم)", getScript4());
        addToolButton(layout, "📋 5. أداة كار باكيج / صيد متطور", getScript5());
        addToolButton(layout, "📋 6. أداة فيسبوك ربط ألعاب (Yopmail)", getScript6());
        addToolButton(layout, "📋 7. أداة تويتر الشاملة", getScript7());
        addToolButton(layout, "📋 8. أداة إنستغرام وجيميل المدمجة", getScript8());
        addToolButton(layout, "📋 9. أداة صيد فيسبوك دومين hi2 / telegmail", getScript9());

        scrollView.addView(layout);
        setContentView(scrollView);
    }

    private void addToolButton(LinearLayout parent, String buttonText, final String scriptContent) {
        TextView btn = new TextView(this);
        btn.setText(buttonText);
        btn.setTextColor(Color.WHITE);
        btn.setTextSize(15);
        btn.setGravity(Gravity.CENTER);
        btn.setPadding(20, 30, 20, 30);
        btn.setBackgroundColor(Color.parseColor("#1E1E1E"));

        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.MATCH_PARENT, 
            LinearLayout.LayoutParams.WRAP_CONTENT
        );
        params.setMargins(0, 10, 0, 10);
        btn.setLayoutParams(params);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                copyToClipboard("PythonScript", scriptContent);
                Toast.makeText(getApplicationContext(), "تم نسخ السكربت بنجاح 📋🚀", Toast.LENGTH_SHORT).show();
            }
        });

        parent.addView(btn);
    }

    private void copyToClipboard(String label, String text) {
        ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
        ClipData clip = ClipData.newPlainText(label, text);
        if (clipboard != null) {
            clipboard.setPrimaryClip(clip);
        }
    }

    // --- السكربت الأول: أداة الرشق ---
    private String getScript1() {
        return "import requests\nfrom user_agent import generate_user_agent as ua\nimport webbrowser\n" +
               "webbrowser.open('https://t.me/+-RI8FhLv6s82ZGY8')\nimport os\n" +
               "print('=== اداة رشق مدفوعة ===')\n";
    }

    // --- السكربت الثاني: صيد فيسبوك ---
    private String getScript2() {
        return "import requests, json, random, time, threading, webbrowser\n" +
               "webbrowser.open('https://t.me/aaaa1qaq')\nprint('=== أداة صيد فيسبوك ===')\n";
    }

    // --- السكربت الثالث: يوزرات تليجرام ---
    private String getScript3() {
        return "import aiohttp, asyncio, random, string, os\n" +
               "print('=== Telegram Username Hunter v5.0 ===')\n";
    }

    // --- السكربت الرابع: لودو ---
    private String getScript4() {
        return "import random, requests, telebot, time, webbrowser\n" +
               "webbrowser.open('https://t.me/XXPytho')\nprint('=== أداة لودو دائم ===')\n";
    }

    // --- السكربت الخامس: كار باكيج ---
    private String getScript5() {
        return "import random, requests, telebot, time, webbrowser\n" +
               "webbrowser.open('https://t.me/XXPytho')\nprint('=== أداة كار باكيج ===')\n";
    }

    // --- السكربت السادس: فيسبوك ربط ألعاب ---
    private String getScript6() {
        return "import random, requests, os, sys, webbrowser\nfrom concurrent.futures import ThreadPoolExecutor\n" +
               "webbrowser.open('https://t.me/python10xa')\nprint('=== فيسبوك ربط ألعاب ===')\n";
    }

    // --- السكربت السابع: تويتر ---
    private String getScript7() {
        return "import sys, time, random, string, threading, requests\nprint('=== أداة تويتر ===')\n";
    }

    // --- السكربت الثامن: إنستغرام وجيميل ---
    private String getScript8() {
        return "import requests, random, json, time, webbrowser, threading, os, base64, secrets, httpx\n" +
               "print('=== أداة إنستغرام وجيميل المدمجة ===')\n";
    }

    // --- السكربت التاسع: ببجي / فحص hi2 ---
    private String getScript9() {
        return "import os, sys, time, json, random, requests\nprint('=== أداة فحص حسابات hi2.in ===')\n";
    }
}