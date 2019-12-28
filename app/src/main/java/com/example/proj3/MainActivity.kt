package com.example.proj3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editNumOne=findViewById<EditText>(R.id.edit_num_one)
        val editNumTwo=findViewById<EditText>(R.id.edit_num_two)

        val btnSum=findViewById<Button>(R.id.btn_sum)
        val btnSub=findViewById<Button>(R.id.btn_sub)
        val btnMult=findViewById<Button>(R.id.btn_mult)
        val btnDiv=findViewById<Button>(R.id.btn_div)

        val txtResult=findViewById<TextView>(R.id.txt_result)
        //val txtResult:TextView=findViewById(R.id.txt_result)

        btnSum.setOnClickListener {
            var numOne:Int=editNumOne.text.toString().toInt()
            var numTwo:Int=editNumTwo.text.toString().toInt()

            var result=numOne+numTwo
            txtResult.text=result.toString()
        }

        btnSub.setOnClickListener {
            var numOne:Int=editNumOne.text.toString().toInt()
            var numTwo:Int=editNumTwo.text.toString().toInt()
            var sub= numOne-numTwo
            txtResult.text=sub.toString()
        }

        btnMult.setOnClickListener {
            var numOne:Int=editNumOne.text.toString().toInt()
            var numTwo:Int=editNumTwo.text.toString().toInt()

            var mult=numOne*numTwo
            txtResult.text=mult.toString()
        }

        btnDiv.setOnClickListener {
            var numOne:Int=editNumOne.text.toString().toInt()
            var numTwo:Int=editNumTwo.text.toString().toInt()

            var div=numOne/numTwo
            txtResult.text=div.toString()
        }
    }
}
