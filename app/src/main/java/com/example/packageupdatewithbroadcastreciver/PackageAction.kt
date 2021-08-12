package com.example.packageupdatewithbroadcastreciver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.util.Log
import android.widget.Toast

class PackageAction {

    companion object {

        lateinit var mContext: Context
        lateinit var reciver: BroadcastReceiver
        var filter:IntentFilter?=null
        fun sendContext(context: Context) {

            mContext = context

            filter = IntentFilter()
            filter!!.addAction(Intent.ACTION_PACKAGE_ADDED)
            filter!!.addAction(Intent.ACTION_PACKAGE_REMOVED)
            filter!!.addDataScheme("package");

             reciver=object : BroadcastReceiver(){
                override fun onReceive(context: Context?, intent: Intent?) {
                    Toast.makeText(context, intent?.action, Toast.LENGTH_LONG).show()
                    Log.d("kajal",intent?.action!!)
                }

            }


        }


    }


    fun start(){
        mContext.getApplicationContext().registerReceiver(reciver,filter)
    }
   fun stop(){
       mContext.getApplicationContext().unregisterReceiver(reciver)
   }


}