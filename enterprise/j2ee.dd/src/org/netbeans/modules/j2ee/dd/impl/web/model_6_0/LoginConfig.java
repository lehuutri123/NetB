/**
 *	This generated bean class LoginConfig matches the schema element 'login-configType'.
 *  The root bean class is WebApp
 *
 *	===============================================================
 *	
 *	
 *	        The login-configType is used to configure the authentication
 *	        method that should be used, the realm name that should be
 *	        used for this application, and the attributes that are
 *	        needed by the form login mechanism.
 *	        
 *	        Used in: web-app
 *	        
 *	      
 *	===============================================================
 * @Generated
 */

package org.netbeans.modules.j2ee.dd.impl.web.model_6_0;

import org.w3c.dom.*;
import org.netbeans.modules.schema2beans.*;
import java.beans.*;
import java.util.*;

// BEGIN_NOI18N

public class LoginConfig extends org.netbeans.modules.j2ee.dd.impl.common.EnclosingBean
	 implements 
            org.netbeans.modules.j2ee.dd.api.web.LoginConfig
        
{

	static Vector comparators = new Vector();
	static{
		LoginConfig.addComparator(new org.netbeans.modules.j2ee.dd.impl.common.Comparator());
	}
	private static final org.netbeans.modules.schema2beans.Version runtimeVersion = new org.netbeans.modules.schema2beans.Version(5, 0, 0);
	;	// NOI18N

	static public final String ID = "Id";	// NOI18N
	static public final String AUTH_METHOD = "AuthMethod";	// NOI18N
	static public final String REALM_NAME = "RealmName";	// NOI18N
	static public final String REALMNAMEID = "RealmNameId";	// NOI18N
	static public final String FORM_LOGIN_CONFIG = "FormLoginConfig";	// NOI18N

	public LoginConfig() {
		this(Common.USE_DEFAULT_VALUES);
	}

	public LoginConfig(int options)
	{
		super(comparators, runtimeVersion);
		// Properties (see root bean comments for the bean graph)
		initPropertyTables(3);
		this.createProperty("auth-method", 	// NOI18N
			AUTH_METHOD, 
			Common.TYPE_0_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
		this.createProperty("realm-name", 	// NOI18N
			REALM_NAME, 
			Common.TYPE_0_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
		this.createAttribute(REALM_NAME, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("form-login-config", 	// NOI18N
			FORM_LOGIN_CONFIG, 
			Common.TYPE_0_1 | Common.TYPE_BEAN | Common.TYPE_KEY, 
			FormLoginConfig.class);
		this.createAttribute(FORM_LOGIN_CONFIG, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.initialize(options);
	}

	// Setting the default values of the properties
	void initialize(int options) {

	}

	// This attribute is optional
	public void setId(java.lang.String value) {
		setAttributeValue(ID, value);
	}

	//
	public java.lang.String getId() {
		return getAttributeValue(ID);
	}

	// This attribute is optional
	public void setAuthMethod(java.lang.String value) {
		this.setValue(AUTH_METHOD, value);
	}

	//
	public java.lang.String getAuthMethod() {
		return (java.lang.String)this.getValue(AUTH_METHOD);
	}

	// This attribute is optional
	public void setRealmName(java.lang.String value) {
		this.setValue(REALM_NAME, value);
	}

	//
	public java.lang.String getRealmName() {
		return (java.lang.String)this.getValue(REALM_NAME);
	}

	// This attribute is optional
	public void setRealmNameId(java.lang.String value) {
		// Make sure we've got a place to put this attribute.
		if (size(REALM_NAME) == 0) {
			setValue(REALM_NAME, "");
		}
		setAttributeValue(REALM_NAME, "Id", value);
	}

	//
	public java.lang.String getRealmNameId() {
		// If our element does not exist, then the attribute does not exist.
		if (size(REALM_NAME) == 0) {
			return null;
		} else {
			return getAttributeValue(REALM_NAME, "Id");
		}
	}

	// This attribute is optional
	public void setFormLoginConfig(
            org.netbeans.modules.j2ee.dd.api.web.FormLoginConfig
         valueInterface) {
		FormLoginConfig value = (FormLoginConfig) valueInterface;
		this.setValue(FORM_LOGIN_CONFIG, value);
	}

	//
	public 
            org.netbeans.modules.j2ee.dd.api.web.FormLoginConfig
         getFormLoginConfig() {
		return (FormLoginConfig)this.getValue(FORM_LOGIN_CONFIG);
	}

	/**
	 * Create a new bean using it's default constructor.
	 * This does not add it to any bean graph.
	 */
	public org.netbeans.modules.j2ee.dd.api.web.FormLoginConfig newFormLoginConfig() {
		return new FormLoginConfig();
	}

	//
	public static void addComparator(org.netbeans.modules.schema2beans.BeanComparator c) {
		comparators.add(c);
	}

	//
	public static void removeComparator(org.netbeans.modules.schema2beans.BeanComparator c) {
		comparators.remove(c);
	}
	public void validate() throws org.netbeans.modules.schema2beans.ValidateException {
		boolean restrictionFailure = false;
		boolean restrictionPassed = false;
		// Validating property id
		if (getId() != null) {
			// has whitespace restriction
			if (restrictionFailure) {
				throw new org.netbeans.modules.schema2beans.ValidateException("getId() whiteSpace (collapse)", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "id", this);	// NOI18N
			}
		}
		// Validating property authMethod
		// Validating property realmName
		if (getRealmName() != null) {
			// has whitespace restriction
			if (restrictionFailure) {
				throw new org.netbeans.modules.schema2beans.ValidateException("getRealmName() whiteSpace (collapse)", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "realmName", this);	// NOI18N
			}
		}
		// Validating property realmNameId
		if (getRealmNameId() != null) {
			// has whitespace restriction
			if (restrictionFailure) {
				throw new org.netbeans.modules.schema2beans.ValidateException("getRealmNameId() whiteSpace (collapse)", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "realmNameId", this);	// NOI18N
			}
		}
		// Validating property formLoginConfig
		if (getFormLoginConfig() != null) {
			((FormLoginConfig)getFormLoginConfig()).validate();
		}
	}

	// Dump the content of this bean returning it as a String
	public void dump(StringBuffer str, String indent){
		String s;
		Object o;
		org.netbeans.modules.schema2beans.BaseBean n;
		str.append(indent);
		str.append("AuthMethod");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append("<");	// NOI18N
		o = this.getAuthMethod();
		str.append((o==null?"null":o.toString().trim()));	// NOI18N
		str.append(">\n");	// NOI18N
		this.dumpAttributes(AUTH_METHOD, 0, str, indent);

		str.append(indent);
		str.append("RealmName");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append("<");	// NOI18N
		o = this.getRealmName();
		str.append((o==null?"null":o.toString().trim()));	// NOI18N
		str.append(">\n");	// NOI18N
		this.dumpAttributes(REALM_NAME, 0, str, indent);

		str.append(indent);
		str.append("FormLoginConfig");	// NOI18N
		n = (org.netbeans.modules.schema2beans.BaseBean) this.getFormLoginConfig();
		if (n != null)
			n.dump(str, indent + "\t");	// NOI18N
		else
			str.append(indent+"\tnull");	// NOI18N
		this.dumpAttributes(FORM_LOGIN_CONFIG, 0, str, indent);

	}
	public String dumpBeanNode(){
		StringBuffer str = new StringBuffer();
		str.append("LoginConfig\n");	// NOI18N
		this.dump(str, "\n  ");	// NOI18N
		return str.toString();
	}}

// END_NOI18N


/*
		The following schema file has been used for generation:

<?xml version="1.0" encoding="UTF-8"?>
<!--

    Copyright (c) 2009, 2021 Oracle and/or its affiliates and others.
    All rights reserved.

    This program and the accompanying materials are made available under the
    terms of the Eclipse Public License v. 2.0, which is available at
    http://www.eclipse.org/legal/epl-2.0.

    This Source Code may also be made available under the following Secondary
    Licenses when the conditions for such availability set forth in the
    Eclipse Public License v. 2.0 are satisfied: GNU General Public License,
    version 2 with the GNU Classpath Exception, which is available at
    https://www.gnu.org/software/classpath/license.html.

    SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0

-->

<xsd:schema xmlns="http://www.w3.org/2001/XMLSchema"
            targetNamespace="https://jakarta.ee/xml/ns/jakartaee"
            xmlns:jakartaee="https://jakarta.ee/xml/ns/jakartaee"
            xmlns:xsd="http://www.w3.org/2001/XMLSchema"
            elementFormDefault="qualified"
            attributeFormDefault="unqualified"
            version="6.0">

  <xsd:annotation>
    <xsd:documentation>
      <xi:include xmlns:xi="http://www.w3.org/2001/XInclude" href="license.inc" parse="text"/>
    </xsd:documentation>
  </xsd:annotation>

  <xsd:annotation>
    <xsd:documentation>
      <![CDATA[

        This is the XML Schema for the Servlet 6.0 deployment descriptor.
        The deployment descriptor must be named "WEB-INF/web.xml" in the
        web application's war file.  All Servlet deployment descriptors
        must indicate the web application schema by using the Jakarta EE
        namespace:

        https://jakarta.ee/xml/ns/jakartaee

        and by indicating the version of the schema by
        using the version element as shown below:

            <web-app xmlns="https://jakarta.ee/xml/ns/jakartaee"
              xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
              xsi:schemaLocation="..."
              version="6.0">
              ...
            </web-app>

        The instance documents may indicate the published version of
        the schema using the xsi:schemaLocation attribute for Jakarta EE
        namespace with the following location:

        https://jakarta.ee/xml/ns/jakartaee/web-app_6_0.xsd

        ]]>
    </xsd:documentation>
  </xsd:annotation>

  <xsd:annotation>
    <xsd:documentation>
      <xi:include xmlns:xi="http://www.w3.org/2001/XInclude" href="common.inc" parse="text"/>
    </xsd:documentation>
  </xsd:annotation>

  <!-- **************************************************** -->

  <xsd:include schemaLocation="web-common_6_0.xsd"/>

  <!-- **************************************************** -->

  <xsd:element name="web-app" type="jakartaee:web-appType">
    <xsd:annotation>
      <xsd:documentation>

        The web-app element is the root of the deployment
        descriptor for a web application.  Note that the sub-elements
        of this element can be in the arbitrary order. Because of
        that, the multiplicity of the elements of distributable,
        session-config, welcome-file-list, jsp-config, login-config,
        and locale-encoding-mapping-list was changed from "?" to "*"
        in this schema.  However, the deployment descriptor instance
        file must not contain multiple elements of session-config,
        jsp-config, and login-config. When there are multiple elements of
        welcome-file-list or locale-encoding-mapping-list, the container
        must concatenate the element contents.  The multiple occurence
        of the element distributable is redundant and the container
        treats that case exactly in the same way when there is only
        one distributable.

      </xsd:documentation>
    </xsd:annotation>

    <xsd:unique name="web-common-servlet-name-uniqueness">
      <xsd:annotation>
        <xsd:documentation>

          The servlet element contains the name of a servlet.
          The name must be unique within the web application.

        </xsd:documentation>
      </xsd:annotation>
      <xsd:selector xpath="jakartaee:servlet"/>
      <xsd:field    xpath="jakartaee:servlet-name"/>
    </xsd:unique>

    <xsd:unique name="web-common-filter-name-uniqueness">
      <xsd:annotation>
        <xsd:documentation>

          The filter element contains the name of a filter.
          The name must be unique within the web application.

        </xsd:documentation>
      </xsd:annotation>
      <xsd:selector xpath="jakartaee:filter"/>
      <xsd:field    xpath="jakartaee:filter-name"/>
    </xsd:unique>

    <xsd:unique name="web-common-ejb-local-ref-name-uniqueness">
      <xsd:annotation>
        <xsd:documentation>

          The ejb-local-ref-name element contains the name of an 
          enterprise bean reference. The enterprise 
          bean reference is an entry in the web
          application's environment and is relative to the
          java:comp/env context.  The name must be unique within
          the web application.

          It is recommended that name is prefixed with "ejb/".

        </xsd:documentation>
      </xsd:annotation>
      <xsd:selector xpath="jakartaee:ejb-local-ref"/>
      <xsd:field    xpath="jakartaee:ejb-ref-name"/>
    </xsd:unique>

    <xsd:unique name="web-common-ejb-ref-name-uniqueness">
      <xsd:annotation>
        <xsd:documentation>

          The ejb-ref-name element contains the name of an 
          enterprise bean reference. The enterprise bean 
          reference is an entry in the web application's environment 
          and is relative to the java:comp/env context.  
          The name must be unique within the web application.

          It is recommended that name is prefixed with "ejb/".

        </xsd:documentation>
      </xsd:annotation>
      <xsd:selector xpath="jakartaee:ejb-ref"/>
      <xsd:field    xpath="jakartaee:ejb-ref-name"/>
    </xsd:unique>

    <xsd:unique name="web-common-resource-env-ref-uniqueness">
      <xsd:annotation>
        <xsd:documentation>

          The resource-env-ref-name element specifies the name of
          a resource environment reference; its value is the
          environment entry name used in the web application code.
          The name is a JNDI name relative to the java:comp/env
          context and must be unique within a web application.

        </xsd:documentation>
      </xsd:annotation>
      <xsd:selector xpath="jakartaee:resource-env-ref"/>
      <xsd:field    xpath="jakartaee:resource-env-ref-name"/>
    </xsd:unique>

    <xsd:unique name="web-common-message-destination-ref-uniqueness">
      <xsd:annotation>
        <xsd:documentation>

          The message-destination-ref-name element specifies the name of
          a message destination reference; its value is the
          environment entry name used in the web application code.
          The name is a JNDI name relative to the java:comp/env
          context and must be unique within a web application.

        </xsd:documentation>
      </xsd:annotation>
      <xsd:selector xpath="jakartaee:message-destination-ref"/>
      <xsd:field    xpath="jakartaee:message-destination-ref-name"/>
    </xsd:unique>


    <xsd:unique name="web-common-res-ref-name-uniqueness">
      <xsd:annotation>
        <xsd:documentation>

          The res-ref-name element specifies the name of a
          resource manager connection factory reference.  The name
          is a JNDI name relative to the java:comp/env context.
          The name must be unique within a web application.

        </xsd:documentation>
      </xsd:annotation>
      <xsd:selector xpath="jakartaee:resource-ref"/>
      <xsd:field    xpath="jakartaee:res-ref-name"/>
    </xsd:unique>

    <xsd:unique name="web-common-env-entry-name-uniqueness">
      <xsd:annotation>
        <xsd:documentation>

          The env-entry-name element contains the name of a web
          application's environment entry.  The name is a JNDI
          name relative to the java:comp/env context.  The name
          must be unique within a web application.

        </xsd:documentation>
      </xsd:annotation>

      <xsd:selector xpath="jakartaee:env-entry"/>
      <xsd:field    xpath="jakartaee:env-entry-name"/>
    </xsd:unique>

    <xsd:key name="web-common-role-name-key">
      <xsd:annotation>
        <xsd:documentation>

          A role-name-key is specified to allow the references
          from the security-role-refs.

        </xsd:documentation>
      </xsd:annotation>
      <xsd:selector xpath="jakartaee:security-role"/>
      <xsd:field    xpath="jakartaee:role-name"/>
    </xsd:key>

    <xsd:keyref name="web-common-role-name-references"
                refer="jakartaee:web-common-role-name-key">
      <xsd:annotation>
        <xsd:documentation>

          The keyref indicates the references from
          security-role-ref to a specified role-name.

        </xsd:documentation>
      </xsd:annotation>
      <xsd:selector xpath="jakartaee:servlet/jakartaee:security-role-ref"/>
      <xsd:field    xpath="jakartaee:role-link"/>
    </xsd:keyref>
  </xsd:element>

<!-- **************************************************** -->

  <xsd:complexType name="web-appType">
    <xsd:choice minOccurs="0"
                maxOccurs="unbounded">
      <xsd:element name="module-name"
                   type="jakartaee:string"
                   minOccurs="0"/>
      <xsd:group ref="jakartaee:web-commonType"/>
      <xsd:element name="default-context-path" type="jakartaee:string">
        <xsd:annotation>
          <xsd:documentation>

            When specified, this element provides a default context path
            of the web application. An empty value for this element must cause
            the web application to be deployed at the root for the container.
            Otherwise, the default context path must start with
            a "/" character but not end with a "/" character.
            Servlet containers may provide vendor specific configuration
            options that allows specifying a value that overrides the value
            specified here.

          </xsd:documentation>
        </xsd:annotation>
      </xsd:element>
      <xsd:element name="request-character-encoding" type="jakartaee:string">
        <xsd:annotation>
          <xsd:documentation>

            When specified, this element provides a default request
            character encoding of the web application.

          </xsd:documentation>
        </xsd:annotation>
      </xsd:element>
      <xsd:element name="response-character-encoding" type="jakartaee:string">
        <xsd:annotation>
          <xsd:documentation>

            When specified, this element provides a default response
            character encoding of the web application.

          </xsd:documentation>
        </xsd:annotation>
      </xsd:element>
      <xsd:element name="deny-uncovered-http-methods" type="jakartaee:emptyType">
        <xsd:annotation>
          <xsd:documentation>

            When specified, this element causes uncovered http methods
            to be denied. For every url-pattern that is the target of a
            security-constrant, this element causes all HTTP methods that
            are NOT covered (by a security constraint) at the url-pattern
            to be denied.

          </xsd:documentation>
        </xsd:annotation>
      </xsd:element>
      <xsd:element name="absolute-ordering"
                   type="jakartaee:absoluteOrderingType"/>
    </xsd:choice>
    <xsd:attributeGroup ref="jakartaee:web-common-attributes"/>
  </xsd:complexType>

<!-- **************************************************** -->

  <xsd:complexType name="absoluteOrderingType">
    <xsd:annotation>
      <xsd:documentation>

        Please see section 8.2.2 of the specification for details.

      </xsd:documentation>
    </xsd:annotation>
    <xsd:choice minOccurs="0"
                maxOccurs="unbounded">
      <xsd:element name="name"
                   type="jakartaee:java-identifierType"
                   minOccurs="0"
                   maxOccurs="unbounded"/>
      <xsd:element name="others"
                   type="jakartaee:ordering-othersType"
                   minOccurs="0"
                   maxOccurs="1"/>
    </xsd:choice>
  </xsd:complexType>

</xsd:schema>
*/
