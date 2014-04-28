package org.fanchuan.coursera;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;

public class JabberWockyActivity extends Activity {

    boolean webViewIsPicture = false;
    MediaPlayer jw_player;
    WebView webViewJW;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jabberwocky);
        webViewJW = (WebView) findViewById(R.id.webViewJW);
        webViewJW.getSettings().setBuiltInZoomControls(true);
        //In Android Studio with Gradle build system, place assets in /src/main/
        TogglePicture();

    }

    protected void onResume() {
        Log.i("Music Test", "onResume");
        jw_player = MediaPlayer.create(this, R.raw.scary);
        jw_player.start();
        jw_player.setLooping(true);
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.i("Music Test", "onPause");
        jw_player.stop();
        jw_player.release();
        super.onPause();
    }

    void TogglePicture() {
        if (webViewIsPicture) {
            webViewJW.loadUrl("file:///android_asset/thejabberwocky.jpg");
        } else {
            webViewJW.loadUrl("file:///android_asset/jabberwocky.html");
        }
        webViewIsPicture ^= true; //XOR; logically same as A = !A
    }

    public void pictureButtonToggle(View vw) {
        TogglePicture();
    }


    public void wikiButtonOnClick(View vw) {
        String url = "http://en.wikipedia.org/wiki/Jabberwocky";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }
}
