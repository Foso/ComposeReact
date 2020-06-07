package de.jensklingenberg.ui

import android.util.Log
import androidx.compose.Composable
import androidx.ui.foundation.Text
import androidx.ui.layout.Column
import androidx.ui.material.Button
import androidx.ui.tooling.preview.Preview
import de.jensklingenberg.composereact.*


data class UserState(var name: String): RState


class FirstComponent : RComponent<RProps, UserState>() {

    override fun initState(): UserState =
        UserState("Foo")

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
                    it.copy(name = "Bar")
                }
            }) {
                Text( state.value.name)
            }
            if (state.value.name == "Foo") {
                secondComponent()
            }
            text(
                TextProps(
                    state.value.name
                )
            )
        }
    }

}


@Composable fun myComp() = FirstComponent().start()
