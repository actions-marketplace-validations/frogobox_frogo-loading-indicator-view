![](docs/image/banner.png?raw=true)

## About This Project (release-and-work-in-progress 👷🔧️👷‍♀️⛏)
[![Android CI](https://github.com/frogobox/frogo-loading-indicator-view/actions/workflows/android-ci.yml/badge.svg)](https://github.com/frogobox/frogo-loading-indicator-view/actions/workflows/android-ci.yml)
[![Scan with Detekt](https://github.com/frogobox/frogo-loading-indicator-view/actions/workflows/detekt.yml/badge.svg)](https://github.com/frogobox/frogo-loading-indicator-view/actions/workflows/detekt.yml)

- Collection of nice loading animations for Android

## Demo
![avi](docs/image/demo_apps.gif?raw=true)

## Version Release
This Is Latest Release

    ~ Beta Release
    $version_release = 0.0.1-beta01

What's New??

    * Collection of nice loading animations for Android *
    * Beta Release *

## Download this project

### Step 1. Add the JitPack repository to your build file (build.gradle : Project)

#### <Option 1> Groovy Gradle

    // Add it in your root build.gradle at the end of repositories:

    allprojects {
        repositories {
            ...
            maven { url 'https://jitpack.io' }
        }
    }

#### <Option 2> Kotlin DSL Gradle

```kotlin
// Add it in your root build.gradle.kts at the end of repositories:

allprojects {
    repositories {
        ...
        maven { url = uri("https://jitpack.io") }
    }
}
```

### Step 2. Add the dependency (build.gradle : Module)

#### <Option 1> Groovy Gradle

    dependencies {
        // library frogo-loading-indicator-view
        implementation 'com.github.frogobox:frogo-loading-indicator-view:0.0.1-beta01'
    }

#### <Option 2> Kotlin DSL Gradle

```kotlin
dependencies {
    // library frogo-loading-indicator-view
    implementation("com.github.frogobox:frogo-loading-indicator-view:0.0.1-beta01")
}
```

### Step 3. Add the FrogoLoadingIndicatorView to your layout:

Simple 

```xml
<com.frogobox.loadingindicator.FrogoLoadingIndicatorView
    android:id="@+id/indicator"
    style="@style/FrogoLoadingIndicatorView"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    app:indicatorName="BallPulseIndicator" // Indicator Name
    app:indicatorColor="#FFFFFF"/>
```

### Step 4. It's very simple use just like .
```kotlin
fun hideClick(view: View?) {
    binding.fli.hide()
    // or fli.smoothToHide();
}

fun showClick(view: View?) {
    binding.fli.show()
    // or fli.smoothToShow();
}
```

## Indicators

As seen above in the **Demo**, the indicators are as follows:

**Row 1**
 * `BallPulseIndicator`
 * `BallGridPulseIndicator`
 * `BallClipRotateIndicator`
 * `BallClipRotatePulseIndicator`

**Row 2**
 * `SquareSpinIndicator`
 * `BallClipRotateMultipleIndicator`
 * `BallPulseRiseIndicator`
 * `BallRotateIndicator`

**Row 3**
 * `CubeTransitionIndicator`
 * `BallZigZagIndicator`
 * `BallZigZagDeflectIndicator`
 * `BallTrianglePathIndicator`

**Row 4**
 * `BallScaleIndicator`
 * `LineScaleIndicator`
 * `LineScalePartyIndicator`
 * `BallScaleMultipleIndicator`

**Row 5**
 * `BallPulseSyncIndicator`
 * `BallBeatIndicator`
 * `LineScalePulseOutIndicator`
 * `LineScalePulseOutRapidIndicator`

**Row 6**
 * `BallScaleRippleIndicator`
 * `BallScaleRippleMultipleIndicator`
 * `BallSpinFadeLoaderIndicator`
 * `LineSpinFadeLoaderIndicator`

**Row 7**
 * `TriangleSkewSpinIndicator`
 * `PacmanIndicator`
 * `BallGridBeatIndicator`
 * `SemiCircleSpinIndicator`
 
**Row 8**
 * `com.frogobox.apploadingindicator.MyCustomIndicator`

## Colaborator
Very open to anyone, I'll write your name under this, please contribute by sending an email to me

- Mail To faisalamircs@gmail.com
- Subject : Github _ [Github-Username-Account] _ [Language] _ [Repository-Name]
- Example : Github_amirisback_kotlin_admob-helper-implementation

Name Of Contribute
- [HarlonWang](https://github.com/HarlonWang)
- Jack Wang
- Muhammad Faisal Amir

Waiting for your contribute

### Thanks
- [AVLoadingIndicatorView](https://github.com/HarlonWang/AVLoadingIndicatorView)
- [NVActivityIndicatorView](https://github.com/ninjaprox/NVActivityIndicatorView)
- [Connor Atherton](https://github.com/ConnorAtherton)

## Attention !!!
- Please enjoy and don't forget fork and give a star
- Don't Forget Follow My Github Account

![](docs/image/mad_score.png?raw=true)
