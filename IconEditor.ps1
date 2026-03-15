#
# IconEditor
#
$Dir = $PSScriptRoot
$Dir = "C:\git\iconeditor"
$Lib = $Dir + "\lib\*.jar"
$jars = Get-ChildItem -Path $Lib
foreach ($jar in $jars)
{
 $Env:CLASSPATH=$Env:CLASSPATH + ";" + $jar
}
#
$Lib = $Dir + "\dll\"
$Env:PATH = $Env:PATH + ";" + $Lib
#
java -Xmx1024M -Xms128M test.Main
java pack.Pause
