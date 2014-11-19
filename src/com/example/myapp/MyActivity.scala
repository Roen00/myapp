package com.example.myapp

import android.app.Activity
import android.os.Bundle

/**
 * Created by zelek on 19.11.14.
 */
class MyActivity extends Activity{

  override def onCreate(savedInstanceState: Bundle) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.main)
  }
}
