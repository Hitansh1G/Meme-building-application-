//package com.crio.starter.config;
//
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.EnableWebMvc;
//
//@Configuration
//@EnableSwagger2
//@EnableWebMvc
//public class SwaggerConfig {
//
//    @Bean
//    public Docket api() {
//        return new Docket(DocumentationType.SWAGGER_2)
//                .select()
//                .apis(RequestHandlerSelectors.basePackage("com.crio.starter.controller"))
//                .paths(PathSelectors.any())
//                .build()
//                .apiInfo(apiInfo());
//
//    }
//
//    private ApiInfo apiInfo() {
//        return new ApiInfoBuilder()
//                .title("XMeme REST API")
//                .description("API endpoints for managing memes.")
//                .version("1.0.0")
//                .contact(new Contact("Harsh Nayak", "", "harsh.kumar8999@email.com"))
//                .build();
//    }
//
//
//}
