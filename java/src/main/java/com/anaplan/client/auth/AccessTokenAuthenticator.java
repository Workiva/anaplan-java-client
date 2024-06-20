package com.anaplan.client.auth;

import com.anaplan.client.transport.ConnectionProperties;

import java.nio.charset.StandardCharsets;

public class AccessTokenAuthenticator extends AbstractAuthenticator {
    private final ConnectionProperties properties;

    AccessTokenAuthenticator(ConnectionProperties properties) {
        super(properties);
        this.properties = properties;
    }

    @Override
    public byte[] authenticate() {
        return this.properties.getApiCredentials().getAccessToken().getBytes(StandardCharsets.UTF_8);
    }
}
