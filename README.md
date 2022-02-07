# simplemodule
java 9 simplemodule

## compile
javac -d outDir --module-source-path src/main/java/simple-modules $(find src/main/java/simple-modules -name "*.java")

## run
java --module-path outDir -m main.app/com.silverspoon8.modules.main.MainApp
