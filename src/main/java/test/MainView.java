package test;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("")
public class MainView extends VerticalLayout {
    
    public MainView(DialogContentProvider contentProvider) {
        this.add(new Button("Click me!", event -> new Dialog(contentProvider.create()).open()));
    }
}
