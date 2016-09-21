package fi.mikkofabritius.robotstory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author mikko.fabritius
 */
@Controller
class ApiController {
    private static final Logger LOG = LoggerFactory.getLogger(ApiController.class);

    @Value("${hello}")
    private String helloMessage;

    @RequestMapping("/")
    @ResponseBody
    String root() {
        LOG.info(helloMessage);
        return helloMessage;
    }

}
