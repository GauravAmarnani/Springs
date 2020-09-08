package com.byGaurav.scopeAnnotationUsingXml;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import static java.lang.System.out;

@Component
@Scope
public class WithScope {
    private String name;

    @Required
    @Value("${WithScope.name}")
    public void setName(String name) {
        this.name = name;
    }

    public void displayInfo() {
        out.println("Name : " + name);
    }
}
