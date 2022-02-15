package com.eldorado.cleaningservices.infrastructure.endpoint;

import com.eldorado.cleaningservices.application.service.ServiceOrderService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Date;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(EndPointMaps.SERVICE_ORDER_BASE_PATH)
public class ServiceOrderEndpoint {

    private static final Logger LOGGER = LoggerFactory.getLogger(ServiceOrderEndpoint.class);
    private final ServiceOrderService serviceOrderService;

    @Autowired
    public ServiceOrderEndpoint(ServiceOrderService serviceOrderService) {
        this.serviceOrderService = serviceOrderService;
    }

    @Operation(summary = "Retrieve all the procedures that happened in a specific date")
    @GetMapping("/getProceduresByDate/{date}")
    public List<Map<String, Object>> getProceduresByDate(@Parameter(example = "2022-01-22", description = "The following date pattern is used: yyyy-MM-dd") @PathVariable("date") @DateTimeFormat(pattern="yyyy-MM-dd") Date date){
        LOGGER.info("Starting to process the endpoint '{}' with the method '{}' with the following variable: {}", "/getProceduresByDate", "GET", date);
        return serviceOrderService.getServiceOrdersByDate(date);
    }
}
