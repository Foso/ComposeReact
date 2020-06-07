package de.jensklingenberg.composereact

import androidx.compose.*

@Composable fun runApp(builder: Component<*,*>) = builder.start()


abstract class Component<P : RProps, T>(val props: RProps = EmptyProps()) {

    @Composable
    fun start() {
        onPreCommit{
            componentWillMount()
        }
        onCommit {
            componentDidMount()
        }

        onDispose {
            componentWillUnmount()
        }

        render()
    }

    @Composable
    abstract fun render()
    abstract fun componentDidMount()
    abstract fun componentWillUnmount()
    abstract fun componentWillMount()

}