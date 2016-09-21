package fi.mikkofabritius.robotstory.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author mikko.fabritius
 */
@Component
public class CommanderServiceImpl implements CommanderService {
    private static final Logger LOG = LoggerFactory.getLogger(CommanderServiceImpl.class);

    @Override
    public void initialize() {
        LOG.info("Initializing robot story platform");
    }
}
