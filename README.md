#### 获取git上的资源信息遵循如下规则：
/{application}/{profile}[/{label}]<br/>
/{application}-{profile}.yml<br/>
/{label}/{application}-{profile}.yml<br/>
/{application}-{profile}.properties<br/>
/{label}/{application}-{profile}.properties<br/>


* application: <br/>
  &nbsp;&nbsp;&nbsp;&nbsp;表示应用名称,在client中通过spring.config.name配置<br/>
* profile: <br/>
  &nbsp;&nbsp;&nbsp;&nbsp;表示获取指定环境下配置，例如开发环境、测试环境、生产环境 <br/>
  &nbsp;&nbsp;&nbsp;&nbsp;默认值default，实际开发中可以是dev、test、demo、production等<br/>
* label: <br/>
  &nbsp;&nbsp;&nbsp;&nbsp;git标签，默认值master<br/>

  如果application名称为foo，则可以采用如下方式访问：<br/>
  http://localhost:8888/foo/default<br/>
  http://localhost:8888/foo/development<br/>