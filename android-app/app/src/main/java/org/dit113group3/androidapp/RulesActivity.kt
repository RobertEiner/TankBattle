package org.dit113group3.androidapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AlertDialog
import kotlin.system.exitProcess

class RulesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rules)

        val exit = findViewById<ImageButton>(R.id.exit)
        exit.setOnClickListener {
            val eBuilder = AlertDialog.Builder(this)
            eBuilder.setTitle("Exit")
            eBuilder.setIcon(R.drawable.ic_action_name)
            eBuilder.setMessage("Return to main menu ?")
            eBuilder.setPositiveButton("RETURN") { Dialog,which->
                finish()
                exitProcess(0)
            }

            eBuilder.setNegativeButton("CANCEL") { dialog, which ->
            }
            val createBuild = eBuilder.create()
            createBuild.show()

        }

    }
}