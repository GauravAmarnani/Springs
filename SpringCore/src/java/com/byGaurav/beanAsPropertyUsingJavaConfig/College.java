package com.byGaurav.beanAsPropertyUsingJavaConfig;

import org.springframework.stereotype.Component;

@Component
public class College {
    private Principal principal;
    private Teacher teacher;

    public void setPrincipal(Principal principal) {
        this.principal = principal;
    }

    public College(Teacher teacher) {
        this.teacher = teacher;
    }

    public void displayInfo() {
        principal.call();
        teacher.teach();
    }
}
