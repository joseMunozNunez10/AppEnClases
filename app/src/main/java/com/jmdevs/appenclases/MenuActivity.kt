package com.jmdevs.appenclases

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.jmdevs.appenclases.appsalud.AppSalud
import com.jmdevs.appenclases.databinding.ActivityMenuBinding
import com.jmdevs.appenclases.login.LoginDiseño

class MenuActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMenuBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()

        binding = ActivityMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)

        ViewCompat.setOnApplyWindowInsetsListener(binding.root) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
            // AQUI DEBO SIEMPRE INICIALIZAR LAS FUNCIONES
        intentAppSalud()
        intentAppLogin()

    }

            // ACA LA LOGICA DEL BOTON  O BOTONES
    private fun intentAppSalud() {
        binding.btnAppSalud.setOnClickListener {
            // Crear el Intent explícito
            val intent = Intent(this, AppSalud::class.java)

            startActivity(intent)

        }
    }

    private fun intentAppLogin(){
        binding.btnAppLogin.setOnClickListener{
            val intent = Intent(this, LoginDiseño::class.java )

            startActivity(intent)
        }

    }
}