package com.brianway.learning.spring.aop.aspectj.basic;

import com.brianway.learning.spring.aop.aspectj.anno.NeedTest;

public interface Waiter {
    @NeedTest
    public void greetTo(String clientName);

    public void serveTo(String clientName);
}
