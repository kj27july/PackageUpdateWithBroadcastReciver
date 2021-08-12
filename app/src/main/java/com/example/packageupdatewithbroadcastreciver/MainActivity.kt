package com.example.packageupdatewithbroadcastreciver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.net.wifi.WifiManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var reciver: BroadcastReceiver
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

PackageAction().sendContext(this)
//        PackageAction().

//        val filter = IntentFilter()
//        filter.addAction(Intent.ACTION_PACKAGE_ADDED)
//        filter.addAction(Intent.ACTION_PACKAGE_REMOVED)
//        filter.addDataScheme("package");
//
//        val reciver=object : BroadcastReceiver(){
//            override fun onReceive(context: Context?, intent: Intent?) {
//                Toast.makeText(context, intent?.action, Toast.LENGTH_LONG).show()
//                Log.d("kajal",intent?.action!!)
//            }
//        }
//        registerReceiver(reciver,filter)
    }

//    override fun onDestroy() {
//        unregisterReceiver(reciver)
//        super.onDestroy()
//    }
}
