package com.example.tugas_1

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {

    lateinit var btn_next : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun clickListener(view: View){
        AlertDialog.Builder(this)
            .setTitle("Dialog Box")
            .setMessage("Apakah aplikasi ini sudah cukup baik?")
            .setPositiveButton("Ya", DialogInterface.OnClickListener {dialog, i ->
                Toast.makeText( this, "Terima Kasih atas Ulasannya", Toast.LENGTH_SHORT).show()
            })
            .setNegativeButton("Tidak", DialogInterface.OnClickListener {dialog, i ->
                Toast.makeText(this, "Terima Kasih atas Ulasannya", Toast.LENGTH_SHORT).show()
            })
            .show()
    }

    fun toastEvent(view: View){
        Toast.makeText(applicationContext, "Button berhasil diklik", Toast.LENGTH_SHORT).show()
    }
}