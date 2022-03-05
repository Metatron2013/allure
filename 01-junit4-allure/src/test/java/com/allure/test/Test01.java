package com.allure.test;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import org.junit.Assert;
import org.junit.Test;

/**
 * Allure快速入门
 *
 * @program: automation-report-code
 * @description: Allure快速入门
 * @author: Silence
 * @create: 2022-02-20 19:46
 */
public class Test01 {

    @Test
    @Step("测试步骤001")
    @Description("我是测试步骤001的描述")
    @Severity(SeverityLevel.BLOCKER)
    public void test01() {
        Assert.assertEquals(1,1);
    }

    @Test
    @Step("测试步骤002")
    @Description("我是测试步骤002的描述")
    @Severity(SeverityLevel.CRITICAL)
    public void test02() {
        Assert.assertEquals(1,1);
    }

    @Test
    @Step("测试步骤003")
    @Description("我是测试步骤003的描述")
    @Severity(SeverityLevel.NORMAL)
    public void test03() {
        Assert.assertEquals(1,1);
    }
}
