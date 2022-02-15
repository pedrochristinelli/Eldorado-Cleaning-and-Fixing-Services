package com.eldorado.cleaningservices.infrastructure.repository.implementation;

import com.eldorado.cleaningservices.domain.repository.ServiceOrderRepository;
import org.jooq.DSLContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import static com.eldorado.cleaningservices.infrastructure.repository.jooq.tables.Orders.ORDERS;
import static com.eldorado.cleaningservices.infrastructure.repository.jooq.tables.Service.SERVICE;
import static com.eldorado.cleaningservices.infrastructure.repository.jooq.tables.ServiceOrder.SERVICE_ORDER;
import static com.eldorado.cleaningservices.infrastructure.repository.jooq.tables.ServicePack.SERVICE_PACK;
import static com.eldorado.cleaningservices.infrastructure.repository.jooq.tables.ServicesInPack.SERVICES_IN_PACK;

@Repository
public class ServiceOrderRepositoryImpl implements ServiceOrderRepository {
    private static final Logger LOGGER = LoggerFactory.getLogger(ServiceOrderRepositoryImpl.class);

    private final DSLContext dslContext;

    @Autowired
    public ServiceOrderRepositoryImpl(DSLContext dslContext) {
        this.dslContext = dslContext;
    }

    @Override
    public List<String> getServicePackImagesByName(String name) {
        try {
            return  dslContext.select()
                    .from(SERVICE_ORDER)
                    .join(SERVICES_IN_PACK).on(SERVICES_IN_PACK.SERVICE_ID.eq(SERVICE_ORDER.SERVICE_ID))
                    .join(SERVICE_PACK).on(SERVICE_PACK.ID.eq(SERVICES_IN_PACK.SERVICE_PACK_ID))
                    .where(SERVICE_PACK.NAME.eq(name))
                    .and(SERVICE_ORDER.FINISHED_PICTURE.isNotNull())
                    .fetch(SERVICE_ORDER.FINISHED_PICTURE);
        } catch (Exception e) {
            LOGGER.error("Failed to retrieve data from the SERVICE_ORDER table for the Service pack name: {}. Error: {}.", name, e);
            return new ArrayList<>();
        }
    }

    public List<Map<String, Object>> getServiceOrdersByDate(Date date){
        try {
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

            return dslContext.select(
                    SERVICE_ORDER.ID.as("serviceOrderId"),
                    SERVICE_ORDER.FINISHED_PICTURE.as("finishedPicture"),
                    SERVICE_ORDER.START_DATE.as("startDate"),
                    SERVICE_ORDER.END_DATE.as("endDate"),
                    SERVICE_ORDER.SERVICE_ID.as("serviceId"),
                    SERVICE.NAME.as("serviceName"),
                    SERVICE_PACK.ID.as("servicePackId"),
                    SERVICE_PACK.NAME.as("servicePackName"))
                    .from(SERVICE_ORDER)
                    .join(SERVICE).on(SERVICE.ID.eq(SERVICE_ORDER.SERVICE_ID))
                    .join(ORDERS).on(ORDERS.ID.eq(SERVICE_ORDER.ORDER_ID))
                    .join(SERVICE_PACK).on(SERVICE_PACK.ID.eq(ORDERS.SERVICE_PACK_ID))
                    .where("date(SERVICE_ORDER.START_DATE) <= '"+dateFormat.format(date)+"' AND date(SERVICE_ORDER.END_DATE) >= '"+dateFormat.format(date)+"'")
                    .fetchMaps();
        } catch (Exception e) {
            LOGGER.error("Failed to retrieve data from the SERVICE_ORDER table for the date: {}. Error: {}.", date, e);
            return new ArrayList<>();
        }
    }
}
