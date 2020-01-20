package com.acrony.kotlinseekbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SeekBar
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    var sbStandard:SeekBar?=null
    var sbDiscrete:SeekBar?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sbStandard=findViewById<SeekBar>(R.id.sbDiscrete)
        var tvSbvalue=findViewById<TextView>(R.id.tvSeekbarValue)


        sbDiscrete=findViewById<SeekBar>(R.id.seekBar)


        sbStandard?.setOnSeekBarChangeListener(object :SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
               // Toast.makeText(applicationContext,"Seekbar Status:$progress",Toast.LENGTH_LONG).show()
                tvSbvalue!!.setText("Seekbar Status:$progress")
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {
                Toast.makeText(applicationContext,"Seekbar is in Use now",Toast.LENGTH_LONG).show()
            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {
                Toast.makeText(applicationContext,"Seekbar not in use",Toast.LENGTH_LONG).show()
            }


        })

        sbDiscrete?.setOnSeekBarChangeListener(object :SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                tvSbvalue!!.setText("Seekbar Status:$progress")
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {
                Toast.makeText(applicationContext,"Seekbar is in Use now",Toast.LENGTH_LONG).show()
            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {
                Toast.makeText(applicationContext,"Seekbar not in use",Toast.LENGTH_LONG).show()
            }


        })

    }
}
