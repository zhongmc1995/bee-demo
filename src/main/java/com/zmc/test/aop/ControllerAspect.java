package com.zmc.test.aop;

import com.zmc.bee.framework.aop.annotation.Aspect;
import com.zmc.bee.framework.aop.common.Impl.AspectProxy;
import com.zmc.bee.framework.web.annotaion.Controller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.lang.reflect.Method;

/**
 * Created by zhongmc on 2017/5/22.
 */
@Aspect(Controller.class)
public class ControllerAspect extends AspectProxy {
    private final static Logger LOGGER = LoggerFactory.getLogger(ControllerAspect.class);
    @Override
    public void before(Class<?> cls, Method method, Object[] params) throws Throwable {
        LOGGER.info("ControllerAspect before");
    }

    @Override
    public void after(Class<?> cls, Method method, Object[] params, Object result) throws Throwable {
        LOGGER.info("ControllerAspect after");
    }
}
