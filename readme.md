# 微服务
    ├─micro-admin           # 端口:     说明:图形化管理模块
    │  ├─micro-monitor      # 端口:8701 说明:监控模块
    │  └─micro-zipkin-elk   # 端口:8702 说明:zipkin监控模块
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
