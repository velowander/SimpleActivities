package org.fanchuan.coursera;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class RoundBallActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_round_ball);
        WebView webViewRB = (WebView) findViewById(R.id.webViewRB);
        WebSettings myWebSettings = webViewRB.getSettings();
        //Decided not to use myWebSettings.setBuiltInZoomControls(true) for performance
        myWebSettings.setJavaScriptEnabled(true);
        myWebSettings.setDomStorageEnabled(true);
        //In Android Studio with Gradle build system, place assets in /src/main/
        webViewRB.loadUrl("file:///android_asset/roundball/roundball.html");
    }
}
