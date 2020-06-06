package de.jensklingenberg.ui

import android.util.Log
import androidx.compose.Composable
import androidx.ui.foundation.Text
import androidx.ui.tooling.preview.Preview
import de.jensklingenberg.composereact.RComponent
import de.jensklingenberg.composereact.RProps
import de.jensklingenberg.composereact.RState

class MySecComp : RComponent<RProps, RState>() {

    override fun componentDidMount() {
        Log.d("MySecComp", "DidMount")
    }

    @Composable
    override fun render() {
        Text(text = "MySend")
    }

    override fun componentWillUnmount() {
        Log.d("MySecComp", "UnMount")


    }

}


@Preview(showBackground = true)
@Composable fun secondView() = MySecComp().start()
