rootProject.name = "PluginTemplate"

dependencyResolutionManagement {
    versionCatalogs {
        create("libs") {
            // compileOnly dependencies
            library("paper-api", "io.papermc.paper:paper-api:26.2.build.+")

            // implementation dependencies

            // paperLibrary dependencies
            library("daisylib", "uk.firedev:DaisyLib:4.0-SNAPSHOT")

            // Gradle plugins
            plugin("shadow", "com.gradleup.shadow").version("9.6.1")
            plugin("plugin-yml", "de.eldoria.plugin-yml.paper").version("0.9.0")
        }
    }
}
