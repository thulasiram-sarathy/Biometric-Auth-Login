package com.thul.samplebiometric

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.thul.biometriclibrary.BiometricCallback
import com.thul.biometriclibrary.BiometricManager

class MainActivity : AppCompatActivity(), BiometricCallback {

    var tv_fingerprint: TextView? = null
    var mBiometricManager: BiometricManager? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tv_fingerprint = findViewById(R.id.tv_fingerprint)

        tv_fingerprint?.setOnClickListener {
            mBiometricManager = BiometricManager.BiometricBuilder(this@MainActivity)
                .setTitle("My App")
                .setScreen("center") // fullscreen || bottom || center
                  .setTitleBarText(true) // set true if titlebar recquired
                .setSubtitle("Enter My App")
                .setDescription("Confirm fingerprint to continue")
                .setNegativeButtonText("CANCEL")
                .build()

            mBiometricManager!!.authenticate(this@MainActivity)
        }

    }

    override fun onAuthenticationCancelled() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onAuthenticationError(errorCode: Int, errString: CharSequence?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onAuthenticationFailed() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onAuthenticationHelp(helpCode: Int, helpString: CharSequence?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onAuthenticationSuccessful() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onBiometricAuthenticationInternalError(error: String?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onBiometricAuthenticationNotAvailable() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onBiometricAuthenticationNotSupported() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onBiometricAuthenticationPermissionNotGranted() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onSdkVersionNotSupported() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
