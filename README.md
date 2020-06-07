# ComposeReact

## Usage

### Add dependency

```groovy
repositories {
    mavenCentral()
}

dependencies {
   implementation "de.jensklingenberg:composereact:0.1-0.12"
}
```

### Create a RComponent

1) Create a class that extends de.jensklingenberg.composereact.RComponent

```kotlin
class FirstComponent : RComponent<RProps, RState>() {
```

2) Implement the render() function and add the @Composable annotation

```kotlin
@Composable
override fun render() {
//Add your Composables and RComponents here
}
```

### Use a RComponent
To use your RComponent inside other Composables, create an object and call the start()-function

```kotlin
@Composable
override fun render() {
 Column{
   MyOtherComponent().start()
 }
}
```

Inside the setContent{} of your Activity/View, you can also use runApp()

```kotlin
setContent {
    runApp ( FirstComponent() )
}
```

### Define a State
Create a data class that extends RState

```kotlin
data class MyState(var name: String): RState
```

Add the class to your Component

```kotlin
class FirstComponent : RComponent<RProps, MyState>() {
```

Override the initState() and initialize your state 
```kotlin
override fun initState(): MyState = MyState("Foo")
```

You can then use state.value to get your state and set your state with setState()-function like this:
```kotlin
setState {myState->
myState.copy(name = "Bar")
}
```

### Define Props

Create a data class that extends RProps

```kotlin
data class MyProps(var name: String): RProps
```
Add the class to your Component

```kotlin
class FirstComponent(props: MyProps) : RComponent<MyProps, MyState>() {
```

Override the initState() and initialize your state 
```kotlin
 override fun initState(props: MyProps): MyState { 
        return MyState(text = props.text) }
```

### Lifecycle
You can override the following lifecycle methods:

* componentWillMount()

Will be called before the RComponent/Composable is drawn to screen.
 
* componentDidMount()

Will be called when the RComponent/Composable is drawn to screen.

 
* componentWillUnmount()
Will be called when the RComponent/Composable is going to be disposed
