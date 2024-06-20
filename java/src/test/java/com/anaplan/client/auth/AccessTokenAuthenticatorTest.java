package com.anaplan.client.auth;

import com.anaplan.client.transport.ConnectionProperties;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class AccessTokenAuthenticatorTest {
    @Test
    public void testAccessTokenAuthenticatorReturnsAccessToken() throws IOException {
        final ConnectionProperties props = new ConnectionProperties();
        props.setApiCredentials(new Credentials("my_access_token"));

        final Authenticator authenticator = AuthenticatorFactory.getAuthenticator(props);

        Assert.assertArrayEquals("my_access_token".getBytes(StandardCharsets.UTF_8), authenticator.authenticate());
    }
}
