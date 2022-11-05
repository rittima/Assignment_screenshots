package Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Test1
{

}
class Question1usingTestAnnotation {
    @Test
    public int testcase()
    {
        int a=1120;
        return a;
    }
    public static void main(String[] agrs)
    {
        Question1usingTestAnnotation t = new Question1usingTestAnnotation();
        System.out.println(t.testcase());
    }
}
