#!/usr/bin/env bash

FILE="$1"
# Removes src/main/java at the start, .java at the end, and replaces / with .
CLASS="$(sed 's#src/main/java\/##; s/.java$//; s/\//./g' <<< "$FILE")"
CLASSPATH_FILE=".runjava-classpath"
TARGET="target/classes"
CLASS_FILE="$TARGET/$(sed 's#src/main/java/##; s/.java$/.class/' <<< "$FILE")"

# Drop the first parameter
shift

# Split the rest of the parameters:
# If there's no --, everything is in APP_PARAMS
# Otherwise, everything before -- is in JVM_PARAMS and the rest is in APP_PARAMS
JVM_PARAMS=""
APP_PARAMS=""
for p in "$@"; do
  if [[ "$p" = "--" ]]; then
    JVM_PARAMS="$APP_PARAMS"
    APP_PARAMS=""
  else
    APP_PARAMS="$APP_PARAMS $p"
  fi
done

# Build classpath
if [[ ! -e "$CLASSPATH_FILE" ]]; then
  mvn -q org.codehaus.mojo:exec-maven-plugin:exec \
            -Dexec.classpathScope="test" \
            -Dexec.executable="echo" \
            -Dexec.args="%classpath" > $CLASSPATH_FILE
fi
CLASSPATH="$(cat $CLASSPATH_FILE)"

# Compile if dirty
SRC_STAT=$(stat -c %Y $FILE)
TARGET_STAT=$(stat -c %Y $CLASS_FILE)
if [[ $SRC_STAT > $TARGET_STAT ]]; then
  echo "Dirty! compiling..."
  javac -classpath $CLASSPATH -d $TARGET $FILE
fi

# Run the program!
java -classpath $CLASSPATH $JVM_PARAMS $CLASS $APP_PARAMS
