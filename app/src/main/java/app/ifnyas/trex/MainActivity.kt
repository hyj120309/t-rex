package app.ifnyas.trex

import android.annotation.SuppressLint
import android.os.Bundle
import android.webkit.WebView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initFun()
    }

    private fun initFun() {
        initWeb()
        initAds()
    }

    @SuppressLint("SetJavaScriptEnabled")
    private fun initWeb() {
        findViewById<WebView>(R.id.view_web).apply {
            settings.javaScriptEnabled = true
            loadUrl("file:///android_asset/index.html")
        }
    }

    private fun initAds() {
        //
    }
}