=========================
AUTO-CONFIGURATION REPORT
=========================
#当集成项目springBoot-customer的时候
日志报告HelloServiceAutoConfiguration、HelloServiceAutoConfiguration#helloService matched:

Positive matches:
-----------------
 
   HelloServiceAutoConfiguration matched:
      - @ConditionalOnClass found required class 'com.xianlei.boot.service.HelloService'; @ConditionalOnMissingClass did not find unwanted class (OnClassCondition)
      - @ConditionalOnProperty (hello.enabled) matched (OnPropertyCondition)

   HelloServiceAutoConfiguration#helloService matched:
      - @ConditionalOnMissingBean (types: com.xianlei.boot.service.HelloService; SearchStrategy: all) did not find any beans (OnBeanCondition)

   HttpEncodingAutoConfiguration matched:
      - @ConditionalOnClass found required class 'org.springframework.web.filter.CharacterEncodingFilter'; @ConditionalOnMissingClass did not find unwanted class (OnClassCondition)
      - @ConditionalOnWebApplication (required) found StandardServletEnvironment (OnWebApplicationCondition)
      - @ConditionalOnProperty (spring.http.encoding.enabled) matched (OnPropertyCondition)

   HttpEncodingAutoConfiguration#characterEncodingFilter matched:
      - @ConditionalOnMissingBean (types: org.springframework.web.filter.CharacterEncodingFilter; SearchStrategy: all) did not find any beans (OnBeanCondition)




HelloServiceAutoConfiguration matched:
      - @ConditionalOnClass found required class 'com.xianlei.boot.service.HelloService'; @ConditionalOnMissingClass did not find unwanted class (OnClassCondition)
      - @ConditionalOnProperty (hello.enabled) matched (OnPropertyCondition)

   HelloServiceAutoConfiguration#helloService matched:
      - @ConditionalOnMissingBean (types: com.xianlei.boot.service.HelloService; SearchStrategy: all) did not find any beans (OnBeanCondition)

      
      
   