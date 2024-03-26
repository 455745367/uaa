package com.mycompany.myapp.config;

import reactor.blockhound.BlockHound;
import reactor.blockhound.integration.BlockHoundIntegration;

public class JHipsterBlockHoundIntegration implements BlockHoundIntegration {

    @Override
    public void applyTo(BlockHound.Builder builder) {
        builder.allowBlockingCallsInside("org.springframework.validation.beanvalidation.SpringValidatorAdapter", "validate");
        builder.allowBlockingCallsInside("com.mycompany.myapp.service.MailService", "sendEmailFromTemplate");
        builder.allowBlockingCallsInside("com.mycompany.myapp.security.DomainUserDetailsService", "createSpringSecurityUser");
        builder.allowBlockingCallsInside("org.springframework.data.couchbase.core.convert.MappingCouchbaseConverter", "read");
        builder.allowBlockingCallsInside("com.github.couchmove.repository.CouchbaseRepositoryImpl", "lambda$query$2");
        builder.allowBlockingCallsInside("com.github.couchmove.repository.CouchbaseRepositoryImpl", "lambda$importFtsIndex$1");
        builder.allowBlockingCallsInside("com.scurrilous.circe.utils.NativeUtils", "loadLibraryFromJar");
        builder.allowBlockingCallsInside("org.springframework.web.reactive.result.method.InvocableHandlerMethod", "invoke");
        builder.allowBlockingCallsInside("org.springdoc.core.service.OpenAPIService", "build");
        builder.allowBlockingCallsInside("org.springdoc.core.service.AbstractRequestService", "build");
    }
}
