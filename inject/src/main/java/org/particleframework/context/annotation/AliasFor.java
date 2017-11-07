/*
 * Copyright 2017 original authors
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License. 
 */
package org.particleframework.context.annotation;

import org.particleframework.core.annotation.AnnotationMetadata;

import java.lang.annotation.*;

/**
 * <p>Allows specifying an annotation member alias. That is a member of an annotation can be used to represent the value of annotation</p>
 *
 * <p>The representation is constructed via the {@link AnnotationMetadata} interface</p>
 *
 * @author Graeme Rocher
 * @since 1.0
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Documented
public @interface AliasFor {

    /**
     * Used to declare aliases of members within the current annotation
     */
    String value() default "";

    /**
     * The name of the member that <code>this</code> member is an alias for
     */
    String member() default "";

    /**
     * The type of annotation in which the aliased {@link #member()} is declared.
     * If not specified the alias is applied to the current annotation.
     */
    Class<? extends Annotation> annotation() default Annotation.class;
}
