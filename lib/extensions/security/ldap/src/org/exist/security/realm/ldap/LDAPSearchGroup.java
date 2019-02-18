package org.exist.security.realm.ldap;

import org.exist.config.Configurable;
import org.exist.config.Configuration;
import org.exist.config.Configurator;
import org.exist.config.annotation.ConfigurationClass;

/**
 *
 * @author aretter
 */
@ConfigurationClass("group")
public class LDAPSearchGroup extends AbstractLDAPSearchPrincipal implements Configurable {

    public LDAPSearchGroup(Configuration config) {
        super(config);

        //it require, because class's fields initializing after super constructor
        if(this.configuration != null) {
            this.configuration = Configurator.configure(this, this.configuration);
        }
    }
}
