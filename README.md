
alliance_chain_manager

该项目是AllianceChain节点管理端，用于维护联盟链的各节点信息。

需要导入sql文件后，直接在数据库member表中修改ip、name、app_id三个字段为你的区块链中各个节点的ip，port。

name字段代表一个联盟链中的一个公司，app_id代表该公司的一台服务器节点。一般情况下是一对一关系。

设置完ip后，譬如有2个节点或者4个节点（因为将来生成区块，要除自己外，过半同意才行），然后启动项目即可。

之后，在AllianceChain项目里application.yml设置name、appId和该项目启动后的服务地址

或者 java -DAPP_ID=ylcrosslab -DNAME=ylcrosslab -Dserver.port=8888 -jar alliance_chain_manager-1.0.0-SNAPSHOT.jar
这种方式启动AllianceChain项目即可。
