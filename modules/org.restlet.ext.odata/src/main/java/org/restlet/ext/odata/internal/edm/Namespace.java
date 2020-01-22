/**
 * Copyright 2005-2019 Talend
 * 
 * The contents of this file are subject to the terms of one of the following
 * open source licenses: Apache 2.0 or or EPL 1.0 (the "Licenses"). You can
 * select the license that you prefer but you may not use this file except in
 * compliance with one of these Licenses.
 * 
 * You can obtain a copy of the Apache 2.0 license at
 * http://www.opensource.org/licenses/apache-2.0
 * 
 * You can obtain a copy of the EPL 1.0 license at
 * http://www.opensource.org/licenses/eclipse-1.0
 * 
 * See the Licenses for the specific language governing permissions and
 * limitations under the Licenses.
 * 
 * Alternatively, you can obtain a royalty free commercial license with less
 * limitations, transferable or non-transferable, directly at
 * https://restlet.talend.com/
 * 
 * Restlet is a registered trademark of Talend S.A.
 */

package org.restlet.ext.odata.internal.edm;

/**
 * Represents a schema's namespace in the metadata descriptor of a OData
 * service.
 * 
 * @author Thierry Boileau
 */
public class Namespace extends NamedObject {
    /** The short alias for this namespace. */
    private String alias;

    /**
     * Constructor.
     * 
     * @param name
     *            The alias for this namespace.
     */
    public Namespace(String name) {
        super(name);
    }

    /**
     * Returns the short alias for this namespace.
     * 
     * @return The short alias for this namespace.
     */
    public String getAlias() {
        return alias;
    }

    /**
     * Sets the short alias for this namespace.
     * 
     * @param alias
     *            The short alias for this namespace.
     */
    public void setAlias(String alias) {
        this.alias = alias;
    }

}