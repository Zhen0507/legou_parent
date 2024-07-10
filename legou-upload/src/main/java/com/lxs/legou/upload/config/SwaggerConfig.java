package com.lxs.legou.upload.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Swagger 配置文件
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket createRestApi() {
        // 创建一个 Docket 实例，指定使用 Swagger 2 版本
        return new Docket(DocumentationType.SWAGGER_2)
                // 设置 API 元数据信息
                .apiInfo(apiInfo())
                // 选择哪些 API 进行文档生成
                .select()
                // 选择 com.lxs.legou.upload 包下的所有 API
                .apis(RequestHandlerSelectors.basePackage("com.lxs.legou.upload"))
                // 选择所有路径
                .paths(PathSelectors.any())
                // 构建 Docket 实例
                .build();
    }


    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("文件上传文档")
                .description("使用FastDfs文件上传")
                .version("version 1.0")
                .build();
    }
}
