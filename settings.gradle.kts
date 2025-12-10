rootProject.name = "PluginTemplate"

dependencyResolutionManagement {
    versionCatalogs {
        create("libs") {
            // compileOnly dependencies
            library("paper-api", "io.papermc.paper:paper-api:1.21.11-R0.1-SNAPSHOT")
            library("daisylib", "uk.firedev:DaisyLib:2.9.0-SNAPSHOT")

            // implementation dependencies

            // paperLibrary dependencies

            // Gradle plugins
            plugin("shadow", "com.gradleup.shadow").version("9.3.0")
            plugin("plugin-yml", "de.eldoria.plugin-yml.paper").version("0.8.0")
        }
    }
}
