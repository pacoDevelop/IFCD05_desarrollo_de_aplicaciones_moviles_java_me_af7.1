package org.javaee7.cdi.bean.discovery;

// DEFINICION DE LAS CONSTANTES DE CLASE PARA LA ANOTACION A CREAR
import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;
// DEFINICION GENERAL DE LA ANOTACION
import java.lang.annotation.Target;
import java.lang.annotation.Retention;
// DEFINICION DENTRO DE CDI
import javax.inject.Qualifier;

@Qualifier
@Target({TYPE,METHOD,FIELD,PARAMETER})
@Retention(RUNTIME)
public @interface Informal {
}
