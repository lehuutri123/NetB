/**
 *	This generated bean class WebResourceCollection matches the schema element 'web-resource-collectionType'.
 *  The root bean class is WebApp
 *
 *	===============================================================
 *	
 *	
 *	        The web-resource-collectionType is used to identify the
 *	        resources and HTTP methods on those resources to which a
 *	        security constraint applies. If no HTTP methods are specified,
 *	        then the security constraint applies to all HTTP methods.
 *	        If HTTP methods are specified by http-method-omission
 *	        elements, the security constraint applies to all methods
 *	        except those identified in the collection.
 *	        http-method-omission and http-method elements are never
 *	        mixed in the same collection.
 *	
 *	        Used in: security-constraint
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

public class WebResourceCollection extends org.netbeans.modules.j2ee.dd.impl.common.DescriptionBeanMultiple
	 implements 
            org.netbeans.modules.j2ee.dd.api.web.WebResourceCollection, org.netbeans.modules.j2ee.dd.impl.common.KeyBean
        
{

	static Vector comparators = new Vector();
	private static final org.netbeans.modules.schema2beans.Version runtimeVersion = new org.netbeans.modules.schema2beans.Version(5, 0, 0);
	;	// NOI18N

	static public final String ID = "Id";	// NOI18N
	static public final String WEB_RESOURCE_NAME = "WebResourceName";	// NOI18N
	static public final String WEBRESOURCENAMEID = "WebResourceNameId";	// NOI18N
	static public final String DESCRIPTION = "Description";	// NOI18N
	static public final String DESCRIPTIONID = "DescriptionId";	// NOI18N
	static public final String DESCRIPTIONXMLLANG = "DescriptionXmlLang";	// NOI18N
	static public final String URL_PATTERN = "UrlPattern";	// NOI18N
	static public final String HTTP_METHOD = "HttpMethod";	// NOI18N
	static public final String HTTP_METHOD_OMISSION = "HttpMethodOmission";	// NOI18N

	public WebResourceCollection() {
		this(Common.USE_DEFAULT_VALUES);
	}

	public WebResourceCollection(int options)
	{
		super(comparators, runtimeVersion);
		// Properties (see root bean comments for the bean graph)
		initPropertyTables(5);
		this.createProperty("web-resource-name", 	// NOI18N
			WEB_RESOURCE_NAME, 
			Common.TYPE_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
		this.createAttribute(WEB_RESOURCE_NAME, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("description", 	// NOI18N
			DESCRIPTION, 
			Common.TYPE_0_N | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
		this.createAttribute(DESCRIPTION, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createAttribute(DESCRIPTION, "xml:lang", "XmlLang", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("url-pattern", 	// NOI18N
			URL_PATTERN, 
			Common.TYPE_1_N | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
		this.createProperty("http-method", 	// NOI18N
			HTTP_METHOD, Common.SEQUENCE_OR | 
			Common.TYPE_1_N | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
		this.createProperty("http-method-omission", 	// NOI18N
			HTTP_METHOD_OMISSION, Common.SEQUENCE_OR | 
			Common.TYPE_1_N | Common.TYPE_STRING | Common.TYPE_KEY, 
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
	public void setWebResourceName(java.lang.String value) {
		this.setValue(WEB_RESOURCE_NAME, value);
	}

	//
	public java.lang.String getWebResourceName() {
		return (java.lang.String)this.getValue(WEB_RESOURCE_NAME);
	}

	// This attribute is optional
	public void setWebResourceNameId(java.lang.String value) {
		// Make sure we've got a place to put this attribute.
		if (size(WEB_RESOURCE_NAME) == 0) {
			setValue(WEB_RESOURCE_NAME, "");
		}
		setAttributeValue(WEB_RESOURCE_NAME, "Id", value);
	}

	//
	public java.lang.String getWebResourceNameId() {
		// If our element does not exist, then the attribute does not exist.
		if (size(WEB_RESOURCE_NAME) == 0) {
			return null;
		} else {
			return getAttributeValue(WEB_RESOURCE_NAME, "Id");
		}
	}

	// This attribute is an array, possibly empty
	public void setDescription(int index, java.lang.String value) {
		this.setValue(DESCRIPTION, index, value);
	}

	//
	public java.lang.String getDescription(int index) {
		return (java.lang.String)this.getValue(DESCRIPTION, index);
	}

	// Return the number of properties
	public int sizeDescription() {
		return this.size(DESCRIPTION);
	}

	// This attribute is an array, possibly empty
	public void setDescription(java.lang.String[] value) {
		this.setValue(DESCRIPTION, value);
	}

	//
	public java.lang.String[] getDescription() {
		return (java.lang.String[])this.getValues(DESCRIPTION);
	}

	// Add a new element returning its index in the list
	public int addDescription(java.lang.String value) {
		int positionOfNewItem = this.addValue(DESCRIPTION, value);
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeDescription(java.lang.String value) {
		return this.removeValue(DESCRIPTION, value);
	}

	// This attribute is an array, possibly empty
	public void setDescriptionId(int index, java.lang.String value) {
		// Make sure we've got a place to put this attribute.
		if (size(DESCRIPTION) == 0) {
			addValue(DESCRIPTION, "");
		}
		setAttributeValue(DESCRIPTION, index, "Id", value);
	}

	//
	public java.lang.String getDescriptionId(int index) {
		// If our element does not exist, then the attribute does not exist.
		if (size(DESCRIPTION) == 0) {
			return null;
		} else {
			return getAttributeValue(DESCRIPTION, index, "Id");
		}
	}

	// Return the number of properties
	public int sizeDescriptionId() {
		return this.size(DESCRIPTION);
	}

	// This attribute is an array, possibly empty
	public void setDescriptionXmlLang(int index, java.lang.String value) {
		// Make sure we've got a place to put this attribute.
		if (size(DESCRIPTION) == 0) {
			addValue(DESCRIPTION, "");
		}
		setAttributeValue(DESCRIPTION, index, "XmlLang", value);
	}

	//
	public java.lang.String getDescriptionXmlLang(int index) {
		// If our element does not exist, then the attribute does not exist.
		if (size(DESCRIPTION) == 0) {
			return null;
		} else {
			return getAttributeValue(DESCRIPTION, index, "XmlLang");
		}
	}

	// Return the number of properties
	public int sizeDescriptionXmlLang() {
		return this.size(DESCRIPTION);
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
	public void setUrlPattern(java.lang.String[] value) {
		this.setValue(URL_PATTERN, value);
	}

	//
	public java.lang.String[] getUrlPattern() {
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
	public void setHttpMethod(int index, java.lang.String value) {
		this.setValue(HTTP_METHOD, index, value);
	}

	//
	public java.lang.String getHttpMethod(int index) {
		return (java.lang.String)this.getValue(HTTP_METHOD, index);
	}

	// Return the number of properties
	public int sizeHttpMethod() {
		return this.size(HTTP_METHOD);
	}

	// This attribute is an array containing at least one element
	public void setHttpMethod(java.lang.String[] value) {
		this.setValue(HTTP_METHOD, value);
		if (value != null && value.length > 0) {
			// It's a mutually exclusive property.
			setHttpMethodOmission(null);
		}
	}

	//
	public java.lang.String[] getHttpMethod() {
		return (java.lang.String[])this.getValues(HTTP_METHOD);
	}

	// Add a new element returning its index in the list
	public int addHttpMethod(java.lang.String value) {
		int positionOfNewItem = this.addValue(HTTP_METHOD, value);
		if (positionOfNewItem == 0) {
			// It's a mutually exclusive property.
			setHttpMethodOmission(null);
		}
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeHttpMethod(java.lang.String value) {
		return this.removeValue(HTTP_METHOD, value);
	}

	// This attribute is an array containing at least one element
	public void setHttpMethodOmission(int index, java.lang.String value) {
		this.setValue(HTTP_METHOD_OMISSION, index, value);
	}

	//
	public java.lang.String getHttpMethodOmission(int index) {
		return (java.lang.String)this.getValue(HTTP_METHOD_OMISSION, index);
	}

	// Return the number of properties
	public int sizeHttpMethodOmission() {
		return this.size(HTTP_METHOD_OMISSION);
	}

	// This attribute is an array containing at least one element
	public void setHttpMethodOmission(java.lang.String[] value) {
		this.setValue(HTTP_METHOD_OMISSION, value);
		if (value != null && value.length > 0) {
			// It's a mutually exclusive property.
			setHttpMethod(null);
		}
	}

	//
	public java.lang.String[] getHttpMethodOmission() {
		return (java.lang.String[])this.getValues(HTTP_METHOD_OMISSION);
	}

	// Add a new element returning its index in the list
	public int addHttpMethodOmission(java.lang.String value) {
		int positionOfNewItem = this.addValue(HTTP_METHOD_OMISSION, value);
		if (positionOfNewItem == 0) {
			// It's a mutually exclusive property.
			setHttpMethod(null);
		}
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeHttpMethodOmission(java.lang.String value) {
		return this.removeValue(HTTP_METHOD_OMISSION, value);
	}

	//
	public static void addComparator(org.netbeans.modules.schema2beans.BeanComparator c) {
		comparators.add(c);
	}

	//
	public static void removeComparator(org.netbeans.modules.schema2beans.BeanComparator c) {
		comparators.remove(c);
	}

	
            public String getKeyProperty() { return "WebResourceName"; }
        
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
		// Validating property webResourceName
		if (getWebResourceName() == null) {
			throw new org.netbeans.modules.schema2beans.ValidateException("getWebResourceName() == null", org.netbeans.modules.schema2beans.ValidateException.FailureType.NULL_VALUE, "webResourceName", this);	// NOI18N
		}
		// has whitespace restriction
		if (restrictionFailure) {
			throw new org.netbeans.modules.schema2beans.ValidateException("getWebResourceName() whiteSpace (collapse)", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "webResourceName", this);	// NOI18N
		}
		// Validating property webResourceNameId
		if (getWebResourceNameId() != null) {
			// has whitespace restriction
			if (restrictionFailure) {
				throw new org.netbeans.modules.schema2beans.ValidateException("getWebResourceNameId() whiteSpace (collapse)", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "webResourceNameId", this);	// NOI18N
			}
		}
		// Validating property description
		// Validating property descriptionId
		// Validating property descriptionXmlLang
		// Validating property urlPattern
		if (sizeUrlPattern() == 0) {
			throw new org.netbeans.modules.schema2beans.ValidateException("sizeUrlPattern() == 0", org.netbeans.modules.schema2beans.ValidateException.FailureType.NULL_VALUE, "urlPattern", this);	// NOI18N
		}
		// Validating property httpMethod
		for (int _index = 0; _index < sizeHttpMethod(); ++_index) {
			java.lang.String element = getHttpMethod(_index);
			if (element != null) {
				{
					boolean patternPassed = false;
					if ((element).matches("[!-~-[\\(\\)<>@,;:\"/\\[\\]?=\\{\\}\\\\\\p{Z}]]+")) {
						patternPassed = true;
					}
					restrictionFailure = !patternPassed;
				}
				if (restrictionFailure) {
					throw new org.netbeans.modules.schema2beans.ValidateException("element", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "httpMethod", this);	// NOI18N
				}
			}
		}
		// Validating property httpMethodOmission
		for (int _index = 0; _index < sizeHttpMethodOmission(); ++_index) {
			java.lang.String element = getHttpMethodOmission(_index);
			if (element != null) {
				{
					boolean patternPassed = false;
					if ((element).matches("[!-~-[\\(\\)<>@,;:\"/\\[\\]?=\\{\\}\\\\\\p{Z}]]+")) {
						patternPassed = true;
					}
					restrictionFailure = !patternPassed;
				}
				if (restrictionFailure) {
					throw new org.netbeans.modules.schema2beans.ValidateException("element", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "httpMethodOmission", this);	// NOI18N
				}
			}
		}
	}

	// Dump the content of this bean returning it as a String
	public void dump(StringBuffer str, String indent){
		String s;
		Object o;
		org.netbeans.modules.schema2beans.BaseBean n;
		str.append(indent);
		str.append("WebResourceName");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append("<");	// NOI18N
		o = this.getWebResourceName();
		str.append((o==null?"null":o.toString().trim()));	// NOI18N
		str.append(">\n");	// NOI18N
		this.dumpAttributes(WEB_RESOURCE_NAME, 0, str, indent);

		str.append(indent);
		str.append("Description["+this.sizeDescription()+"]");	// NOI18N
		for(int i=0; i<this.sizeDescription(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			str.append(indent+"\t");	// NOI18N
			str.append("<");	// NOI18N
			o = this.getDescription(i);
			str.append((o==null?"null":o.toString().trim()));	// NOI18N
			str.append(">\n");	// NOI18N
			this.dumpAttributes(DESCRIPTION, i, str, indent);
		}

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
		str.append("HttpMethod["+this.sizeHttpMethod()+"]");	// NOI18N
		for(int i=0; i<this.sizeHttpMethod(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			str.append(indent+"\t");	// NOI18N
			str.append("<");	// NOI18N
			o = this.getHttpMethod(i);
			str.append((o==null?"null":o.toString().trim()));	// NOI18N
			str.append(">\n");	// NOI18N
			this.dumpAttributes(HTTP_METHOD, i, str, indent);
		}

		str.append(indent);
		str.append("HttpMethodOmission["+this.sizeHttpMethodOmission()+"]");	// NOI18N
		for(int i=0; i<this.sizeHttpMethodOmission(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			str.append(indent+"\t");	// NOI18N
			str.append("<");	// NOI18N
			o = this.getHttpMethodOmission(i);
			str.append((o==null?"null":o.toString().trim()));	// NOI18N
			str.append(">\n");	// NOI18N
			this.dumpAttributes(HTTP_METHOD_OMISSION, i, str, indent);
		}

	}
	public String dumpBeanNode(){
		StringBuffer str = new StringBuffer();
		str.append("WebResourceCollection\n");	// NOI18N
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
