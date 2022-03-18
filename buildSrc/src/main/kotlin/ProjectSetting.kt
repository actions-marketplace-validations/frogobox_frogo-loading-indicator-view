/*
 * Created by faisalamir on 19/09/21
 * FrogoRecyclerView
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * -----------------------------------------
 * Copyright (C) 2021 FrogoBox Inc.
 * All rights reserved
 *
 */

object ProjectSetting {

    // Project Name
    const val NAME_APP = "Frogo Loading Indicator View"
    const val REPOSITORY_NAME = "frogo-loading-indicator-view"

    const val APP_DOMAIN = "com"
    const val APP_PLAY_CONSOLE = "frogobox"
    const val APP_NAME = "apploadingindicator"

    const val LIBRARY_NAME_SDK = "loadingindicator"
    const val MODULE_NAME_SDK = "frogoloadingindicator"

    // ---------------------------------------------------------------------------------------------

    const val VERSION_MAJOR = 0
    const val VERSION_MINOR = 0
    const val VERSION_PATCH = 1

    // ---------------------------------------------------------------------------------------------

    const val PROJECT_MIN_SDK = 21
    const val PROJECT_COMPILE_SDK = 31
    const val PROJECT_TARGET_SDK = PROJECT_COMPILE_SDK

    // ---------------------------------------------------------------------------------------------

    const val BASE_PACAKGE_NAME = "$APP_DOMAIN.$APP_PLAY_CONSOLE"

    const val PROJECT_APP_ID = "$BASE_PACAKGE_NAME.$APP_NAME"
    const val PROJECT_LIB_ID_SDK = "$BASE_PACAKGE_NAME.$LIBRARY_NAME_SDK"

    const val PROJECT_VERSION_CODE = (VERSION_MAJOR * 100) + (VERSION_MINOR * 10) + (VERSION_PATCH * 1)
    const val PROJECT_VERSION_NAME = "$VERSION_MAJOR.$VERSION_MINOR.$VERSION_PATCH"

    val NAME_APK = NAME_APP.toLowerCase().replace(" ", "-")

    val NAME_DB = NAME_APP.toLowerCase().replace(" ", "_")
    val DB = "\"$NAME_DB.db\""

    // ---------------------------------------------------------------------------------------------

}