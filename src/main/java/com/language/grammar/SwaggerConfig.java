package com.language.grammar;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.*;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spi.service.contexts.SecurityContext;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;
import java.util.List;

@EnableSwagger2
@Configuration
public class SwaggerConfig {
//    @Value("${config.oauth2.accessTokenUri}")
    private String accessTokenUri;
    @Bean
    public Docket postApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.ant("/api/**"))
                .build();
//                .securityContexts(Collections.singletonList(securityContext()))
//                .securitySchemes(Arrays.asList(securitySchema(), apiKey(), apiCookieKey()));
    }
    @Bean
    public SecurityScheme apiKey() {
        return new ApiKey(HttpHeaders.AUTHORIZATION, "apiKey", "header");
    }
    @Bean
    public SecurityScheme apiCookieKey() {
        return new ApiKey(HttpHeaders.COOKIE, "apiKey", "cookie");
    }

//    private OAuth securitySchema() {
//
//        List<AuthorizationScope> authorizationScopeList = newArrayList();
//        authorizationScopeList.add(new AuthorizationScope("read", "read all"));
//        authorizationScopeList.add(new AuthorizationScope("write", "access all"));
//
//        List<GrantType> grantTypes = newArrayList();
//        GrantType passwordCredentialsGrant = new ResourceOwnerPasswordCredentialsGrant(accessTokenUri);
//        grantTypes.add(passwordCredentialsGrant);
//
//        return new OAuth("oauth2", authorizationScopeList, grantTypes);
//    }

    public ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("generator rest apis")
                .description("decscription")
                .version("1.1")
                .build();

    }
    private SecurityContext securityContext() {
        return SecurityContext.builder().securityReferences(defaultAuth())
                .build();
    }

    private List<SecurityReference> defaultAuth() {

        final AuthorizationScope[] authorizationScopes = new AuthorizationScope[3];
        authorizationScopes[0] = new AuthorizationScope("read", "read all");
        authorizationScopes[1] = new AuthorizationScope("trust", "trust all");
        authorizationScopes[2] = new AuthorizationScope("write", "write all");

        return Collections.singletonList(new SecurityReference("oauth2", authorizationScopes));
    }


}

