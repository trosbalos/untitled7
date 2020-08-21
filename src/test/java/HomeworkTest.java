import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class HomeworkTest {

    @Test
    public void method() {
        Homework homework = new Homework();
        String Str1 = "пробел точка запятая";
        String[] expectedResult = {"пробел","точка","запятая"};
        String[] result = homework.method(Str1);

        Assert.assertArrayEquals( expectedResult,result );
    }
    }
