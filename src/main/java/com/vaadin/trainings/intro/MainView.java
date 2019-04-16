package com.vaadin.trainings.intro;


import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("")
public class MainView extends VerticalLayout {

	public MainView() {
            add(new VaadinWelcome());
            add(new ExampleTemplate());
            add(new Button("Click me!", event -> {
                add(new Paragraph("added from button!"));
            }));
	}

}
