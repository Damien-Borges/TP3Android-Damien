package fr.upjv.ccm.tp1damien.yourFeature.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import fr.upjv.ccm.tp1damien.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Get the xml layout to attach to this activity
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val valueFromIntent = intent?.extras?.getString("MY_KEY")
        binding.secondActivityText.text = valueFromIntent
    }
}