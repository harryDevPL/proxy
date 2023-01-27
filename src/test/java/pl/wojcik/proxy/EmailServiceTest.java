package pl.wojcik.proxy;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmailServiceTest {

    @Autowired
    EmailService emailService;

    @Test
    void addEmail() {
        // given
        String email = "someEmail@gmail.com";

        // when
        emailService.addEmail(email);
        emailService.addEmail(email);

        // general question was: what should we do to pass the test

//        at app//org.springframework.aop.framework.CglibAopProxy$CglibMethodInvocation.proceed(CglibAopProxy.java:763)
//        at app//org.springframework.aop.framework.CglibAopProxy$DynamicAdvisedInterceptor.intercept(CglibAopProxy.java:708)
//        at app//pl.wojcik.proxy.EmailService$$EnhancerBySpringCGLIB$$4e30963f.addEmail(<generated>)

        // then
    }
}