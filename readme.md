## jpa通用能力增强场景启动器

项目集成了平时开发中常用的基础类与相关常用功能的拓展

1.常用基础类如下:
```
.
├── BaseJpaDslRepository.java               jpa+dsl dao
├── BaseJpaRepository.java                  jpa dao
├── BaseJpaSnowflakeIdAndAuditEntity.java   雪花算法id+审计 抽象po
├── BaseJpaSnowflakeIdEntity.java           雪花算法id 抽象po
├── BaseJpaUUIDAndAuditEntity.java          uuid算法+审计 抽象po
├── BaseJpaUUIDEntity.java                  uuid算法 抽象po
├── PageConvertCallBack.java                分页po/dto转换回调
├── PageParamsDTO.java                      分页参数 dto
├── PageResultDTO.java                      分页结果参数 dto
├── PageResultGenerator.java                分页结果生成器
└── SortParamsDTO.java                      排序参数 dto
```

2.增加一个`@Comment`注解,增强PO生成同时生成表注释与字段注释,示例如下:
```java
@Comment("测试表注释")
public class TestPo extends BaseJpaSnowflakeIdAndAuditEntity {

    @Column
    @Comment("测试字段1")
    private String z;

    @Column
    @Comment("测试字段2")
    private String c;
}
```

3.增强了jpa生成表时字段含有顺序的能力,表中的字段按照实体类中字段顺序排序

4.与shiro结合,直接提供审计能力(当系统使用shiro权限框架时)

### 项目中使用

#### 引入starter

```xml
<dependency>
    <groupId>me.sdevil507</groupId>
    <artifactId>jpa-enh-spring-boot-starter</artifactId>
    <version>x.x.x</version>
</dependency>
```