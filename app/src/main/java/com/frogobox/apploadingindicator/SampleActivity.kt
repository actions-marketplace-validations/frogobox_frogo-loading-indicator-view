package com.frogobox.apploadingindicator

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.frogobox.apploadingindicator.databinding.ActivitySampleBinding
import com.frogobox.apploadingindicator.databinding.ItemIndicatorBinding

/**
 * Created by Jack Wang on 2016/8/5.
 */
class SampleActivity : AppCompatActivity() {

    private val binding: ActivitySampleBinding by lazy {
        ActivitySampleBinding.inflate(layoutInflater)
    }

    private val dataIndicators = arrayOf(
        "BallPulseIndicator",
        "BallGridPulseIndicator",
        "BallClipRotateIndicator",
        "BallClipRotatePulseIndicator",
        "SquareSpinIndicator",
        "BallClipRotateMultipleIndicator",
        "BallPulseRiseIndicator",
        "BallRotateIndicator",
        "CubeTransitionIndicator",
        "BallZigZagIndicator",
        "BallZigZagDeflectIndicator",
        "BallTrianglePathIndicator",
        "BallScaleIndicator",
        "LineScaleIndicator",
        "LineScalePartyIndicator",
        "BallScaleMultipleIndicator",
        "BallPulseSyncIndicator",
        "BallBeatIndicator",
        "LineScalePulseOutIndicator",
        "LineScalePulseOutRapidIndicator",
        "BallScaleRippleIndicator",
        "BallScaleRippleMultipleIndicator",
        "BallSpinFadeLoaderIndicator",
        "LineSpinFadeLoaderIndicator",
        "TriangleSkewSpinIndicator",
        "PacmanIndicator",
        "BallGridBeatIndicator",
        "SemiCircleSpinIndicator",
        "com.frogobox.apploadingindicator.MyCustomIndicator"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.recycler.apply {
            layoutManager = GridLayoutManager(this@SampleActivity, 4)
            adapter = object : RecyclerView.Adapter<IndicatorHolder>() {
                override fun onCreateViewHolder(
                    parent: ViewGroup,
                    viewType: Int
                ): IndicatorHolder {
                    return IndicatorHolder(
                        ItemIndicatorBinding.inflate(
                            LayoutInflater.from(
                                parent.context
                            ), parent, false
                        )
                    )
                }

                override fun onBindViewHolder(
                    holder: IndicatorHolder,
                    @SuppressLint("RecyclerView") position: Int
                ) {
                    holder.setData(dataIndicators[position])
                }

                override fun getItemCount(): Int {
                    return dataIndicators.size
                }
            }
        }

    }

    internal class IndicatorHolder(private val binding: ItemIndicatorBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun setData(data: String) {
            binding.apply {
                indicator.setIndicator(data)
                itemLayout.setOnClickListener {
                    val intent = Intent(binding.root.context, IndicatorActivity::class.java)
                    intent.putExtra("indicator", data)
                    binding.root.context.startActivity(intent)
                }
            }

        }

    }

}