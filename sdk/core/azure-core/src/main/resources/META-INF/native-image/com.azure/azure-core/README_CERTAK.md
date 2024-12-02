## Tweaks
This build tweaks `sdk/core/azure-core/src/main/resources/META-INF/native-image/com.azure/azure-core/native-image.properties`.

E.g., changes native-image.properties from `--initialize-at-build-time` to `--initialize-at-run-time` to overcome native-image problems in client projects.

## How To Build
From project root do this to install a build tool that isn't available in a public repo (only required once):

	mvn clean install -f eng/code-quality-reports/pom.xml

Then build:

	mvn clean install -DskipTests -Dchecktstyle.skip=true -f sdk/core/azure-core

Then find in from your repo (e.g., @ `C:\Users\<user>\.m2\repository\com\azure\azure-core\1.55.0-beta.1-certak`) and copy/use the JAR/POM.
