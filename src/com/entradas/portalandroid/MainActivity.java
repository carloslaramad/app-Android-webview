package com.entradas.portalandroid;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends Activity {

	private WebView myWebView;
	
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
 
        this.setContentView(R.layout.activity_main);
 
        myWebView = (WebView) this.findViewById(R.id.webView);
        
     // Enable JavaScript
        WebSettings opciones = myWebView.getSettings();
        opciones.setJavaScriptEnabled(true);
        opciones.setBuiltInZoomControls(false);
        opciones.setGeolocationEnabled(true);
        opciones.setJavaScriptCanOpenWindowsAutomatically(true);
        opciones.setGeolocationDatabasePath("/data/data/EntradasCom");
        opciones.setAppCacheEnabled(true);
        opciones.setDatabaseEnabled(true);
        opciones.setDomStorageEnabled(true);
        
     // Provide a WebViewClient for your WebView
        myWebView.setWebViewClient(new WebViewClient());
        
        myWebView.loadUrl("http://www.entradas.com/");
        
 
    }
	
	@Override
    public void onBackPressed() {
 
        // Check if there's history
        if (this.myWebView.canGoBack())
            this.myWebView.goBack();
        else
            super.onBackPressed();
 
    }

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	
}
