package de.jensklingenberg.composereact

import androidx.compose.MutableState
import androidx.compose.State
import androidx.compose.mutableStateOf

abstract class RComponent<P : RProps, S : RState> : Component<P, S> {

    var state: State<S>


    private var myState: MutableState<S>


    constructor() : super() {
        myState =  mutableStateOf( initState())
        state = myState

    }

    constructor(props: P) : super(props) {
        myState =  mutableStateOf( initState(props))
        state = myState
    }

    open fun initState(props: P): S {
        return EmptyState() as S
    }

    open fun initState(): S {
        return EmptyState() as S
    }

    fun setState(buildState: (S) -> S) {
        myState.value = buildState(myState.value)
    }

    override fun componentWillMount() {}

    override fun componentDidMount() {}

    override fun componentWillUnmount() {}

}