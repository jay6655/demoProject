package com.example.loginapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.loginapplication.databinding.ActivityCalculatorBinding

class CalculatorActivity : AppCompatActivity() {
    private var in1 = 0.0
    private var i2: Double = 0.0
    private var add = false
    private var sub: Boolean = false
    private var multiply: Boolean = false
    private var divide: Boolean = false
    private var remainder: Boolean = false
    var deci: Boolean = false

    lateinit var binding: ActivityCalculatorBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCalculatorBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onStart() {
        super.onStart()
        binding.b1.setOnClickListener {
            binding.display.text = binding.display.text.toString() + "1"
        }

        binding.b2.setOnClickListener {
            binding.display.text = binding.display.text.toString() + "2"
        }

        binding.b3.setOnClickListener {
            binding.display.text = binding.display.text.toString() + "3"
        }

        binding.b4.setOnClickListener {
            binding.display.text = binding.display.text.toString() + "4"
        }

        binding.b5.setOnClickListener {
            binding.display.text = binding.display.text.toString() + "5"
        }

        binding.b6.setOnClickListener {
            binding.display.text = binding.display.text.toString() + "6"
        }

        binding.b7.setOnClickListener {
            binding.display.text = binding.display.text.toString() + "7"
        }

        binding.b8.setOnClickListener {
            binding.display.text = binding.display.text.toString() + "8"
        }

        binding.b9.setOnClickListener {
            binding.display.text = binding.display.text.toString() + "9"
        }

        binding.b0.setOnClickListener {
            binding.display.text = binding.display.text.toString() + "0"
        }

        binding.badd.setOnClickListener {
            if (binding.display.text.isNotEmpty()) {
                in1 = (binding.display.text.toString() + "").toDouble()
                add = true
                deci = false
                binding.display.text = null
            }
        }

        binding.bsub.setOnClickListener {
            if (binding.display.text.isNotEmpty()) {
                in1 = (binding.display.text.toString() + "").toDouble()
                sub = true
                deci = false
                binding.display.text = null
            }
        }

        binding.bmul.setOnClickListener {
            if (binding.display.text.isNotEmpty()) {
                in1 = (binding.display.text.toString() + "").toDouble()
                multiply = true
                deci = false
                binding.display.text = null
            }
        }

        binding.biv.setOnClickListener {
            if (binding.display.text.isNotEmpty()) {
                in1 = (binding.display.text.toString() + "").toDouble()
                divide = true
                deci = false
                binding.display.text = null
            }
        }

        binding.bRemain.setOnClickListener {
            if (binding.display.text.isNotEmpty()) {
                in1 = (binding.display.text.toString() + "").toDouble()
                remainder = true
                deci = false
                binding.display.text = null
            }
        }

        binding.buttoneql.setOnClickListener {
            if (add || sub || multiply || divide || remainder) {
                i2 = (binding.display.text.toString() + "").toDouble()
            }
            if (add) {
                binding.display.text = (in1 + i2).toString() + ""
                add = false
            }
            if (sub) {
                binding.display.text = (in1 - i2).toString() + ""
                sub = false
            }
            if (multiply) {
                binding.display.text = (in1 * i2).toString() + ""
                multiply = false
            }
            if (divide) {
                binding.display.text = (in1 / i2).toString() + ""
                divide = false
            }
            if (remainder) {
                binding.display.text = (in1 % i2).toString() + ""
                remainder = false
            }
        }

        binding.buttonDel.setOnClickListener {
            binding.display.text = ""
            in1 = 0.0
            i2 = 0.0
        }

        binding.bDot.setOnClickListener {
            if (deci) {
                //do nothing or you can show the error
            } else {
                binding.display.text = binding.display.text.toString() + "."
                deci = true
            }
        }
    }
}