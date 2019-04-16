/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vaadin.trainings.intro;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.HasComponents;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Paragraph;

/**
 *
 * @author User
 */
public class VaadinWelcome extends Composite<Div> implements HasComponents{
    
    public VaadinWelcome(){
        add(new Image("hero-reindeer.svg", "hero"));
        add(new Paragraph("Hello Vaadin!"));
    }
    
    
}
