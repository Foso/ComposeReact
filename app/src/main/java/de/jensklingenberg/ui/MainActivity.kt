package de.jensklingenberg.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.ui.core.setContent
import de.jensklingenberg.composereact.runApp


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
                runApp (
                    FirstComponent()
                )
        }
    }
}






