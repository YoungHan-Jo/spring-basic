package hello.core.exception;

import hello.core.AppConfig;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.assertj.core.api.Assertions.*;

public class ExceptionTest {

    @Test
    void exceptionTest() {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
        MemberService memberServiceImpl = ac.getBean("memberService", MemberService.class);
        assertThat(memberServiceImpl).isInstanceOf(MemberServiceImpl.class);
    }
}

