import org.junit.runner.Description;
import org.junit.runner.JUnitCore;
import org.junit.runner.Request;
import org.junit.runner.manipulation.Filter;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        JUnitCore runer = new JUnitCore();
        //тут в цикле накидываем список классов нужное кол-во раз
        Request r = Request.classes(Tests.class, Tests.class).filterWith(new Filter() {
            @Override
            public boolean shouldRun(Description description) {
                if (description.isTest()) {
                    return Arrays.asList("test1", "test3").contains(description.getMethodName())
                            && description.getClassName().equals(Tests.class.getName());
                } else {
                    return true;
                }
            }

            @Override
            public String describe() {
                return null;
            }
        });
        runer.run(r);

    }
}
