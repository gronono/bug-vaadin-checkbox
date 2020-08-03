package test;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.checkbox.Checkbox;

// Les composants dynamiques du provider ne sont pas chargés par Vaadin
// Utilisation d'une fausse route pour forcer le chargement
// voir https://vaadin.com/forum/thread/17765421/14-npm-mode-com-vaadin-flow-component-internal-componentmetadata-front
//@Route(registerAtStartup = false)
public class CheckBoxContentProvider implements DialogContentProvider {
    @Override
    public Component create() {
        return new Checkbox("My checkbox", true);
    }
}
