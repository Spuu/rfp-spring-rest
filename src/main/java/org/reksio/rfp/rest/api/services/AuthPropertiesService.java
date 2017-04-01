package org.reksio.rfp.rest.api.services;

import java.util.Map;

/**
 * AuthPropertiesService
 */
public enum AuthPropertiesService {
    INSTANCE;

    private Map<String,String> env;
    AuthPropertiesService() {
        env = System.getenv();
    }

    private static final String CLIENT_ID = "AUTH0_CLIENT_ID";
    private static final String SECRET_KEY = "AUTH0_SECRET_KEY";
    private static final String ISSUER = "AUTH0_ISSUER";
    private static final String NO_VALUE = "NO_VALUE";

    public String getSecretKey() {
        return env.getOrDefault(SECRET_KEY, NO_VALUE);
    }

    public String getClientId() {
        return env.getOrDefault(CLIENT_ID, NO_VALUE);
    }

    public String getIssuer() {
        return env.getOrDefault(ISSUER, NO_VALUE);
    }
}
