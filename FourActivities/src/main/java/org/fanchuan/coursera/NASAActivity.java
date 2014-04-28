package org.fanchuan.coursera;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class NASAActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nasa);
        WebView webViewNASA = (WebView) findViewById(R.id.webViewNASA);
        webViewNASA.getSettings().setBuiltInZoomControls(true);
        //In Android Studio with Gradle build system, place assets in /src/main/
        webViewNASA.loadUrl("file:///android_asset/uofi-at-nasa.html");
    }
}
