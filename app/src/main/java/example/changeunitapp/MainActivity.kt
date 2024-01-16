package example.changeunitapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.core.widget.addTextChangedListener
import example.changeunitapp.databinding.ActivityMainBinding
import java.lang.NumberFormatException

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    var inputNumber : Int = 0
    var cmToM = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val inputEditText = binding.inputEditText
        val inputUnitText = binding.inputUnitText
        val outputText = binding.outputText
        val outputUnitText = binding.outputUnitText
        val swapImageButton = binding.swapImageButton

        inputEditText.addTextChangedListener { text ->
            inputNumber = if(text.isNullOrEmpty()) {
                0
            }else {
                text.toString().toInt()
            }


            if(cmToM){
                outputText.text = inputNumber.times(0.01).toString()
            } else {
                outputText.text = inputNumber.times(100).toString()
            }

        }

        swapImageButton.setOnClickListener {
            cmToM = cmToM.not()
//            cmToM = !cmToM
            if(cmToM) {
                inputUnitText.text = "cm"
                outputUnitText.text = "m"
                outputText.text = inputNumber.times(0.01).toString()
            } else {
                inputUnitText.text = "m"
                outputUnitText.text = "cm"
                outputText.text = inputNumber.times(100).toString()
            }
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        outState.putBoolean("cmToM", cmToM)
        super.onSaveInstanceState(outState)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        cmToM = savedInstanceState.getBoolean("cmToM")
        binding.inputUnitText.text = if(cmToM) "cm" else "m"
        binding.outputUnitText.text = if(cmToM) "m" else "cm"
        super.onRestoreInstanceState(savedInstanceState)
    }
}