package fi.mikkofabritius.robotstory.service;

import fi.mikkofabritius.robotstory.domain.stage.Stage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author mikko.fabritius
 */
@Component
public class StageServiceImpl implements StageService {
    private static final Logger LOG = LoggerFactory.getLogger(StageServiceImpl.class);

    @Autowired
    private MachineVisionService machineVisionService;

    private Stage stage;

    public StageServiceImpl() {
        LOG.info("Initializing stage service");

        stage = new Stage();

        LOG.info("Stage service ready");
    }
}
