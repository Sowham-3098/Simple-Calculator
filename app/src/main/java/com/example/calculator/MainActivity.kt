package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.calculator.databinding.ActivityMainBinding
import net.objecthunter.exp4j.ExpressionBuilder

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.ac.setOnClickListener{
            binding.input.text=""
            binding.output.text=""
        }
        binding.btn0.setOnClickListener {
           binding.input.append("0")
        }
        binding.btn1.setOnClickListener {
            binding.input.append("1")
        }
        binding.btn2.setOnClickListener {
            binding.input.append("2")
        }
        binding.btn3.setOnClickListener {
            binding.input.append("3")
        }
        binding.btn4.setOnClickListener {
            binding.input.append("4")
        }
        binding.btn5.setOnClickListener {
            binding.input.append("5")
        }
        binding.btn6.setOnClickListener {
            binding.input.append("6")
        }
        binding.btn7.setOnClickListener {
            binding.input.append("7")
        }
        binding.btn8.setOnClickListener {
            binding.input.append("8")
        }
        binding.btn9.setOnClickListener {
            binding.input.append("9")
        }
        binding.btnDot.setOnClickListener {
            binding.input.append(".")
        }
        binding.minus.setOnClickListener {
            binding.input.append("-")
        }
        binding.plus.setOnClickListener {
            binding.input.append("+")
        }
        binding.multiply.setOnClickListener {
            binding.input.append("*")
        }
        binding.divide.setOnClickListener {
            binding.input.append("/")
        }
        binding.startbracket.setOnClickListener {
            binding.input.append("(")
        }
        binding.endbracket.setOnClickListener {
            binding.input.append(")")
        }
       binding.back.setOnClickListener {
           val string=binding.input.text.toString()
           if(string.isNotEmpty()){
               binding.input.text=string.substring(0,string.length-1)
           }
               binding.output.text=""

       }
        binding.equal.setOnClickListener {
            val expression= ExpressionBuilder(binding.input.text.toString()).build()
            val result=expression.evaluate()
            val longResult=result.toLong()
            if(result==longResult.toDouble()){
binding.output.text=longResult.toString()
            }else{
                binding.output.text=result.toString()
            }
        }
    }
}