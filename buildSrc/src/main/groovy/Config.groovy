class Config {

    static applicationId = 'com.blankj.androidutilcode'
    static appName = 'Util'

    static compileSdkVersion = 29
    static minSdkVersion = 14
    static targetSdkVersion = 29
    static versionCode = 1_030_007
    static versionName = '1.31.0'// E.g. 1.9.72 => 1,009,072

    // lib version
    static gradlePluginVersion = '4.1.0'
    static kotlinVersion = '1.3.72'
    static androidxVersion = '1.0.0'

    static modules = [
            /*Don't delete this line*/
            /*Generated by "module_config.json"*/
            plugin_api_gradle_plugin   : new ModuleConfig(isApply: true , useLocal: true , localPath: "./plugin/api-gradle-plugin"),
            plugin_bus_gradle_plugin   : new ModuleConfig(isApply: true , useLocal: true , localPath: "./plugin/bus-gradle-plugin"),
            plugin_lib_base_transform  : new ModuleConfig(isApply: true , useLocal: true , localPath: "./plugin/lib/base-transform", remotePath: "com.blankj:base-transform:1.0"),
            plugin_buildSrc_plugin     : new ModuleConfig(isApply: true , useLocal: true , localPath: "./plugin/buildSrc-plugin"),
            feature_mock               : new ModuleConfig(isApply: false, useLocal: true , localPath: "./feature/mock"),
            feature_launcher_app       : new ModuleConfig(isApply: true , useLocal: true , localPath: "./feature/launcher/app"),
            feature_main_app           : new ModuleConfig(isApply: false, useLocal: true , localPath: "./feature/main/app"),
            feature_main_pkg           : new ModuleConfig(isApply: true , useLocal: true , localPath: "./feature/main/pkg"),
            feature_subutil_app        : new ModuleConfig(isApply: false, useLocal: true , localPath: "./feature/subutil/app"),
            feature_subutil_pkg        : new ModuleConfig(isApply: true , useLocal: true , localPath: "./feature/subutil/pkg"),
            feature_subutil_export     : new ModuleConfig(isApply: true , useLocal: true , localPath: "./feature/subutil/export"),
            feature_utilcode_app       : new ModuleConfig(isApply: false, useLocal: true , localPath: "./feature/utilcode/app"),
            feature_utilcode_pkg       : new ModuleConfig(isApply: true , useLocal: true , localPath: "./feature/utilcode/pkg"),
            feature_utilcode_export    : new ModuleConfig(isApply: true , useLocal: true , localPath: "./feature/utilcode/export", remotePath: "com.blankj:utilcode-export:1.1"),
            lib_base                   : new ModuleConfig(isApply: true , useLocal: true , localPath: "./lib/base"),
            lib_common                 : new ModuleConfig(isApply: true , useLocal: true , localPath: "./lib/common"),
            lib_subutil                : new ModuleConfig(isApply: true , useLocal: true , localPath: "./lib/subutil"),
            lib_utilcode               : new ModuleConfig(isApply: true , useLocal: false, localPath: "./lib/utilcode", remotePath: "com.blankj:utilcodex:$Config.versionName"),
            lib_utildebug              : new ModuleConfig(isApply: true , useLocal: true , localPath: "./lib/utildebug"),
            lib_utildebug_no_op        : new ModuleConfig(isApply: true , useLocal: true , localPath: "./lib/utildebug-no-op"),
            /*Don't delete this line*/
    ]

    static plugins = [
            plugin_gradle  : new PluginConfig(path: "com.android.tools.build:gradle:$gradlePluginVersion"),
            plugin_kotlin  : new PluginConfig(path: "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion"),
            // 上传到 maven
            plugin_maven   : new PluginConfig(path: "com.github.dcendents:android-maven-gradle-plugin:2.1", id: "com.github.dcendents.android-maven"),

            // 上传新版本插件更新 path 中的版本号，并设置 isApply = false
            // 通过 mavenLocal 上传本地版本，设置 isApply = true 即可应用插件来调试，最后通过 bintrayUpload 来发布插件
            plugin_api     : new PluginConfig(isApply: true, useLocal: false, path: "com.blankj:api-gradle-plugin:1.5", id: "com.blankj.api"),
            //./gradlew clean :plugin_api-gradle-plugin:mavenLocal     // 上传到本地 mavenLocal
            //./gradlew clean :plugin_api-gradle-plugin:bintrayUpload  // 上传到 jcenter
            plugin_bus     : new PluginConfig(isApply: true, useLocal: false, path: "com.blankj:bus-gradle-plugin:2.6", id: "com.blankj.bus"),
            //./gradlew clean :plugin_bus-gradle-plugin:mavenLocal     // 上传到本地 mavenLocal
            //./gradlew clean :plugin_bus-gradle-plugin:bintrayUpload  // 上传到 jcenter
            plugin_buildSrc: new PluginConfig(isApply: false, useLocal: false, path: "com.blankj:buildSrc-plugin:1.0", id: "com.blankj.buildSrc"),
            //./gradlew clean :plugin_bus-gradle-plugin:mavenLocal     // 上传到本地 mavenLocal
            //./gradlew clean :plugin_bus-gradle-plugin:bintrayUpload  // 上传到 jcenter
    ]

    static libs = [
            androidx_appcompat : new LibConfig(path: "androidx.appcompat:appcompat:$androidxVersion"),
            androidx_material  : new LibConfig(path: "com.google.android.material:material:$androidxVersion"),
            androidx_multidex  : new LibConfig(path: "androidx.multidex:multidex:2.0.0"),
            androidx_constraint: new LibConfig(path: "androidx.constraintlayout:constraintlayout:1.1.3"),

            kotlin             : new LibConfig(path: "org.jetbrains.kotlin:kotlin-stdlib-jdk7:$kotlinVersion"),

            leakcanary         : new LibConfig(path: "com.squareup.leakcanary:leakcanary-android:2.1"),

            free_proguard      : new LibConfig(path: "com.blankj:free-proguard:1.0.2"),
            swipe_panel        : new LibConfig(path: "com.blankj:swipe-panel:1.2"),

            gson               : new LibConfig(path: "com.google.code.gson:gson:2.8.5"),
            glide              : new LibConfig(path: "com.github.bumptech.glide:glide:4.7.1"),
            retrofit           : new LibConfig(path: "com.squareup.retrofit2:retrofit:2.4.0"),
            commons_io         : new LibConfig(path: "commons-io:commons-io:2.6"),

            eventbus_lib       : new LibConfig(path: "org.greenrobot:eventbus:3.1.1"),
            eventbus_processor : new LibConfig(path: "org.greenrobot:eventbus-annotation-processor:3.0.1"),

            photo_view         : new LibConfig(path: "com.github.chrisbanes:PhotoView:2.0.0"),

            test_junit         : new LibConfig(path: "junit:junit:4.12"),
            test_robolectric   : new LibConfig(path: "org.robolectric:robolectric:4.3.1"),
    ]
}
//./gradlew clean :lib_utilcode:bintrayUpload