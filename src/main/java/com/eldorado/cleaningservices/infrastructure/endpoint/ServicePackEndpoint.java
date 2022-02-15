package com.eldorado.cleaningservices.infrastructure.endpoint;

import com.eldorado.cleaningservices.application.service.ServiceOrderService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;


@RestController
@RequestMapping(EndPointMaps.SERVICE_PACK_BASE_PATH)
public class ServicePackEndpoint {

    private static final Logger LOGGER = LoggerFactory.getLogger(ServicePackEndpoint.class);
    private final ServiceOrderService serviceOrderService;

    @Autowired
    public ServicePackEndpoint(ServiceOrderService serviceOrderService) {
        this.serviceOrderService = serviceOrderService;
    }

    @Operation(summary = "Retrieve all the images of a certain type of service package.")
    @GetMapping("/getAllServicePackImagesByName/{servicePack}")
    public List<String> getAllServicePackImages(@Parameter(example = "Start Fresh 022",
            description = "The param used is the name of the package. This operation isn't case sensitive.\n\nExamples:\nStart Fresh 022\n" +
                    "Return from the ashes 022\nI-can-no-longer-live-in-fear-of-the-rain-anymore022") @PathVariable("servicePack") String servicePack){
        LOGGER.info("Starting to process the endpoint '{}' with the method '{}' with the following variable: {}", "/getAllServicePackImagesByName", "GET", servicePack );
        return serviceOrderService.getImagesOfServicePackByName(servicePack);
    }
}
