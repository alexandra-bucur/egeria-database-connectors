/* SPDX-License-Identifier: Apache-2.0 */
/* Copyright Contributors to the ODPi Egeria project. */
package org.odpi.openmetadata.adapters.connectors.integration.jdbc.transfer.requests;

import org.odpi.openmetadata.adapters.connectors.resource.jdbc.JdbcMetadata;

import java.util.Optional;
import java.util.function.Supplier;

class JdbcGetConnectorTypeQualifiedName implements Supplier<String> {

    private final JdbcMetadata jdbcMetadata;

    JdbcGetConnectorTypeQualifiedName(JdbcMetadata jdbcMetadata) {
        this.jdbcMetadata = jdbcMetadata;
    }

    @Override
    public String get(){
        return Optional.ofNullable(jdbcMetadata.getConnectorTypeQualifiedName()).orElseGet(String::new);
    }

}