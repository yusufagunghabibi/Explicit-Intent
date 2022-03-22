package com.example.myintentappfajar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() , View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnMoveActivity: Button =
            findViewById(R.id.btn_move_activity)
        btnMoveActivity.setOnClickListener(this)

        val btnMoveWithDataActivity: Button =
            findViewById(R.id.btn_move_activity_data)
        btnMoveWithDataActivity.setOnClickListener(this)

        val moveWithDataIntent = Intent(this@MainActivity, MoveWithDataActivity::class.java)
        moveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_NAME, "Native Programming")
        moveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_AGE, 20)
        startActivity(moveWithDataIntent)

        val btnMoveWithObject:Button =
            findViewById(R.id.btn_move_activity_object)
        btnMoveWithObject.setOnClickListener(this)
    }

    override fun onClick(v: View?){
        when (v?.id) {
            R.id.btn_move_activity ->{
                val moveIntent = Intent (this@MainActivity,MoveActivity::class.java)
                startActivity(moveIntent)

            }
            R.id.btn_move_activity_data -> {
                val moveIntent = Intent (this@MainActivity,MainActivity::class.java)
                startActivity(moveIntent)

            }

            R.id.btn_move_activity_object -> {
                val person = Person (
                    "Native Mobile Programming", 20,
                    "native@gmail.com",
                    "Pekanbaru"
                        )
                val moveWithObjectIntent = Intent(this@MainActivity,
                MoveWithObjectActivity::class.java)

                moveWithObjectIntent.putExtra(MoveWithObjectActivity.EXTRA_PERSON, person)
                    startActivity(moveWithObjectIntent)
            }



            }
        }
    }