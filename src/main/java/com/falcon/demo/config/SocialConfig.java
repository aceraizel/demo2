//package com.falcon.demo.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Scope;
//import org.springframework.context.annotation.ScopedProxyMode;
//import org.springframework.social.config.annotation.EnableSocial;
//import org.springframework.social.config.annotation.SocialConfigurer;
//import org.springframework.social.connect.Connection;
//import org.springframework.social.connect.ConnectionFactoryLocator;
//import org.springframework.social.connect.ConnectionRepository;
//import org.springframework.social.connect.UsersConnectionRepository;
//import org.springframework.social.connect.jdbc.JdbcUsersConnectionRepository;
//import org.springframework.social.facebook.api.Facebook;
//
//import javax.inject.Inject;
//
//@Configuration
//@EnableSocial
//public class SocialConfig implements SocialConfigurer {
////    /**
////     * Singleton data access object providing access to connections across all users.
////     */
////    @Override
////    public UsersConnectionRepository getUsersConnectionRepository(ConnectionFactoryLocator connectionFactoryLocator) {
////        JdbcUsersConnectionRepository repository = new JdbcUsersConnectionRepository(null, connectionFactoryLocator, Encryptors.noOpText());
////        return repository;
////    }
//
//    @Bean
//    @Scope(value="request", proxyMode= ScopedProxyMode.INTERFACES)
//    public Facebook facebook(ConnectionRepository repository) {
//        Connection<Facebook> connection = repository.findPrimaryConnection(Facebook.class);
//        return connection != null ? connection.getApi() : null;
//    }
//
////    @Bean
////    public ProviderSignInController providerSignInController(ConnectionFactoryLocator connectionFactoryLocator, UsersConnectionRepository usersConnectionRepository) {
////        return new ProviderSignInController(connectionFactoryLocator, usersConnectionRepository, new SimpleSignInAdapter());
////    }
//
//}
