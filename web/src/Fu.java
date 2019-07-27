import java.io.File;
import java.io.IOException;

public class Fu {

    //不能抛出比父类更大的异常
    void a() throws IOException {
        File f = new File("");
    }
}
