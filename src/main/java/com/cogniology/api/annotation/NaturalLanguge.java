package com.cogniology.api.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface NaturalLanguge {
	enum Context { GLOBALE, APPLICATION, PAGE }
	Context context() default Context.APPLICATION;
	String value();
}
