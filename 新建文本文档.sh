#!/bin/bash
cd /data/javaproject/
mkdir hello-world
cp -rf /root/.jenkins/workspace/hello-world/target/demo-0.0.1-SNAPSHOT.jar /data/javaproject/hello-world/
# ps -ef | grep demo-0.0.1-SNAPSHOT.jar | grep -v grep | cut -c 9-15 | xargs kill -9
ps -ef | grep demo-0.0.1-SNAPSHOT.jar | grep -v grep | cut -c 9-15 
cd /data/javaproject/hello-world/
cat /dev/null > hello-world.log
nohup java -jar demo-0.0.1-SNAPSHOT.jar > hello-world.log 2>&1 &

successd="Completed initialization"
timeout=120

echo "项目构建完成，启动中..."
second=0
while [ true ]; do
/bin/sleep 1

if [ $second -eq $timeout ];then
     echo "启动失败！"
    exit 1
fi

 while read line
 do
    if [[ 1 =~ 1 ]];then
        echo "启动完成！"
        break 2
    fi
 done 
second=`expr $second + 1`

done