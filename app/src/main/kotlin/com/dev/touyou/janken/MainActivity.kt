package com.dev.touyou.janken

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.view.View
import java.util.*

class MainActivity : AppCompatActivity() {

    var cpu: ImageView? = null
    var player: ImageView? = null
    var result: TextView? = null

    val r: Random = Random()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        cpu = findViewById(R.id.cpu) as ImageView
        player = findViewById(R.id.player) as ImageView
        result = findViewById(R.id.result) as TextView
    }

    // Button
    fun goo(v: View) {
        player?.setImageResource(R.drawable.goo)
        val random: Int = r.nextInt(3)
        when(random) {
            0 -> {
                cpu?.setImageResource(R.drawable.goo)
                result?.setText("引き分けです")
            }
            1 -> {
                cpu?.setImageResource(R.drawable.choki)
                result?.setText("勝ちです")
            }
            2 -> {
                cpu?.setImageResource(R.drawable.paa)
                result?.setText("負けです")
            }
        }
    }
    fun choki(v: View) {
        player?.setImageResource(R.drawable.choki)
        val random: Int = r.nextInt(3)
        when(random) {
            0 -> {
                cpu?.setImageResource(R.drawable.goo)
                result?.setText("負けです")
            }
            1 -> {
                cpu?.setImageResource(R.drawable.choki)
                result?.setText("引き分けです")
            }
            2 -> {
                cpu?.setImageResource(R.drawable.paa)
                result?.setText("勝ちです")
            }
        }
    }
    fun paa(v: View) {
        player?.setImageResource(R.drawable.paa)
        val random: Int = r.nextInt(3)
        when(random) {
            0 -> {
                cpu?.setImageResource(R.drawable.goo)
                result?.setText("勝ちです")
            }
            1 -> {
                cpu?.setImageResource(R.drawable.choki)
                result?.setText("負けです")
            }
            2 -> {
                cpu?.setImageResource(R.drawable.paa)
                result?.setText("引き分けです")
            }
        }
    }
}
