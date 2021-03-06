package com.octopus.crud.config;

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
 *
 *
 * @author yuchu
 * @email 
 * @date 2018-04-26 17:12:51
 */
@Configuration
@EnableSwagger2
public class swaggerConfig {

    /**
     * swagger配置
     * @return
     */
    @Bean
    public Docket createRestApi() {

        /**
         * swagger需要扫描的包
         */
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.octopus.crud.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    /**
     * 界面信息
     * @return
     */
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Spring-boot-jdbcTemplate生成代码测试接口")
                .description("更多crud代码生成器请关注：https://github.com/yuchu2016")
                .termsOfServiceUrl("https://github.com/yuchu2016/springboot-jpa-generator")
                .contact("yuchu")
                .version("1.0")
                .build();
    }


}
