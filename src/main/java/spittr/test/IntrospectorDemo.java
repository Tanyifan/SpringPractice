package spittr.test;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author TanYf.
 * @project
 * @illu
 * @date 2018/11/15
 */
public class IntrospectorDemo {

    String name;
    public static void main(String[] args) throws IntrospectionException, InvocationTargetException, IllegalAccessException {
        IntrospectorDemo demo = new IntrospectorDemo();
        demo.setName("tanyf");
        BeanInfo beanInfo = Introspector.getBeanInfo(demo.getClass(),Object.class);
        PropertyDescriptor[] props = beanInfo.getPropertyDescriptors();
        for (int i = 0; i < props.length; i++) {
            System.out.println(props[i].getName()+"="+props[i].getReadMethod().invoke(demo,null));
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
