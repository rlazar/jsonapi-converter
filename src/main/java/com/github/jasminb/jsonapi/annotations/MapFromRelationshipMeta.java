package com.github.jasminb.jsonapi.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotation used to configure mapping a field from relationship meta field in JSON API resources.
 *
 * @author rlazar
 */

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface MapFromRelationshipMeta {
	String value();
	String attribute();
}
