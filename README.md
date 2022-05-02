<h1 align="center">Gallery App</h1></br>
<p align="center">  
GalleryApp is application show image from Unsplash API, based on MVVM architecture. 
</p>

<p align="center">

</p>

## Download
Go to the [Releases](https://github.com/LNMCode/GalleryApp/releases) to download the latest APK.

## UI Application

[UI Application](https://www.figma.com/file/abtgGeg11LmHEAgyWqTfTg/Art-gallery-app-UI-(Community)?node-id=0%3A1) - UI of application based on ui shared in Figma. 

## Screenshots
<p align="center">
<img src="/preview/preview0.gif" width="32%"/>
<img src="/preview/preview1.gif" width="32%"/>
<img src="/preview/preview2.gif" width="32%"/>
</p>

## Tech stack & Open-source libraries
- Minimum SDK level 21
- 100% [Kotlin](https://kotlinlang.org/) based + [Coroutines](https://github.com/Kotlin/kotlinx.coroutines) + [Flow](https://kotlin.github.io/kotlinx.coroutines/kotlinx-coroutines-core/kotlinx.coroutines.flow/) for asynchronous.
- JetPack
  - [Lifecycle](https://developer.android.com/topic/libraries/architecture/lifecycle) - perform action when lifecycle state changes.
  - [ViewModel](https://developer.android.com/topic/libraries/architecture/viewmodel) - store and manage UI-related data in a lifecycle conscious way.
  - [Room](https://developer.android.com/topic/libraries/architecture/room) - a persistence library provides an abstraction layer over SQLite.
- Architecture
  - MVVM Architecture (View - DataBinding - ViewModel - Model)
  - Repository pattern
  - [Koin](https://github.com/InsertKoinIO/koin) - dependency injection
- Material Design & Animations
- [Retrofit2 & Gson](https://github.com/square/retrofit) - constructing the REST API
- [OkHttp3](https://github.com/square/okhttp) - implementing interceptor, logging and mocking web server
- [Glide](https://github.com/bumptech/glide) - loading images
- [Timber](https://github.com/JakeWharton/timber) - logging
- Shared element container transform/transition between fragments
