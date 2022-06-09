import com.cos.s1.proxy.p1.FangDong;
import com.cos.s1.proxy.p1.FangDongImpl;
import org.junit.Test;
import org.springframework.cglib.proxy.Enhancer;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author: COS
 * @time: 2022/6/2 16:08
 * @description: 如果被代理的类有接口 优先使用JDK代理
 * 如果被代理的类没有接口实现,才去使用cglib
 */
public class ProxyDemo {
    @Test
    public void jdk() {
        //1 被代理的类有没有接口的实现
        FangDongImpl fd = new FangDongImpl();
        //创建代理实现的类
        InvocationHandler in = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                //2 代理的方法
                System.out.println("贴小广告");
                System.out.println("带人看房");
                //3 被代理的方法
                fd.zuFang();
                return null;
            }
        };
        //生成代理类
        /*
        newProxyInstance(ClassLoader loader 被代理类的类加载器,
                         Class<?>[] interfaces 被代理类的接口参数,
                         InvocationHandler h 代理的实现类
                         )
         */
        // FangDong o 代理类
        FangDong o = (FangDong) Proxy.newProxyInstance(fd.getClass().getClassLoader(), fd.getClass().getInterfaces(), in);
        //调用方法
        o.zuFang();
    }

    @Test
    public void cglib() {
        //1 被代理的类有没有接口的实现
        FangDongImpl fd = new FangDongImpl();
        //2 创建Enhancer 对象 ,用于生成代理类
        Enhancer en = new Enhancer();
        //3 设置父类 使用业务类作为父类,让代理类重写业务的方法
        en.setSuperclass(fd.getClass());
        //4 设置 代理类的实现
        en.setCallback(new org.springframework.cglib.proxy.InvocationHandler() {
            @Override
            public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
                //2 代理的方法
                System.out.println("贴小广告");
                System.out.println("接受电话轰炸");
                //3 被代理的方法
                fd.zuFang();
                return null;
            }
        });
        //5 生成代理类就行 ,使用父类接受代理类的实例
        FangDongImpl o = (FangDongImpl) en.create();
        //6 调用方法
        o.zuFang();
    }


    public FangDong getProxy(String classPath) throws Exception {

        Class<?> aClass = Class.forName(classPath);
        FangDong fd = (FangDong) aClass.newInstance();
        InvocationHandler in = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                //2 代理的方法
                System.out.println("手机客户手机号");
                System.out.println("每个电话骚扰去带人看房");
                //3 被代理的方法
                fd.zuFang();
                return null;
            }
        };
        FangDong o = (FangDong) Proxy.newProxyInstance(fd.getClass().getClassLoader(), fd.getClass().getInterfaces(), in);
        return o;
    }
    @Test
    public void testDemo() throws Exception {

        FangDong proxy = getProxy("com.cos.s1.proxy.p1.FangDongImpl2");
        proxy.zuFang();
    }
}
