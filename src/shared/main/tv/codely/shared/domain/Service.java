package tv.codely.shared.domain;

import org.springframework.stereotype.Component;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE) // Solo aplicable a clases o interfaces
@Retention(RetentionPolicy.RUNTIME) // Disponible en tiempo de ejecución
@Component
public @interface Service {
}
