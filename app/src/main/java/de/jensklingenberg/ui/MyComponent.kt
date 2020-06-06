package de.jensklingenberg.ui

import android.util.Log
import androidx.compose.Composable
import androidx.ui.foundation.Text
import androidx.ui.layout.Column
import androidx.ui.material.Button
import androidx.ui.tooling.preview.Preview
import de.jensklingenberg.composereact.*


data class UserState(var name: String): RState


class MyComponent : RComponent<RProps, UserState>() {

    override fun initState(): UserState =
        UserState("Huhu")

    override fun componentWillMount() {
        Log.d("Hello", "componentWillMount")
    }

    override fun componentDidMount() {
        Log.d("Hello", "DidMount")
    }

    override fun componentWillUnmount() {
        Log.d("Hello", "DidMount")
    }

    @Preview(showBackground = true,name = "MyComp")
    @Composable
    override fun render() {
        Column {
            Text(text = "Hello React!  " + state.value.name)
            Button(onClick = {

                setState {
                    it.copy(name = "Ciao")
                }
            }) {
                Text("Hey")
            }
            if (state.value.name == "Huhu") {
                secondView()
            }
            text(
                TextProps(
                    state.value.name
                )
            )
        }
    }

}


@Composable fun myComp() = MyComponent().start()
