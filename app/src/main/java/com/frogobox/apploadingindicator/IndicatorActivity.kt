package com.frogobox.apploadingindicator

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.frogobox.apploadingindicator.databinding.ActivityIndicatorBinding

/**
 * Created by Jack Wang on 2016/8/5.
 */
class IndicatorActivity : AppCompatActivity() {

    private val binding: ActivityIndicatorBinding by lazy {
        ActivityIndicatorBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val indicator = intent.getStringExtra("indicator")
        binding.avi.setIndicator(indicator)
    }

    fun hideClick(view: View?) {
        binding.avi.hide()
        // or avi.smoothToHide();
    }

    fun showClick(view: View?) {
        binding.avi.show()
        // or avi.smoothToShow();
    }

}