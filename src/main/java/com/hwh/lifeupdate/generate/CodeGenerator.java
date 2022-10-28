package com.hwh.lifeupdate.generate;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.core.toolkit.StringPool;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.po.TableFill;
import com.baomidou.mybatisplus.generator.config.po.TableInfo;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author starrysky
 * @title: MybatisPlusAutomaticGenerator
 * @projectName mybaits_plus_final
 * @description: mybatis-pluas代码自动生成器
 * @date 2021/2/109:59
 */
public class CodeGenerator {

    public static void main(String[] args) {
        /**
         * 代码生成器对象
         */
        AutoGenerator autoGenerator = new AutoGenerator();
        /**
         * 全局配置对象
         */
        GlobalConfig globalConfig = new GlobalConfig();
        String property = System.getProperty("user.dir");// 获取当前项目的系统目录
        globalConfig.setOutputDir(property+"/src/main/java");
        globalConfig.setAuthor("hwh");
        globalConfig.setOpen(false);//生成之后是否打开所在的系统目录
        globalConfig.setFileOverride(false);//是否覆盖
        globalConfig.setServiceName("%sService");//去掉Service的I前缀
        globalConfig.setIdType(IdType.AUTO);
        globalConfig.setDateType(DateType.ONLY_DATE);//日期类型，仅仅是时间
        globalConfig.setSwagger2(true);//配置swagger文档
        autoGenerator.setGlobalConfig(globalConfig);
        /**
         * 设置数据源
         */
        DataSourceConfig dataSourceConfig = new DataSourceConfig();
        dataSourceConfig.setUrl("jdbc:sqlite:D:\\hwh\\project\\LifeUpdate\\src\\main\\resources\\database\\LifeUpDB.db");
        dataSourceConfig.setDriverName("org.sqlite.JDBC");
        dataSourceConfig.setDbType(DbType.SQLITE);
        autoGenerator.setDataSource(dataSourceConfig);


        /**
         * 包的配置
         */
        PackageConfig packageConfig = new PackageConfig();
        packageConfig.setParent("com.hwh");
        packageConfig.setModuleName("lifeupdate");
        packageConfig.setEntity("entity");
        packageConfig.setMapper("mapper");
        autoGenerator.setPackageInfo(packageConfig);


        // 自定义配置
        InjectionConfig cfg = new InjectionConfig() {
            @Override
            public void initMap() {
                // to do nothing
            }
        };
        /**
         * 设置xml位置
         */
        // 如果模板引擎是 freemarker
        String templatePath = "/templates/mapper.xml.ftl";
        // 自定义输出配置
        List<FileOutConfig> focList = new ArrayList<>();
        // 自定义配置会被优先输出
        focList.add(new FileOutConfig(templatePath) {
            @Override
            public String outputFile(TableInfo tableInfo) {
                // 自定义输出文件名 ， 如果你 Entity 设置了前后缀、此处注意 xml 的名称会跟着发生变化！！
                return property + "/src/main/resources/mapper"
                        + "/" + tableInfo.getEntityName() + "Mapper" + StringPool.DOT_XML;
            }
        });
        cfg.setFileOutConfigList(focList);
        autoGenerator.setCfg(cfg);

        // 配置自定义模板
        TemplateConfig templateConfig = new TemplateConfig();
        templateConfig.setXml(null);
        autoGenerator.setTemplate(templateConfig);

        /**
         * 配置策略
         */
        StrategyConfig strategyConfig = new StrategyConfig();
        // 表名称
        strategyConfig.setInclude("taskmodel");
        strategyConfig.setNaming(NamingStrategy.underline_to_camel);//包的名字，下划线转驼峰
        strategyConfig.setColumnNaming(NamingStrategy.underline_to_camel);//列的名字，下划线转驼峰
        strategyConfig.setEntityLombokModel(true);//自动lombok
        strategyConfig.setLogicDeleteFieldName("deleted");
        TableFill craete_time = new TableFill("create_time", FieldFill.INSERT);//自动填充配置插入
        TableFill update_time = new TableFill("update_time", FieldFill.INSERT_UPDATE);//自动填充配置更新
        List<TableFill> tableFils = new CopyOnWriteArrayList<>();
        tableFils.add(craete_time);
        tableFils.add(update_time);
        strategyConfig.setTableFillList(tableFils);
        strategyConfig.setVersionFieldName("version");//乐观锁
        strategyConfig.setRestControllerStyle(true);//开启Restf的风格，驼峰命名
        strategyConfig.setControllerMappingHyphenStyle(true);//localhost:8080/hello_id_2
        autoGenerator.setStrategy(strategyConfig);
        /**
         * 设置模版引擎
         */
        autoGenerator.setTemplateEngine(new FreemarkerTemplateEngine());
        /**
         * 执行
         */
        autoGenerator.execute();

    }

}

