package consumidores.cons;

import com.amazonaws.xray.spring.aop.XRayEnabled;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@RequestMapping
@RestController
@Slf4j
@XRayEnabled
public class Consumidora {

    @Autowired
    RestTemplate rt;

    @GetMapping
    public String productList(){
        return rt.getForObject("http://my-market-lb-1374113839.us-east-1.elb.amazonaws.com/smoke/isAlive",String.class);
    }

}
