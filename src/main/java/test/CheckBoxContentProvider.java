package test;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.checkbox.Checkbox;

public class CheckBoxContentProvider implements DialogContentProvider {
    @Override
    public Component create() {
        return new Checkbox("My checkbox", true);
    }
}
