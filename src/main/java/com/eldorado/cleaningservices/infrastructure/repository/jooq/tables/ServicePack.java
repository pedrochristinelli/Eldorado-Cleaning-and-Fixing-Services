/*
 * This file is generated by jOOQ.
 */
package com.eldorado.cleaningservices.infrastructure.repository.jooq.tables;


import com.eldorado.cleaningservices.infrastructure.repository.jooq.DefaultSchema;
import com.eldorado.cleaningservices.infrastructure.repository.jooq.tables.records.ServicePackRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Row2;
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
public class ServicePack extends TableImpl<ServicePackRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>SERVICE_PACK</code>
     */
    public static final ServicePack SERVICE_PACK = new ServicePack();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ServicePackRecord> getRecordType() {
        return ServicePackRecord.class;
    }

    /**
     * The column <code>SERVICE_PACK.id</code>.
     */
    public final TableField<ServicePackRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>SERVICE_PACK.name</code>.
     */
    public final TableField<ServicePackRecord, String> NAME = createField(DSL.name("name"), SQLDataType.CLOB, this, "");

    private ServicePack(Name alias, Table<ServicePackRecord> aliased) {
        this(alias, aliased, null);
    }

    private ServicePack(Name alias, Table<ServicePackRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>SERVICE_PACK</code> table reference
     */
    public ServicePack(String alias) {
        this(DSL.name(alias), SERVICE_PACK);
    }

    /**
     * Create an aliased <code>SERVICE_PACK</code> table reference
     */
    public ServicePack(Name alias) {
        this(alias, SERVICE_PACK);
    }

    /**
     * Create a <code>SERVICE_PACK</code> table reference
     */
    public ServicePack() {
        this(DSL.name("SERVICE_PACK"), null);
    }

    @Override
    public Schema getSchema() {
        return DefaultSchema.DEFAULT_SCHEMA;
    }

    @Override
    public UniqueKey<ServicePackRecord> getPrimaryKey() {
        return Internal.createUniqueKey(ServicePack.SERVICE_PACK, DSL.name("pk_SERVICE_PACK"), new TableField[] { ServicePack.SERVICE_PACK.ID }, true);
    }

    @Override
    public List<UniqueKey<ServicePackRecord>> getKeys() {
        return Arrays.<UniqueKey<ServicePackRecord>>asList(
              Internal.createUniqueKey(ServicePack.SERVICE_PACK, DSL.name("pk_SERVICE_PACK"), new TableField[] { ServicePack.SERVICE_PACK.ID }, true)
        );
    }

    @Override
    public ServicePack as(String alias) {
        return new ServicePack(DSL.name(alias), this);
    }

    @Override
    public ServicePack as(Name alias) {
        return new ServicePack(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ServicePack rename(String name) {
        return new ServicePack(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ServicePack rename(Name name) {
        return new ServicePack(name, null);
    }

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row2<Integer, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }
}
