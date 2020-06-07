package de.jensklingenberg.ui

import android.util.Log
import androidx.compose.Composable
import androidx.ui.foundation.Text
import de.jensklingenberg.composereact.RComponent
import de.jensklingenberg.composereact.RProps
import de.jensklingenberg.composereact.RState

data class TextProps(val text: String=""): RProps

data class TextState(val text:String=""): RState

class TextComponent(props: TextProps = TextProps()) : RComponent<TextProps, TextState>(props) {

    override fun initState(props: TextProps): TextState {
        return TextState(text = props.text) }

    @Composable
    override fun render() {
        Text(text = "Hello Text!  " + state.value.text)
    }

    override fun componentWillUnmount() {
        Log.d("TextComponent", "UnMount")
    }

}

@Composable fun text(myText: TextProps) = TextComponent(
    myText
).start()
