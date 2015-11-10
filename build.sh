#!/bin/sh
export MAVEN_OPTS="-Xms512m -Xmx756m -XX:MaxPermSize=256m"

OPTIONS="-Dtycho.localArtifacts=ignore $@"

mvn17 clean verify -f releng/core/pom.xml $OPTIONS || exit 101
mvn17 clean verify -f releng/runtime/pom.xml -P runtime3x $OPTIONS || exit 102
mvn17 clean verify -f releng/runtime/pom.xml -P runtime4x $OPTIONS || exit 103
mvn17 clean verify -f releng/ide/pom.xml $OPTIONS || exit 104
mvn17 clean verify -f releng/rcptt/pom.xml $OPTIONS || exit 105
