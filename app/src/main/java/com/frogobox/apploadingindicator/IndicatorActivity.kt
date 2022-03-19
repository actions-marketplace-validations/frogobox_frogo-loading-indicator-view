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
        binding.fli.setIndicator(indicator)
    }

    fun hideClick(view: View?) {
        binding.fli.hide()
        // or fli.smoothToHide();
    }

    fun showClick(view: View?) {
        binding.fli.show()
        // or fli.smoothToShow();
    }

}