/*
 * This file is generated by jOOQ.
 */
package com.eldorado.cleaningservices.infrastructure.repository.jooq.tables.records;


import com.eldorado.cleaningservices.infrastructure.repository.jooq.tables.ServicesInPack;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ServicesInPackRecord extends TableRecordImpl<ServicesInPackRecord> implements Record2<Integer, Integer> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>SERVICES_IN_PACK.service_id</code>.
     */
    public void setServiceId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>SERVICES_IN_PACK.service_id</code>.
     */
    public Integer getServiceId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>SERVICES_IN_PACK.service_pack_id</code>.
     */
    public void setServicePackId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>SERVICES_IN_PACK.service_pack_id</code>.
     */
    public Integer getServicePackId() {
        return (Integer) get(1);
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row2<Integer, Integer> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    @Override
    public Row2<Integer, Integer> valuesRow() {
        return (Row2) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return ServicesInPack.SERVICES_IN_PACK.SERVICE_ID;
    }

    @Override
    public Field<Integer> field2() {
        return ServicesInPack.SERVICES_IN_PACK.SERVICE_PACK_ID;
    }

    @Override
    public Integer component1() {
        return getServiceId();
    }

    @Override
    public Integer component2() {
        return getServicePackId();
    }

    @Override
    public Integer value1() {
        return getServiceId();
    }

    @Override
    public Integer value2() {
        return getServicePackId();
    }

    @Override
    public ServicesInPackRecord value1(Integer value) {
        setServiceId(value);
        return this;
    }

    @Override
    public ServicesInPackRecord value2(Integer value) {
        setServicePackId(value);
        return this;
    }

    @Override
    public ServicesInPackRecord values(Integer value1, Integer value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ServicesInPackRecord
     */
    public ServicesInPackRecord() {
        super(ServicesInPack.SERVICES_IN_PACK);
    }

    /**
     * Create a detached, initialised ServicesInPackRecord
     */
    public ServicesInPackRecord(Integer serviceId, Integer servicePackId) {
        super(ServicesInPack.SERVICES_IN_PACK);

        setServiceId(serviceId);
        setServicePackId(servicePackId);
    }
}
