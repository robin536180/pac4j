package org.pac4j.core.client.finder;

import org.pac4j.core.client.Client;
import org.pac4j.core.client.Clients;
import org.pac4j.core.context.WebContext;
import org.pac4j.core.credentials.Credentials;

import java.util.List;

/**
 * The way to find the client.
 *
 * @author Jerome Leleu
 * @since 1.8.0
 */
public interface ClientFinder {

    List<Client<? extends Credentials>> find(Clients clients, WebContext context, String clientNames);
}
