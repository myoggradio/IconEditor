ICONEDITOR=/home/christian/git/iconeditor/
CLASSPATH=${CLASSPATH}:${ICONEDITOR}/lib/iconeditor.jar
CLASSPATH=${CLASSPATH}:${ICONEDITOR}/lib/commons-math3-3.6.1.jar
cd ${ICONEDITOR}
echo $CLASSPATH
java -cp $CLASSPATH -Xmx4096M -Xms128M test.Main
exit

