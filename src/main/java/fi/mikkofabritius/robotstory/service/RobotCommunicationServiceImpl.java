package fi.mikkofabritius.robotstory.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author mikko.fabritius
 */
@Component
public class RobotCommunicationServiceImpl implements RobotCommunicationService {
    private static final Logger LOG = LoggerFactory.getLogger(RobotCommunicationServiceImpl.class);

    public RobotCommunicationServiceImpl() {
        LOG.info("Robot communication service instantiated");
    }
}
