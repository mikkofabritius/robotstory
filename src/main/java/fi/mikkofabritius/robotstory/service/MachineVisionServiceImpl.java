package fi.mikkofabritius.robotstory.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author mikko.fabritius
 */
@Component
public class MachineVisionServiceImpl implements MachineVisionService {
    private static final Logger LOG = LoggerFactory.getLogger(MachineVisionServiceImpl.class);

    public MachineVisionServiceImpl() {
        LOG.info("Machine vision service instantiated");
    }
}
