package com.healthcarelocator.sample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.healthcarelocator.model.config.HealthCareLocatorCustomObject
import com.healthcarelocator.state.HealthCareLocatorSDK

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val builder = HealthCareLocatorCustomObject.Builder()
        builder.colorPrimary("#a6244d")
        builder.colorSecondary("#36bfd4")
        HealthCareLocatorSDK.init("Your API key").setAppName("Your App Name")
                .setAppDownloadLink("Your app download link").setCustomObject(builder.build())
        HealthCareLocatorSDK.getInstance().startSDKActivity(this)
    }
}