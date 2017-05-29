# Upload to JitPack

### Specs
[![](https://jitpack.io/v/nisrulz/UploadToJitpack.svg)](https://jitpack.io/#nisrulz/UploadToJitpack)

### Featured in
[![AndroidDev Digest](https://img.shields.io/badge/AndroidDev%20Digest-%23101-blue.svg)](https://www.androiddevdigest.com/digest-101/)

### Show some :heart:
[![GitHub stars](https://img.shields.io/github/stars/nisrulz/UploadToJitpack.svg?style=social&label=Star)](https://github.com/nisrulz/UploadToJitpack) [![GitHub forks](https://img.shields.io/github/forks/nisrulz/UploadToJitpack.svg?style=social&label=Fork)](https://github.com/nisrulz/UploadToJitpack/fork) [![GitHub watchers](https://img.shields.io/github/watchers/nisrulz/UploadToJitpack.svg?style=social&label=Watch)](https://github.com/nisrulz/UploadToJitpack) [![GitHub followers](https://img.shields.io/github/followers/nisrulz.svg?style=social&label=Follow)](https://github.com/nisrulz/UploadToJitpack)  
[![Twitter Follow](https://img.shields.io/twitter/follow/nisrulz.svg?style=social)](https://twitter.com/nisrulz) 

Base repository to demonstrate the process of uploading an [`aar`](https://sites.google.com/a/android.com/tools/tech-docs/new-build-system/aar-format)/[`jar`](https://en.wikipedia.org/wiki/JAR_(file_format)) to [JitPack](https://jitpack.io/).

**Blog Post :** [Guide to publishing your Android Library via JitPack](http://crushingcode.co/publish-your-android-library-via-jitpack/) 

The process is as follows

1. Create an Android project or open an existing one in [Android Studio](https://en.wikipedia.org/wiki/Android_Studio)

1. Init the project with git and also create a repo on Github for the same. Each step here onwards represent a commit and should be pushed to github.

1. Create and add a new module and choose `Android Library`.
   > Goto `File>New>New Module..` and select `Android Library`.

1. Implement your library code inside the library module you created in the last step.

1. Next add the library module as a dependency to the app module.
   > 1. Goto `File>Project Structure..`
   > 1. Select `app` module in the sidebar
   > 1. Select the `Dependencies` tab
   > 1. At the bottom is a `+` icon, click that and select `Module dependency` and select your `library` module.
   > 1. Press `apply` or `ok`.

1. Once project is synced, add the android-maven-gradle-plugin to classpath in build.gradle file at root project level.
  ```gradle
   dependencies {
      classpath 'com.android.tools.build:gradle:2.1.2'
      ..
      ..
      // Setup the android-maven-gradle-plugin in the classpath
      classpath 'com.github.dcendents:android-maven-gradle-plugin:1.3'
      ..
  ```

1. Next, apply the android-maven-gradle-plugin to the build.gradle file at library module level. Also add the group variable.
  ```gradle
   apply plugin: 'com.android.library'

   // Required plugin in library module
   apply plugin: 'com.github.dcendents.android-maven'

   // Replace nisrulz with <your_github_username>
   group='com.github.nisrulz'
  ```  

1. Create a release TAG in git
  ```
  git tag -a 1.0 -m "v1.0"
  git push origin 1.0
  ```

1. Once everything is pushed and the release TAG is also pushed, goto `https://www.jitpack.io/#username/reponame` where replace `username` with your github username and `reponame` with the reponame of the android project.

1. Select the release you would like to share by clicking the ‘Get It’ button next to the list of releases of your repository.

  ![screenshot1](https://github.com/nisrulz/UploadToJitpack/raw/master/img/sc1.jpeg)

1. Next the same page at Jitpack would show you how to use the library in your other android projects. Something like below

  ![screenshot2](https://github.com/nisrulz/UploadToJitpack/raw/master/img/sc2.jpeg)


  Selectable code

  ```gradle
  repositories {
      jcenter()
      maven { url “https://jitpack.io” }
  }
  dependencies {
      compile 'com.github.nisrulz:awesomelib:1.0'
  }
  ```

1. Let the world know of your **AwesomeLib** :smile:
  > + Add a readme that explains how to integrate and use your Awesome library
  > + Add a license block as in this repo
  > + Also include the JitPack badge provided by jitpack in your readme
  > + Promote your lib on social media so that others can know about it.
  > + Always add a working sample app in your project that demonstrates your library in use.
  > + Add screenshots if possible in your readme.


> If you found this example helpful or you learned something today and want to thank me, consider [buying me a cup of](https://www.paypal.me/nisrulz/5) :coffee:


License
=======

    Copyright 2016 Nishant Srivastava

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
