#!/usr/bin/env bash
javac -d outDir --module-source-path src/main/java/simple-modules $(find src/main/java/simple-modules -name "*.java")