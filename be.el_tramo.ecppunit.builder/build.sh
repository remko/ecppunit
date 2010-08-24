eclipse_path=`which eclipse`
eclipse_dir=`dirname $eclipse_path`
launchers=($eclipse_dir/plugins/org.eclipse.equinox.launcher_*)
launcher=${launchers[0]}

java -jar ${launcher} -application org.eclipse.ant.core.antRunner -buildfile build.xml
