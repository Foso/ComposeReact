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
