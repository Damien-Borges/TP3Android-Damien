package fr.upjv.ccm.tp1damien.yourFeature.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import fr.upjv.ccm.tp1damien.R
import fr.upjv.ccm.tp1damien.databinding.ActivityValuesBinding

class ValuesLandActivity: AppCompatActivity() {

    private lateinit var binding : ActivityValuesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityValuesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.switchValuesLand.text = getString(R.string.random_string)
        binding.switchValuesLand.isEnabled = resources.getBoolean(R.bool.flag)
    }
}