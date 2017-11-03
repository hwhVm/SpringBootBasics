import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by beini on 2017/11/3.
 */
@Controller
@EnableAutoConfiguration
public class TestController {

    @RequestMapping("test")
    @ResponseBody
    String Hello() {
        return "Hello SpringBoot ";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(TestController.class, args);
    }
}
