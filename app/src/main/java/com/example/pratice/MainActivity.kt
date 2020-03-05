package com.example.pratice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var diceImage : ImageView
    lateinit var diceImage2 : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }

        diceImage = findViewById(R.id.dice_image)
        diceImage2 = findViewById(R.id.dice_image2)

    }
   private fun rollDice() {

       //val diceImage_2 :ImageView = findViewById(R.id.dice_image2)
        //val rollText: TextView = findViewById(R.id.result_text)

        //rollText.text =randomInt.toString()
        Toast.makeText(this, "button clicked",
            Toast.LENGTH_SHORT).show()

      /** val randomInt = (1..6).random()
       val drawableRes = when (randomInt){
           1 -> R.drawable.dice_1
           2 -> R.drawable.dice_2
           3 -> R.drawable.dice_3
           4 -> R.drawable.dice_4
           5 -> R.drawable.dice_5
           else -> R.drawable.dice_6
       }
       diceImage.setImageResource(drawableRes)**/

       diceImage.setImageResource(imagerand())
       diceImage2.setImageResource(imagerand())
   }
    private fun imagerand():Int{
        val randomInt = (1..6).random()

        return when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
    }


    /**private fun countUp(){

        val resultText: TextView = findViewById(R.id.result_text)

        if(resultText.text =="Hello World!") {
            resultText.text = "1"
        }else{
            var resultInt = resultText.text.toString().toInt()
            if(resultInt <6){
                resultInt++
                resultText.text = resultInt.toString()
            }
        }
    }**/
}
