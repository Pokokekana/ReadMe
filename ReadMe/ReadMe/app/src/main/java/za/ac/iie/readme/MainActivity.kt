package za.ac.iie.readme

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val txtSuggest = findViewById<TextView>(R.id.txtSuggest)
        val edtTime = findViewById<EditText>(R.id.edtTime)
        val btnCompute = findViewById<Button>(R.id.btnCompute)
        val btnClear = findViewById<Button>(R.id.btnClear)

        btnCompute.setOnClickListener {

            val timeOfTheDay = edtTime.text.toString().trim()


            var foodselection = ""


            if (timeOfTheDay == "Morning") {
                foodselection = "Breakfast:cereal, eggs and bacon"
            } else if (timeOfTheDay == "Mid-morning") {
                foodselection = "Snack:chips and cold drink,tea and biscuits"
            } else if (timeOfTheDay == "Afternoon") {
                foodselection = "Lunch:pizza, burgers, burrito, salad"
            } else if (timeOfTheDay == "Mid-afternoon") {
                foodselection = "snack:apple, oranges, grapes"
            } else if (timeOfTheDay == "night") {
                foodselection = "dinner:pap and chicken, pasta and mince, rice and wors"
            } else {
                foodselection =
                    "invalid input. Please enter Morning,Mid-morning,Afternoon,Mid-afternoon,night"
            }
            txtSuggest.text = foodselection

        }

        btnClear.setOnClickListener {
            edtTime.text.clear()
            txtSuggest.text = ""
        }

    }
}
