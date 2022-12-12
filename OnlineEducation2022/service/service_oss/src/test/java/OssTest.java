import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.function.Consumer;
import java.util.function.Function;

/**
 * Function学习
 *
 * @author wzzmm
 * @since 2022/11/10 19:55
 */
@Slf4j
public class OssTest {

//    StringBuilder sb = new StringBuilder("Hello ");
//    Consumer<StringBuilder> consumer = (str) -> str.append("Jack!");
//    consumer.accept(sb);
//    System.out.println(sb.toString());    // Hello Jack!

    @Test
    public void consumer() {
        doConsumer(new StringBuilder("Hello "), str -> {
            verify(str);
            str.append("Jack!");
        });
    }

    public void doConsumer(StringBuilder stringBuilder, Consumer<StringBuilder> consumer) {
        consumer.accept(stringBuilder);
        stringBuilder.append("Lucy!");
        System.out.println(stringBuilder.toString());
    }

//    Function<String, String> function = a -> a + " Jack!";
//    System.out.println(function.apply("Hello")); // Hello Jack!

    @Test
    public void function() {
        StringBuilder stringBuilder = new StringBuilder("Hello ");
        doFunction(stringBuilder, a -> {
            verify(a);
            return new StringBuilder(stringBuilder + "Jack!");
        });
    }

    private void doFunction(StringBuilder str, Function<StringBuilder, StringBuilder> function) {
        System.out.println(function.apply(str)); // Hello Jack!
    }

    private void verify(StringBuilder str) {
        if (str.length() <= 0) {
            throw new RuntimeException("长度为null");
        } else {
            log.info("存在");
        }
    }
}
