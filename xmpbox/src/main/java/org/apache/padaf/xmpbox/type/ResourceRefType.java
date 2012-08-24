/*****************************************************************************
 * 
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 * 
 ****************************************************************************/

package org.apache.padaf.xmpbox.type;

import java.util.Calendar;
import java.util.List;

import org.apache.padaf.xmpbox.XMPMetadata;
import org.apache.padaf.xmpbox.XmpConstants;
import org.apache.padaf.xmpbox.schema.XMPSchema;

public class ResourceRefType extends AbstractStructuredType {

	public static final String ELEMENT_NS = "http://ns.adobe.com/xap/1.0/sType/ResourceRef#";

	public static final String PREFERRED_PREFIX = "stRef";
	
	@PropertyType(propertyType = "URI")
	public static final String DOCUMENT_ID = "documentID";

	@PropertyType(propertyType = "URI")
	public static final String FILE_PATH = "filePath";

	@PropertyType(propertyType = "URI")
	public static final String INSTANCE_ID = "instanceID";
	
	@PropertyType(propertyType = "Date")
	public static final String LAST_MODIFY_DATE = "lastModifyDate";
	
	@PropertyType(propertyType = "URI")
	public static final String MANAGE_TO = "manageTo";

	@PropertyType(propertyType = "URI")
	public static final String MANAGE_UI = "manageUI";
	
	@PropertyType(propertyType = "AgentName")
	public static final String MANAGER = "manager";

	@PropertyType(propertyType = "Text")
	public static final String MANAGER_VARIANT = "managerVariant";

	@PropertyType(propertyType = "Text")
	public static final String PART_MAPPING = "partMapping";
	
	@PropertyType(propertyType = "Text")
	public static final String RENDITION_PARAMS = "renditionParams";

	@PropertyType(propertyType = "Text")
	public static final String VERSION_ID = "versionID";

	@PropertyType(propertyType = "Choice")
	public static final String MASK_MARKERS = "maskMarkers";
	
	@PropertyType(propertyType = "RenditionClass")
	public static final String RENDITION_CLASS = "renditionClass";
	
	@PropertyType(propertyType = "Part")
	public static final String FROM_PART = "fromPart";
	
	@PropertyType(propertyType = "Part")
	public static final String TO_PART = "toPart";
	
	public static final String ALTERNATE_PATHS = "alternatePaths";

	/**
	 * 
	 * @param metadata
	 *            The metadata to attach to this property
	 * @param namespace
	 *            the namespace URI to associate to this property
	 * @param prefix
	 *            The prefix to set for this property
	 * @param propertyName
	 *            The local Name of this thumbnail type
	 */
	public ResourceRefType(XMPMetadata metadata) {
		super(metadata, XmpConstants.RDF_NAMESPACE, PREFERRED_PREFIX);
		setAttribute(new Attribute(XMPSchema.NS_NAMESPACE, "xmlns", PREFERRED_PREFIX, ELEMENT_NS));
	}
	
	public String getDocumentID () {
		TextType absProp = (TextType)getFirstEquivalentProperty(DOCUMENT_ID,URIType.class);
		if (absProp != null) {
			return absProp.getStringValue();
		} else {
			return null;
		}
	}
	
	public void setDocumentID (String value) {
		addSimpleProperty(DOCUMENT_ID, value);
	}
	
	public String getFilePath () {
		TextType absProp = (TextType)getFirstEquivalentProperty(FILE_PATH,URIType.class);
		if (absProp != null) {
			return absProp.getStringValue();
		} else {
			return null;
		}
	}

	public void setFilePath (String value) {
		addSimpleProperty(FILE_PATH, value);
	}

	public String getInstanceID () {
		TextType absProp = (TextType)getFirstEquivalentProperty(INSTANCE_ID,URIType.class);
		if (absProp != null) {
			return absProp.getStringValue();
		} else {
			return null;
		}
	}

	public void setInstanceID (String value) {
		addSimpleProperty(INSTANCE_ID, value);
	}

	public Calendar getLastModifyDate () {
		DateType absProp = (DateType)getFirstEquivalentProperty(LAST_MODIFY_DATE,DateType.class);
		if (absProp != null) {
			return absProp.getValue();
		} else {
			return null;
		}
	}

	public void setLastModifyDate (Calendar value) {
		addSimpleProperty(LAST_MODIFY_DATE, value);
	}

	public String getManageUI () {
		TextType absProp = (TextType)getFirstEquivalentProperty(MANAGE_UI,URIType.class);
		if (absProp != null) {
			return absProp.getStringValue();
		} else {
			return null;
		}
	}
	
	public void setManageUI (String value) {
		addSimpleProperty(MANAGE_UI, value);
	}
	
	public String getManageTo () {
		TextType absProp = (TextType)getFirstEquivalentProperty(MANAGE_TO,URIType.class);
		if (absProp != null) {
			return absProp.getStringValue();
		} else {
			return null;
		}
	}
	
	public void setManageTo (String value) {
		addSimpleProperty(MANAGE_TO, value);
	}
	
	public String getManager () {
		TextType absProp = (TextType)getFirstEquivalentProperty(MANAGER,AgentNameType.class);
		if (absProp != null) {
			return absProp.getStringValue();
		} else {
			return null;
		}
	}
	
	public void setManager (String value) {
		addSimpleProperty(MANAGER, value);
	}
	
	public String getManagerVariant () {
		TextType absProp = (TextType)getFirstEquivalentProperty(MANAGER_VARIANT,TextType.class);
		if (absProp != null) {
			return absProp.getStringValue();
		} else {
			return null;
		}
	}
	
	public void setManagerVariant (String value) {
		addSimpleProperty(MANAGER_VARIANT, value);
	}
	
	public String getPartMapping () {
		TextType absProp = (TextType)getFirstEquivalentProperty(PART_MAPPING,TextType.class);
		if (absProp != null) {
			return absProp.getStringValue();
		} else {
			return null;
		}
	}
	
	public void setPartMapping (String value) {
		addSimpleProperty(PART_MAPPING, value);
	}
	
	public String getRenditionParams () {
		TextType absProp = (TextType)getFirstEquivalentProperty(RENDITION_PARAMS,TextType.class);
		if (absProp != null) {
			return absProp.getStringValue();
		} else {
			return null;
		}
	}
	
	public void setRenditionParams (String value) {
		addSimpleProperty(RENDITION_PARAMS, value);
	}
	
	public String getVersionID () {
		TextType absProp = (TextType)getFirstEquivalentProperty(VERSION_ID,TextType.class);
		if (absProp != null) {
			return absProp.getStringValue();
		} else {
			return null;
		}
	}
	
	public void setVersionID (String value) {
		addSimpleProperty(VERSION_ID, value);
	}
	
	public String getMaskMarkers () {
		TextType absProp = (TextType)getFirstEquivalentProperty(MASK_MARKERS,ChoiceType.class);
		if (absProp != null) {
			return absProp.getStringValue();
		} else {
			return null;
		}
	}
	
	public void setMaskMarkers (String value) {
		addSimpleProperty(MASK_MARKERS, value);
	}
	
	public String getRenditionClass () {
		TextType absProp = (TextType)getFirstEquivalentProperty(RENDITION_CLASS,RenditionClassType.class);
		if (absProp != null) {
			return absProp.getStringValue();
		} else {
			return null;
		}
	}
	
	public void setRenditionClass (String value) {
		addSimpleProperty(RENDITION_CLASS, value);
	}
	
	public String getFromPart () {
		TextType absProp = (TextType)getFirstEquivalentProperty(FROM_PART,PartType.class);
		if (absProp != null) {
			return absProp.getStringValue();
		} else {
			return null;
		}
	}
	
	public void setFromPart (String value) {
		addSimpleProperty(FROM_PART, value);
	}
	
	public String getToPart () {
		TextType absProp = (TextType)getFirstEquivalentProperty(TO_PART,PartType.class);
		if (absProp != null) {
			return absProp.getStringValue();
		} else {
			return null;
		}
	}
	
	public void setToPart (String value) {
		addSimpleProperty(TO_PART, value);
	}
	
	public void addAlternatePath(String value) {
        ArrayProperty seq = (ArrayProperty) getFirstEquivalentProperty(ALTERNATE_PATHS, ArrayProperty.class);
        if (seq==null) {
        	seq = new ArrayProperty(getMetadata(), null,
                    PREFERRED_PREFIX, ALTERNATE_PATHS,
                    ArrayProperty.ORDERED_ARRAY);
        	addProperty(seq);
        }
		TypeMapping tm = getMetadata().getTypeMapping();
        TextType tt = (TextType)tm.instanciateSimpleProperty(getMetadata(), null, "rdf", "li", value, "Text");
        seq.addProperty(tt);
	}

	/**
	 * Get Versions property
	 * 
	 * @return version property to set
	 */
	public ArrayProperty getAlternatePathsProperty() {
        return (ArrayProperty) getFirstEquivalentProperty(ALTERNATE_PATHS, ArrayProperty.class);
	}

	/**
	 * Get List of Versions values
	 * 
	 * @return List of Versions values
	 */
	public List<String> getAlternatePaths() {
        ArrayProperty seq = (ArrayProperty) getFirstEquivalentProperty(ALTERNATE_PATHS, ArrayProperty.class);
        if (seq!=null) {
        	return TypeUtil.getArrayListToString(seq);
        } else {
        	return null;
        }
	}

	@Override
	public String getFieldsNamespace() {
		return ELEMENT_NS;
	}


}
