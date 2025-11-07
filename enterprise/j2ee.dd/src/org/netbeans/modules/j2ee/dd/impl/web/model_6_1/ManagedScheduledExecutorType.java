/**
 *	This generated bean class ManagedScheduledExecutorType matches the schema element 'managed-scheduled-executorType'.
 *  The root bean class is WebApp
 *
 *	===============================================================
 *	
 *	
 *	        Configuration of a ManagedScheduledExecutorService.
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

public class ManagedScheduledExecutorType extends org.netbeans.modules.schema2beans.BaseBean
{

	static Vector comparators = new Vector();
	private static final org.netbeans.modules.schema2beans.Version runtimeVersion = new org.netbeans.modules.schema2beans.Version(5, 0, 0);
	;	// NOI18N

	static public final String ID = "Id";	// NOI18N
	static public final String DESCRIPTION = "Description";	// NOI18N
	static public final String DESCRIPTIONID = "DescriptionId";	// NOI18N
	static public final String DESCRIPTIONXMLLANG = "DescriptionXmlLang";	// NOI18N
	static public final String NAME = "Name";	// NOI18N
	static public final String CONTEXT_SERVICE_REF = "ContextServiceRef";	// NOI18N
	static public final String QUALIFIER = "Qualifier";	// NOI18N
	static public final String MAX_ASYNC = "MaxAsync";	// NOI18N
	static public final String MAXASYNCID = "MaxAsyncId";	// NOI18N
	static public final String HUNG_TASK_THRESHOLD = "HungTaskThreshold";	// NOI18N
	static public final String HUNGTASKTHRESHOLDID = "HungTaskThresholdId";	// NOI18N
	static public final String VIRTUAL = "Virtual";	// NOI18N
	static public final String PROPERTY2 = "Property2";	// NOI18N

	public ManagedScheduledExecutorType() {
		this(Common.USE_DEFAULT_VALUES);
	}

	public ManagedScheduledExecutorType(int options)
	{
		super(comparators, runtimeVersion);
		// Properties (see root bean comments for the bean graph)
		initPropertyTables(8);
		this.createProperty("description", 	// NOI18N
			DESCRIPTION, 
			Common.TYPE_0_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
		this.createAttribute(DESCRIPTION, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createAttribute(DESCRIPTION, "xml:lang", "XmlLang", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("name", 	// NOI18N
			NAME, 
			Common.TYPE_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
		this.createProperty("context-service-ref", 	// NOI18N
			CONTEXT_SERVICE_REF, 
			Common.TYPE_0_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
		this.createProperty("qualifier", 	// NOI18N
			QUALIFIER, 
			Common.TYPE_0_N | Common.TYPE_STRING | Common.TYPE_KEY, 
			java.lang.String.class);
		this.createProperty("max-async", 	// NOI18N
			MAX_ASYNC, 
			Common.TYPE_0_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
			Long.class);
		this.createAttribute(MAX_ASYNC, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("hung-task-threshold", 	// NOI18N
			HUNG_TASK_THRESHOLD, 
			Common.TYPE_0_1 | Common.TYPE_STRING | Common.TYPE_KEY, 
			Long.class);
		this.createAttribute(HUNG_TASK_THRESHOLD, "id", "Id", 
						AttrProp.CDATA | AttrProp.IMPLIED,
						null, null);
		this.createProperty("virtual", 	// NOI18N
			VIRTUAL, 
			Common.TYPE_0_1 | Common.TYPE_BOOLEAN | Common.TYPE_SHOULD_NOT_BE_EMPTY | Common.TYPE_KEY, 
			Boolean.class);
		this.createProperty("property", 	// NOI18N
			PROPERTY2, 
			Common.TYPE_0_N | Common.TYPE_BEAN | Common.TYPE_KEY, 
			PropertyType.class);
		this.createAttribute(PROPERTY2, "id", "Id", 
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
	public void setDescription(java.lang.String value) {
		this.setValue(DESCRIPTION, value);
	}

	//
	public java.lang.String getDescription() {
		return (java.lang.String)this.getValue(DESCRIPTION);
	}

	// This attribute is optional
	public void setDescriptionId(java.lang.String value) {
		// Make sure we've got a place to put this attribute.
		if (size(DESCRIPTION) == 0) {
			setValue(DESCRIPTION, "");
		}
		setAttributeValue(DESCRIPTION, "Id", value);
	}

	//
	public java.lang.String getDescriptionId() {
		// If our element does not exist, then the attribute does not exist.
		if (size(DESCRIPTION) == 0) {
			return null;
		} else {
			return getAttributeValue(DESCRIPTION, "Id");
		}
	}

	// This attribute is optional
	public void setDescriptionXmlLang(java.lang.String value) {
		// Make sure we've got a place to put this attribute.
		if (size(DESCRIPTION) == 0) {
			setValue(DESCRIPTION, "");
		}
		setAttributeValue(DESCRIPTION, "XmlLang", value);
	}

	//
	public java.lang.String getDescriptionXmlLang() {
		// If our element does not exist, then the attribute does not exist.
		if (size(DESCRIPTION) == 0) {
			return null;
		} else {
			return getAttributeValue(DESCRIPTION, "XmlLang");
		}
	}

	// This attribute is mandatory
	public void setName(java.lang.String value) {
		this.setValue(NAME, value);
	}

	//
	public java.lang.String getName() {
		return (java.lang.String)this.getValue(NAME);
	}

	// This attribute is optional
	public void setContextServiceRef(java.lang.String value) {
		this.setValue(CONTEXT_SERVICE_REF, value);
	}

	//
	public java.lang.String getContextServiceRef() {
		return (java.lang.String)this.getValue(CONTEXT_SERVICE_REF);
	}

	// This attribute is an array, possibly empty
	public void setQualifier(int index, java.lang.String value) {
		this.setValue(QUALIFIER, index, value);
	}

	//
	public java.lang.String getQualifier(int index) {
		return (java.lang.String)this.getValue(QUALIFIER, index);
	}

	// Return the number of properties
	public int sizeQualifier() {
		return this.size(QUALIFIER);
	}

	// This attribute is an array, possibly empty
	public void setQualifier(java.lang.String[] value) {
		this.setValue(QUALIFIER, value);
	}

	//
	public java.lang.String[] getQualifier() {
		return (java.lang.String[])this.getValues(QUALIFIER);
	}

	// Add a new element returning its index in the list
	public int addQualifier(java.lang.String value) {
		int positionOfNewItem = this.addValue(QUALIFIER, value);
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeQualifier(java.lang.String value) {
		return this.removeValue(QUALIFIER, value);
	}

	// This attribute is optional
	public void setMaxAsync(long value) {
		this.setValue(MAX_ASYNC, java.lang.Long.valueOf(value));
	}

	//
	public long getMaxAsync() {
		Long ret = (Long)this.getValue(MAX_ASYNC);
		if (ret == null)
			throw new RuntimeException(Common.getMessage(
				"NoValueForElt_msg",
				new Object[] {"MAX_ASYNC", "long"}));
		return ((java.lang.Long)ret).longValue();
	}

	// This attribute is optional
	public void setMaxAsyncId(java.lang.String value) {
		// Make sure we've got a place to put this attribute.
		if (size(MAX_ASYNC) == 0) {
			setValue(MAX_ASYNC, "");
		}
		setAttributeValue(MAX_ASYNC, "Id", value);
	}

	//
	public java.lang.String getMaxAsyncId() {
		// If our element does not exist, then the attribute does not exist.
		if (size(MAX_ASYNC) == 0) {
			return null;
		} else {
			return getAttributeValue(MAX_ASYNC, "Id");
		}
	}

	// This attribute is optional
	public void setHungTaskThreshold(long value) {
		this.setValue(HUNG_TASK_THRESHOLD, java.lang.Long.valueOf(value));
	}

	//
	public long getHungTaskThreshold() {
		Long ret = (Long)this.getValue(HUNG_TASK_THRESHOLD);
		if (ret == null)
			throw new RuntimeException(Common.getMessage(
				"NoValueForElt_msg",
				new Object[] {"HUNG_TASK_THRESHOLD", "long"}));
		return ((java.lang.Long)ret).longValue();
	}

	// This attribute is optional
	public void setHungTaskThresholdId(java.lang.String value) {
		// Make sure we've got a place to put this attribute.
		if (size(MAX_ASYNC) == 0) {
			setValue(MAX_ASYNC, "");
		}
		setAttributeValue(MAX_ASYNC, "Id", value);
	}

	//
	public java.lang.String getHungTaskThresholdId() {
		// If our element does not exist, then the attribute does not exist.
		if (size(MAX_ASYNC) == 0) {
			return null;
		} else {
			return getAttributeValue(MAX_ASYNC, "Id");
		}
	}

	// This attribute is optional
	public void setVirtual(boolean value) {
		this.setValue(VIRTUAL, (value ? java.lang.Boolean.TRUE : java.lang.Boolean.FALSE));
	}

	//
	public boolean isVirtual() {
		Boolean ret = (Boolean)this.getValue(VIRTUAL);
		if (ret == null)
			ret = (Boolean)Common.defaultScalarValue(Common.TYPE_BOOLEAN);
		return ((java.lang.Boolean)ret).booleanValue();
	}

	// This attribute is an array, possibly empty
	public void setProperty2(int index, PropertyType value) {
		this.setValue(PROPERTY2, index, value);
	}

	//
	public PropertyType getProperty2(int index) {
		return (PropertyType)this.getValue(PROPERTY2, index);
	}

	// Return the number of properties
	public int sizeProperty2() {
		return this.size(PROPERTY2);
	}

	// This attribute is an array, possibly empty
	public void setProperty2(PropertyType[] value) {
		this.setValue(PROPERTY2, value);
	}

	//
	public PropertyType[] getProperty2() {
		return (PropertyType[])this.getValues(PROPERTY2);
	}

	// Add a new element returning its index in the list
	public int addProperty2(org.netbeans.modules.j2ee.dd.impl.web.model_6_1.PropertyType value) {
		int positionOfNewItem = this.addValue(PROPERTY2, value);
		return positionOfNewItem;
	}

	//
	// Remove an element using its reference
	// Returns the index the element had in the list
	//
	public int removeProperty2(org.netbeans.modules.j2ee.dd.impl.web.model_6_1.PropertyType value) {
		return this.removeValue(PROPERTY2, value);
	}

	/**
	 * Create a new bean using it's default constructor.
	 * This does not add it to any bean graph.
	 */
	public PropertyType newPropertyType() {
		return new PropertyType();
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
		// Validating property description
		// Validating property descriptionId
		if (getDescriptionId() != null) {
			// has whitespace restriction
			if (restrictionFailure) {
				throw new org.netbeans.modules.schema2beans.ValidateException("getDescriptionId() whiteSpace (collapse)", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "descriptionId", this);	// NOI18N
			}
		}
		// Validating property descriptionXmlLang
		// Validating property name
		if (getName() == null) {
			throw new org.netbeans.modules.schema2beans.ValidateException("getName() == null", org.netbeans.modules.schema2beans.ValidateException.FailureType.NULL_VALUE, "name", this);	// NOI18N
		}
		// Validating property contextServiceRef
		// Validating property qualifier
		// Validating property maxAsync
		if (getMaxAsync() - 0L <= 0) {
			restrictionFailure = true;
		}
		if (restrictionFailure) {
			throw new org.netbeans.modules.schema2beans.ValidateException("getMaxAsync() minExclusive (0)", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "maxAsync", this);	// NOI18N
		}
		// Validating property maxAsyncId
		if (getMaxAsyncId() != null) {
			// has whitespace restriction
			if (restrictionFailure) {
				throw new org.netbeans.modules.schema2beans.ValidateException("getMaxAsyncId() whiteSpace (collapse)", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "maxAsyncId", this);	// NOI18N
			}
		}
		// Validating property hungTaskThreshold
		if (getHungTaskThreshold() - 0L <= 0) {
			restrictionFailure = true;
		}
		if (restrictionFailure) {
			throw new org.netbeans.modules.schema2beans.ValidateException("getHungTaskThreshold() minExclusive (0)", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "hungTaskThreshold", this);	// NOI18N
		}
		// Validating property hungTaskThresholdId
		if (getHungTaskThresholdId() != null) {
			// has whitespace restriction
			if (restrictionFailure) {
				throw new org.netbeans.modules.schema2beans.ValidateException("getHungTaskThresholdId() whiteSpace (collapse)", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "hungTaskThresholdId", this);	// NOI18N
			}
		}
		// Validating property virtual
		{
			boolean patternPassed = false;
			if ((isVirtual() ? "true" : "false").matches("(true|false)")) {
				patternPassed = true;
			}
			restrictionFailure = !patternPassed;
		}
		if (restrictionFailure) {
			throw new org.netbeans.modules.schema2beans.ValidateException("isVirtual()", org.netbeans.modules.schema2beans.ValidateException.FailureType.DATA_RESTRICTION, "virtual", this);	// NOI18N
		}
		// Validating property property2
		for (int _index = 0; _index < sizeProperty2(); ++_index) {
			org.netbeans.modules.j2ee.dd.impl.web.model_6_1.PropertyType element = getProperty2(_index);
			if (element != null) {
				element.validate();
			}
		}
	}

	// Dump the content of this bean returning it as a String
	public void dump(StringBuffer str, String indent){
		String s;
		Object o;
		org.netbeans.modules.schema2beans.BaseBean n;
		str.append(indent);
		str.append("Description");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append("<");	// NOI18N
		o = this.getDescription();
		str.append((o==null?"null":o.toString().trim()));	// NOI18N
		str.append(">\n");	// NOI18N
		this.dumpAttributes(DESCRIPTION, 0, str, indent);

		str.append(indent);
		str.append("Name");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append("<");	// NOI18N
		o = this.getName();
		str.append((o==null?"null":o.toString().trim()));	// NOI18N
		str.append(">\n");	// NOI18N
		this.dumpAttributes(NAME, 0, str, indent);

		str.append(indent);
		str.append("ContextServiceRef");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append("<");	// NOI18N
		o = this.getContextServiceRef();
		str.append((o==null?"null":o.toString().trim()));	// NOI18N
		str.append(">\n");	// NOI18N
		this.dumpAttributes(CONTEXT_SERVICE_REF, 0, str, indent);

		str.append(indent);
		str.append("Qualifier["+this.sizeQualifier()+"]");	// NOI18N
		for(int i=0; i<this.sizeQualifier(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			str.append(indent+"\t");	// NOI18N
			str.append("<");	// NOI18N
			o = this.getQualifier(i);
			str.append((o==null?"null":o.toString().trim()));	// NOI18N
			str.append(">\n");	// NOI18N
			this.dumpAttributes(QUALIFIER, i, str, indent);
		}

		if (this.getValue(MAX_ASYNC) != null) {
			str.append(indent);
			str.append("MaxAsync");	// NOI18N
			str.append(indent+"\t");	// NOI18N
			str.append("<");	// NOI18N
			s = String.valueOf(this.getMaxAsync());
			str.append((s.trim()));	// NOI18N
			str.append(">\n");	// NOI18N
			this.dumpAttributes(MAX_ASYNC, 0, str, indent);
		}

		if (this.getValue(HUNG_TASK_THRESHOLD) != null) {
			str.append(indent);
			str.append("HungTaskThreshold");	// NOI18N
			str.append(indent+"\t");	// NOI18N
			str.append("<");	// NOI18N
			s = String.valueOf(this.getHungTaskThreshold());
			str.append((s.trim()));	// NOI18N
			str.append(">\n");	// NOI18N
			this.dumpAttributes(HUNG_TASK_THRESHOLD, 0, str, indent);
		}

		str.append(indent);
		str.append("Virtual");	// NOI18N
		str.append(indent+"\t");	// NOI18N
		str.append((this.isVirtual()?"true":"false"));
		this.dumpAttributes(VIRTUAL, 0, str, indent);

		str.append(indent);
		str.append("Property2["+this.sizeProperty2()+"]");	// NOI18N
		for(int i=0; i<this.sizeProperty2(); i++)
		{
			str.append(indent+"\t");
			str.append("#"+i+":");
			n = (org.netbeans.modules.schema2beans.BaseBean) this.getProperty2(i);
			if (n != null)
				n.dump(str, indent + "\t");	// NOI18N
			else
				str.append(indent+"\tnull");	// NOI18N
			this.dumpAttributes(PROPERTY2, i, str, indent);
		}

	}
	public String dumpBeanNode(){
		StringBuffer str = new StringBuffer();
		str.append("ManagedScheduledExecutorType\n");	// NOI18N
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
