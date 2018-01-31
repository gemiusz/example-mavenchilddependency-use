package pl.gemiusz.example.mavenchilddependency.use;

import org.junit.Test;
import pl.gemiusz.example.mavenchilddependency.take.Take1Child1Class;
import pl.gemiusz.example.mavenchilddependency.take.Take1Child2Class;
import pl.gemiusz.example.mavenchilddependency.take.Take2Class;
import pl.gemiusz.example.mavenchilddependency.take.TakeWrapperClass;

public class TestUseClass {
    @Test
    public void testUseClass() {
        System.out.println(new Object() {
        }.getClass().getName() + " -> " + new Object() {
        }.getClass().getEnclosingMethod().getName() + " -> Do IT!");

        Take2Class take2Class = new Take2Class();
        Take1Child1Class take1Child1Class = new Take1Child1Class();
        Take1Child2Class take1Child2Class = new Take1Child2Class();
        TakeWrapperClass takeWrapperClass = new TakeWrapperClass();

        take2Class.methodTake2Class();
        take1Child1Class.methodTake1Child1Class();
        take1Child2Class.methodTake1Child2Class();
        takeWrapperClass.methodTakeWrapperClass();

    }
}
