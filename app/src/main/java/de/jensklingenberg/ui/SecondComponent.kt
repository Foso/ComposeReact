package de.jensklingenberg.ui

import android.util.Log
import androidx.compose.Composable
import androidx.ui.foundation.Text
import androidx.ui.tooling.preview.Preview
import de.jensklingenberg.composereact.RComponent
import de.jensklingenberg.composereact.RProps
import de.jensklingenberg.composereact.RState

class SecondComponent : RComponent<RProps, RState>() {



    override fun componentDidMount() {
        Log.d("MySecComp", "DidMount")
    }

    @Preview(showBackground = true)
    @Composable
    override fun render() {
        Text(text = "SecondComponent")
    }

    override fun componentWillUnmount() {
        Log.d("MySecComp", "UnMount")
    }

}

@Composable fun secondComponent() = SecondComponent().start()
