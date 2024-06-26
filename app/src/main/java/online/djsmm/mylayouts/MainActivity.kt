package online.djsmm.mylayouts

import android.content.Intent
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Relation
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import online.djsmm.mylayouts.databinding.ActivityMainBinding

private lateinit var binding : ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        binding.constraintLayoutCard.setOnClickListener {
           startActivity(Intent(this,Constrain::class.java))

        }

        binding.linearLayoutCard.setOnClickListener {
            val intent = Intent(this,Linear::class.java)
            startActivity(intent)
        }

        binding.relativeLayoutCard.setOnClickListener {
            val intent = Intent(this,relative::class.java)
            startActivity(intent)
        }

    }
}