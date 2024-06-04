package com.example.cheng_jer_seng_quiz2

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
            val editText1 = findViewById<EditText>(R.id.editTextNumberDecimal2)
            val editText2 = findViewById<EditText>(R.id.editTextNumberDecimal3)
            val editText3 = findViewById<EditText>(R.id.editTextNumberDecimal4)
            val buttonAdd = findViewById<Button>(R.id.button4)
            val buttonSubtract = findViewById<Button>(R.id.button5)
            val buttonMultiply = findViewById<Button>(R.id.button6)
            val textViewResult = findViewById<TextView>(R.id.textView3)

            buttonAdd.setOnClickListener {
                val number1 = editText1.text.toString().toDoubleOrNull() ?: 0.0
                val number2 = editText2.text.toString().toDoubleOrNull() ?: 0.0
                val number3 = editText3.text.toString().toDoubleOrNull() ?: 0.0

                val result = (number1 + number2 + number3).toInt()
                textViewResult.text = "Result: $result"
            }

            buttonSubtract.setOnClickListener {
                val number1 = editText1.text.toString().toDoubleOrNull() ?: 0.0
                val number2 = editText2.text.toString().toDoubleOrNull() ?: 0.0
                val number3 = editText3.text.toString().toDoubleOrNull() ?: 0.0

                val result = (number1 - number2 + number3).toInt()
                textViewResult.text = "Result: $result"
            }

            buttonMultiply.setOnClickListener {
                val number1 = editText1.text.toString().toDoubleOrNull() ?: 0.0
                val number2 = editText2.text.toString().toDoubleOrNull() ?: 0.0
                val number3 = editText3.text.toString().toDoubleOrNull() ?: 0.0

                val result = (number1 * number2 - number3).toInt()
                textViewResult.text = "Result: $result"
            }

    }
}