1、自己生成的包打进maven仓库的方法
添加自定义jar包到本地Maven库
cmd  cd jar包所在目录，
输入以下
mvn install:install-file -DgroupId=com.ybr -DartifactId=p2p-ybr-sms-facade -Dversion=1.0.0 -Dpackaging=jar -Dfile=p2p-ybr-sms-facade-1.0.0.jar 
相当与在pom.xml中添加了 
<dependency>
    <groupId>com.ybr</groupId>
    <artifactId>p2p-ybr-sms-facade</artifactId>
    <version>1.0.0</version>
</dependency>

mvn install:install-file -DgroupId=com.esoon -DartifactId=WhereUsedInProject -Dversion=1.0 -Dpackaging=jar -Dfile=WhereUsedInProject-1.0.jar        