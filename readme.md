# 微服务
## 服务结构

    ├─micro-admin           # 端口:     说明:图形化管理模块
    │  ├─micro-cache-cloud  # 端口:8700 说明:缓存管理、统一监控
    │  ├─micro-monitor      # 端口:8701 说明:服务状态监控、turbine 
    │  └─micro-zipkin-elk   # 端口:8702 说明:zipkin、ELK监控
    ├─micro-apps            # 端口:     说明:微服务App(具体业务)
    │  ├─micro-upms         # 端口:8801 说明:权限服务(帐号，菜单，组织等)
    │  ├─micro-customer     # 端口:8802 说明:客户服务
    │  ├─micro-message      # 端口:8803 说明:消息服务(邮件，短信发送)
    │  ├─micro-product      # 端口:8804 说明:产品服务
    │  ├─micro-purchase     # 端口:8805 说明:采购服务
    │  ├─micro-sale         # 端口:8806 说明:销售服务
    │  ├─micro-search       # 端口:8807 说明:搜索服务
    │  ├─micro-stock        # 端口:8808 说明:仓库服务
    │  └─micro-supplier     # 端口:8809 说明:供应商服务
    ├─micro-auth            # 端口:8810 说明:鉴权服务
    ├─micro-common          # 端口:     说明:通用模块
    ├─micro-config          # 端口:8811 说明:配置服务
    ├─micro-discovery       # 端口:8812 说明:服务注册发现
    └─micro-gate            # 端口:8813 说明:网关服务

##　数据库表设计
* 设计工具:PowerDesigner[地址](https://github.com/hexiaoyun128/powerdesigner-micro)
## UI界面
* [UI界面地址](https://github.com/hexiaoyun128/micro-ui)
* 介绍
    
    基于[vue-element-admin](https://github.com/PanJiaChen/vue-element-admin)
    
## 配置文件
分别在不同的git仓库中，管理上开发测试运维分别控制不同的配置

* [开发环境配置地址](https://github.com/hexiaoyun128/micro-dev-config)
* [测试环境配置地址](https://github.com/hexiaoyun128/micro-test-config)
* [生产环境配置地址](https://github.com/hexiaoyun128/micro-prod-config)


