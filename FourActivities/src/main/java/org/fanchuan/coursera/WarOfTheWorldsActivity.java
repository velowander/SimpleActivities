package org.fanchuan.coursera;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class WarOfTheWorldsActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_war_of_the_worlds);
        WebView webViewWW = (WebView) findViewById(R.id.webViewWOTW);
        webViewWW.getSettings().setBuiltInZoomControls(true);
        //In Android Studio with Gradle build system, place assets in /src/main/
        webViewWW.loadUrl("file:///android_asset/waroftheworlds.html");
    }
}
