package sg.edu.rp.c346.mywebbrowser;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnLoadURL;
    WebView wvMypage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wvMypage = findViewById(R.id.WebViewMyPage);
        btnLoadURL=findViewById(R.id.buttonLoad);

        wvMypage.setWebViewClient(new WebViewClient());

        btnLoadURL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com.sg";
                wvMypage.loadUrl(url);
                wvMypage.getSettings().setJavaScriptEnabled(true);
                wvMypage.getSettings().setAllowFileAccess(false);
                wvMypage.getSettings().setBuiltInZoomControls(true);
            }
        });
    }
}