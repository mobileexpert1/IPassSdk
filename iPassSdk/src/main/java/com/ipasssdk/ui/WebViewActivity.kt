package com.ipasssdk.ui

import android.Manifest
import android.net.Uri
import android.os.Bundle
import android.webkit.*
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import com.ipasssdk.R


class WebViewActivity : AppCompatActivity() {
    // set fields on your Activity
    val INPUT_FILE_REQUEST_CODE = 1
    private val CAMERA_PERMISSION_REQUEST = 1111
    private var cameraPermission: PermissionRequest? = null
    private val filePathCallback: ValueCallback<Array<Uri>>? = null
    private val cameraPhotoPath: String? = null
    var webView: WebView? = null
     var webUrl:String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        webUrl = intent.getStringExtra("url")

        setContentView(R.layout.activity_web_view)
        webView = findViewById(R.id.web_view)
        webView?.settings?.javaScriptEnabled = true
        webView?.settings?.setSupportZoom(true)
        webView?.settings?.builtInZoomControls = true
        webView?.webViewClient = WebViewClientImpl()
        webView?.webChromeClient = object : WebChromeClient() {
            // Grant permissions for cam

            override fun onPermissionRequest(request: PermissionRequest) {
               print(request)
                if (request.origin.toString() == "https://ipassreact.csdevhub.com/") {
                    ActivityCompat.requestPermissions(this@WebViewActivity,
                         arrayOf( Manifest.permission.CAMERA)  , CAMERA_PERMISSION_REQUEST);
                    cameraPermission = request
                } else {
                    request.deny()
                }
            }
        }
        webView?.loadUrl(webUrl!!)
    }
}


class WebViewClientImpl : WebViewClient() {

    @Deprecated("Deprecated in Java", ReplaceWith("true"))
    override fun shouldOverrideUrlLoading(webView: WebView, url: String): Boolean {
        print("URL--->>$url")
        return true
    }



}