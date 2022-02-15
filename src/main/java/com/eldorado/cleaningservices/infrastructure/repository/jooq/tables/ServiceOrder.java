/*
 * This file is generated by jOOQ.
 */
package com.eldorado.cleaningservices.infrastructure.repository.jooq.tables;


import com.eldorado.cleaningservices.infrastructure.repository.jooq.DefaultSchema;
import com.eldorado.cleaningservices.infrastructure.repository.jooq.tables.records.ServiceOrderRecord;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Row8;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ServiceOrder extends TableImpl<ServiceOrderRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>SERVICE_ORDER</code>
     */
    public static final ServiceOrder SERVICE_ORDER = new ServiceOrder();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ServiceOrderRecord> getRecordType() {
        return ServiceOrderRecord.class;
    }

    /**
     * The column <code>SERVICE_ORDER.id</code>.
     */
    public final TableField<ServiceOrderRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>SERVICE_ORDER.start_date</code>.
     */
    public final TableField<ServiceOrderRecord, LocalDate> START_DATE = createField(DSL.name("start_date"), SQLDataType.LOCALDATE, this, "");

    /**
     * The column <code>SERVICE_ORDER.end_date</code>.
     */
    public final TableField<ServiceOrderRecord, LocalDate> END_DATE = createField(DSL.name("end_date"), SQLDataType.LOCALDATE, this, "");

    /**
     * The column <code>SERVICE_ORDER.finished_picture</code>.
     */
    public final TableField<ServiceOrderRecord, String> FINISHED_PICTURE = createField(DSL.name("finished_picture"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>SERVICE_ORDER.person_id</code>.
     */
    public final TableField<ServiceOrderRecord, Integer> PERSON_ID = createField(DSL.name("person_id"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>SERVICE_ORDER.building_id</code>.
     */
    public final TableField<ServiceOrderRecord, Integer> BUILDING_ID = createField(DSL.name("building_id"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>SERVICE_ORDER.service_id</code>.
     */
    public final TableField<ServiceOrderRecord, Integer> SERVICE_ID = createField(DSL.name("service_id"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>SERVICE_ORDER.order_id</code>.
     */
    public final TableField<ServiceOrderRecord, Integer> ORDER_ID = createField(DSL.name("order_id"), SQLDataType.INTEGER, this, "");

    private ServiceOrder(Name alias, Table<ServiceOrderRecord> aliased) {
        this(alias, aliased, null);
    }

    private ServiceOrder(Name alias, Table<ServiceOrderRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>SERVICE_ORDER</code> table reference
     */
    public ServiceOrder(String alias) {
        this(DSL.name(alias), SERVICE_ORDER);
    }

    /**
     * Create an aliased <code>SERVICE_ORDER</code> table reference
     */
    public ServiceOrder(Name alias) {
        this(alias, SERVICE_ORDER);
    }

    /**
     * Create a <code>SERVICE_ORDER</code> table reference
     */
    public ServiceOrder() {
        this(DSL.name("SERVICE_ORDER"), null);
    }

    @Override
    public Schema getSchema() {
        return DefaultSchema.DEFAULT_SCHEMA;
    }

    @Override
    public UniqueKey<ServiceOrderRecord> getPrimaryKey() {
        return Internal.createUniqueKey(ServiceOrder.SERVICE_ORDER, DSL.name("pk_SERVICE_ORDER"), new TableField[] { ServiceOrder.SERVICE_ORDER.ID }, true);
    }

    @Override
    public List<UniqueKey<ServiceOrderRecord>> getKeys() {
        return Arrays.<UniqueKey<ServiceOrderRecord>>asList(
              Internal.createUniqueKey(ServiceOrder.SERVICE_ORDER, DSL.name("pk_SERVICE_ORDER"), new TableField[] { ServiceOrder.SERVICE_ORDER.ID }, true)
        );
    }

    @Override
    public ServiceOrder as(String alias) {
        return new ServiceOrder(DSL.name(alias), this);
    }

    @Override
    public ServiceOrder as(Name alias) {
        return new ServiceOrder(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ServiceOrder rename(String name) {
        return new ServiceOrder(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ServiceOrder rename(Name name) {
        return new ServiceOrder(name, null);
    }

    // -------------------------------------------------------------------------
    // Row8 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row8<Integer, LocalDate, LocalDate, String, Integer, Integer, Integer, Integer> fieldsRow() {
        return (Row8) super.fieldsRow();
    }
}