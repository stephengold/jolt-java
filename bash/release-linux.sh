#!/bin/bash

set -e

export JAVA_HOME=/usr/lib/jvm/jdk-19.0.2+7

N=/home/sgold/NetBeansProjects/jolt-java
V=0.1.0

R=/home/sgold/.m2/repository/com/github/stephengold/jolt-java/$V
D=/home/sgold/Releases/jolt-java/$V
mkdir -p $D

cd $N
./gradlew clean publishToMavenLocal
cp $R/*.{jar,module,pom} $D

cd $D
for f in *.jar *.module *.pom;
do
  if [ ! -f $f.asc ]; then
    /usr/bin/gpg2 -ab $f ;
  fi
done;


R=/home/sgold/.m2/repository/com/github/stephengold/jolt-java-headers/$V
D=/home/sgold/Releases/jolt-java-headers/$V
mkdir -p $D

cd $N
./gradlew :jolt-java-natives-linux-x86:publishToMavenLocal
cp $R/*.{jar,module,pom} $D

cd $D
for f in *.jar *.module *.pom;
do
  if [ ! -f $f.asc ]; then
    /usr/bin/gpg2 -ab $f ;
  fi
done;

R=/home/sgold/.m2/repository/com/github/stephengold/jolt-java-natives-linux-x86/$V
D=/home/sgold/Releases/jolt-java-natives-linux-x86/$V
mkdir -p $D

cd $N
./gradlew :jolt-java-natives-linux-x86:publishToMavenLocal
cp $R/*.{jar,module,pom} $D

cd $D
for f in *.jar *.module *.pom;
do
  if [ ! -f $f.asc ]; then
    /usr/bin/gpg2 -ab $f ;
  fi
done;