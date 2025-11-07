/**
 *	This generated bean class FilterMapping matches the schema element 'filter-mappingType'.
 *  The root bean class is WebApp
 *
 *	===============================================================
 *	
 *	
 *	        Declaration of the filter mappings in this web
 *	        application is done by using filter-mappingType.
 *	        The container uses the filter-mapping
 *	        declarations to decide which filters to apply to a request,
 *	        and in what order. The container matches the request URI to
 *	        a Servlet in the normal way. To determine which filters to
 *	        apply it matches filter-mapping declarations either on
 *	        servlet-name, or on url-pattern for each filter-mapping
 *	        element, depending on which style is used. The order in
 *	        which filters are invoked is the order in which
 *	        filter-mapping declarations that match a request URI for a
 *	        servlet appear in the list of filter-mapping elements.The
 *	        filter-name value must be the value of the filter-name
 *	        sub-elements of one of the filter declarations in the
 *	        deployment descriptor.
 *	
 *	      
 *	===============================================================
 * @Generated
 */

package org.netbeans.modules.j2ee.dd.impl.web.model_6_1;

import org.w3c.dom.*;
import org.netbeans.modules.schema2beans.*;
import java.beans.*;
import java.util.*;

// BEGIN_NOI18N

public class FilterMapping extends org.netbeans.modules.schema2beans.BaseBean
	 implements 
            org.netbeans.modules.j2ee.dd.api.web.FilterMapping
        
{

	static Vector comparators = new Vector();
	private static final org.netbeans.modules.schema2beans.Version runtimeVersion = new org.netbeans.modules.schema2beans.Version(5, 0, 0);
	;	// NOI18N

	static public final String ID = "Id";	// NOI18N
	static public final String FILTER_NAME = "FilterName";	// NOI18N
	static public final String URL_PATTERN = "UrlPattern";	// NOI18N
	static public final String SERVLET_NAME = "ServletName";	// NOI18N
	static public final String DISPATCHER = "Dispatcher";	// NOI18N

	public FilterMapping() {
		this(Common.USE_DEFAULT_VALUES);
	}

	public FilterMapping(int options)
	{
		super(comparators, runtimeVersion);
		// Properties (see root bean comments for the bean graph)
		initPropertyTables(4);
		this.createProperty("filter-name", 	// NOI18N
			FILTER_NAME, 
			Common.TYPE_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
		this.createProperty("url-pattern", 	// NOI18N
			URL_PATTERN, Common.SEQUENCE_OR | 
			Common.TYPE_1_N | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
		this.createProperty("servlet-name", 	// NOI18N
			SERVLET_NAME, Common.SEQUENCE_OR | 
			Common.TYPE_1_N | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
		this.createProperty("dispatcher", 	// NOI18N
			DISPATCHER, 
			Common.TYPE_0_N | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
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

	// This attribute is mandatory
	public void setFilterName(java.lang.String value) {
		this.setValue(FILTER_NAME, value);
	}

	//
	public java.lang.String getFilterName() {
		return (java.lang.String)this.getValue(FILTER_NAME);
	}

	// This attribute is an array containing at least one element
	public void setUrlPattern(int index, java.lang.String value) {
		this.setValue(URL_PATTERN, index, value);
	}

	//
	public java.lang.String getUrlPattern(int index) {
		return (java.lang.String)this.getValue(URL_PATTERN, index);
	}

	// Return the number of properties
	public int sizeUrlPattern() {
		return this.size(URL_PATTERN);
	}

	// This attribute is an array containing at least one element
	public void setUrlPatterns(java.lang.String[] value) {
		this.setValue(URL_PATTERN, value);
	}

	//
	public java.lang.String[] getUrlPatterns() {
		return (java.lang.String[])this.getValues(URL_PATTERN);
	}

	// Add a new element returning its index in the list
	public int addUrlPattern(java.lang.String value) {
		int positionOfNewItem = this.addValue(URL_PATTERN, value);
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeUrlPattern(java.lang.String value) {
		return this.removeValue(URL_PATTERN, value);
	}

	// This attribute is an array containing at least one element
	public void setServletName(int index, java.lang.String value) {
		this.setValue(SERVLET_NAME, index, value);
	}

	//
	public java.lang.String getServletName(int index) {
		return (java.lang.String)this.getValue(SERVLET_NAME, index);
	}

	// Return the number of properties
	public int sizeServletName() {
		return this.size(SERVLET_NAME);
	}

	// This attribute is an array containing at least one element
	public void setServletNames(java.lang.String[] value) {
		this.setValue(SERVLET_NAME, value);
	}

	//
	public java.lang.String[] getServletNames() {
		return (java.lang.String[])this.getValues(SERVLET_NAME);
	}

	// Add a new element returning its index in the list
	public int addServletName(java.lang.String value) {
		int positionOfNewItem = this.addValue(SERVLET_NAME, value);
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeServletName(java.lang.String value) {
		return this.removeValue(SERVLET_NAME, value);
	}

	// This attribute is an array, possibly empty
	public void setDispatcher(int index, java.lang.String value) {
		this.setValue(DISPATCHER, index, value);
	}

	//
	public java.lang.String getDispatcher(int index) {
		return (java.lang.String)this.getValue(DISPATCHER, index);
	}

	// Return the number of properties
	public int sizeDispatcher() {
		return this.size(DISPATCHER);
	}

	// This attribute is an array, possibly empty
	public void setDispatcher(java.lang.String[] value) {
		this.setValue(DISPATCHER, value);
	}

	//
	public java.lang.String[] getDispatcher() {
		return (java.lang.String[])this.getValues(DISPATCHER);
	}

	// Add a new element returning its index in the list
	public int addDispatcher(java.lang.String value) {
		int positionOfNewItem = this.addValue(DISPATCHER, value);
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeDispatcher(java.lang.String value) {
		return this.removeValue(DISPATCHER, value);
	}

	//
	public static void addComparator(org.netbeans.modules.schema2beans.BeanComparator c) {
		comparators.add(c);
	}

	//
	public static void removeComparator(org.netbeans.modules.schema2beans.BeanComparator c) {
		comparators.remove(c);
	}

	
            public String getServletName() {
                return this.sizeServletName() > 0 ? (String)this.getValue(SERVLET_NAME, 0) : null;
            }

            public void setServletName(String value) {
                setServletNames(value != null ? new String[]{value} : new String[]{});
            }

            public String getUrlPattern() {
                return this.sizeUrlPattern() > 0 ? (String)this.getValue(URL_PATTERN, 0) : null;
            }

            public void setUrlPattern(String value) {
                setUrlPatterns(value != null ? new String[]{value} : new String[]{});
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
		// Validating property filterName
		if (getFilterName() == null) {
			throw new org.netbeans.modules.schema2beans.ValidateException("getFilterName() == null", org.netbeans.modules.schema2beans.ValidateException.FailureType.NULL_VALUE, "filterName", this);	// NOI18N
		}
		if ((getFilterName()).length() < 1) {
			restrictionFailure = true;
		}
		if (restrictionFailure) {
			throw new org.netbeans.modules.schema2beans.ValidateException("getFilterName() minLength (1)", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "filterName", this);	// NOI18N
		}
		// Validating property urlPattern
		if (sizeUrlPattern() > 0) {
		}
		// Validating property servletName
		for (int _index = 0; _index < sizeServletName(); ++_index) {
			java.lang.String element = getServletName(_index);
			if (element != null) {
				if ((element).length() < 1) {
					restrictionFailure = true;
				}
				if (restrictionFailure) {
					throw new org.netbeans.modules.schema2beans.ValidateException("element minLength (1)", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "servletName", this);	// NOI18N
				}
			}
		}
		if (sizeServletName() > 0) {
		}
		// Validating property dispatcher
		if (sizeDispatcher() > 5) {
			restrictionFailure = true;
		}
		if (restrictionFailure) {
			throw new org.netbeans.modules.schema2beans.ValidateException("getDispatcher() maxOccurs (5)", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "dispatcher", this);	// NOI18N
		}
		for (int _index = 0; _index < sizeDispatcher(); ++_index) {
			java.lang.String element = getDispatcher(_index);
			if (element != null) {
				final java.lang.String[] enumRestrictionDispatcher = {"FORWARD", "INCLUDE", "REQUEST", "ASYNC", "ERROR"};
				restrictionFailure = true;
				for (int _index2 = 0; 
					_index2 < enumRestrictionDispatcher.length; ++_index2) {
					if (enumRestrictionDispatcher[_index2].equals(element)) {
						restrictionFailure = false;
						break;
					}
				}
				if (restrictionFailure) {
					throw new org.netbeans.modules.schema2beans.ValidateException("element enumeration test", org.netbeans.modules.schema2beans.ValidateException.FailureType.ENUM_RESTRICTION, "dispatcher", this);	// NOI18N
				}
			}
		}
		if (sizeUrlPattern() == 0) {
			throw new org.netbeans.modules.schema2beans.ValidateException("required properties: sizeUrlPattern() == 0", org.netbeans.modules.schema2beans.ValidateException.FailureType.NULL_VALUE, "UrlPattern", this);	// NOI18N
		}
		if (sizeServletName() == 0) {
			throw new org.netbeans.modules.schema2beans.ValidateException("required properties: sizeServletName() == 0", org.netbeans.modules.schema2beans.ValidateException.FailureType.NULL_VALUE, "ServletName", this);	// NOI18N
		}
	}

	// Dump the content of this bean returning it as a String
	public void dump(StringBuffer str, String indent){
		String s;
		Object o;
		org.netbeans.modules.schema2beans.BaseBean n;
		str.append(indent);
		str.append("FilterName");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append("<");	// NOI18N
		o = this.getFilterName();
		str.append((o==null?"null":o.toString().trim()));	// NOI18N
		str.append(">\n");	// NOI18N
		this.dumpAttributes(FILTER_NAME, 0, str, indent);

		str.append(indent);
		str.append("UrlPattern["+this.sizeUrlPattern()+"]");	// NOI18N
		for(int i=0; i<this.sizeUrlPattern(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			str.append(indent+"\t");	// NOI18N
			str.append("<");	// NOI18N
			o = this.getUrlPattern(i);
			str.append((o==null?"null":o.toString().trim()));	// NOI18N
			str.append(">\n");	// NOI18N
			this.dumpAttributes(URL_PATTERN, i, str, indent);
		}

		str.append(indent);
		str.append("ServletName["+this.sizeServletName()+"]");	// NOI18N
		for(int i=0; i<this.sizeServletName(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			str.append(indent+"\t");	// NOI18N
			str.append("<");	// NOI18N
			o = this.getServletName(i);
			str.append((o==null?"null":o.toString().trim()));	// NOI18N
			str.append(">\n");	// NOI18N
			this.dumpAttributes(SERVLET_NAME, i, str, indent);
		}

		str.append(indent);
		str.append("Dispatcher["+this.sizeDispatcher()+"]");	// NOI18N
		for(int i=0; i<this.sizeDispatcher(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			str.append(indent+"\t");	// NOI18N
			str.append("<");	// NOI18N
			o = this.getDispatcher(i);
			str.append((o==null?"null":o.toString().trim()));	// NOI18N
			str.append(">\n");	// NOI18N
			this.dumpAttributes(DISPATCHER, i, str, indent);
		}

	}
	public String dumpBeanNode(){
		StringBuffer str = new StringBuffer();
		str.append("FilterMapping\n");	// NOI18N
		this.dump(str, "\n  ");	// NOI18N
		return str.toString();
	}}

// END_NOI18N


/*
		The following schema file has been used for generation:

<?xml version="1.0" encoding="UTF-8"?>
<xsd:schema xmlns="http://www.w3.org/2001/XMLSchema"
            targetNamespace="https://jakarta.ee/xml/ns/jakartaee"
            xmlns:jakartaee="https://jakarta.ee/xml/ns/jakartaee"
            xmlns:xsd="http://www.w3.org/2001/XMLSchema"
            elementFormDefault="qualified"
            attributeFormDefault="unqualified"
            version="6.1">

  <xsd:annotation>
    <xsd:documentation>
        
      Copyright (c) 2009, 2023 Oracle and/or its affiliates and others.
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
        
    </xsd:documentation>
  </xsd:annotation>

  <xsd:annotation>
    <xsd:documentation>
      <![CDATA[

        This is the XML Schema for the Servlet 6.1 deployment descriptor.
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
              version="6.1">
              ...
            </web-app>

        The instance documents may indicate the published version of
        the schema using the xsi:schemaLocation attribute for Jakarta EE
        namespace with the following location:

        https://jakarta.ee/xml/ns/jakartaee/web-app_6_1.xsd

        ]]>
    </xsd:documentation>
  </xsd:annotation>

  <xsd:annotation>
    <xsd:documentation>

      The following conventions apply to all Jakarta EE
      deployment descriptor elements unless indicated otherwise.
      
      - In elements that specify a pathname to a file within the
      same JAR file, relative filenames (i.e., those not
      starting with "/") are considered relative to the root of
      the JAR file's namespace.  Absolute filenames (i.e., those
      starting with "/") also specify names in the root of the
      JAR file's namespace.  In general, relative names are
      preferred.  The exception is .war files where absolute
      names are preferred for consistency with the Servlet API.
      
    </xsd:documentation>
  </xsd:annotation>

  <!-- **************************************************** -->

  <xsd:include schemaLocation="web-common_6_1.xsd"/>

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
