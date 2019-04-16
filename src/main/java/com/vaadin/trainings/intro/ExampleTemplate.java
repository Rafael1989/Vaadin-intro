/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vaadin.trainings.intro;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.polymertemplate.EventHandler;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 *
 * @author User
 */
@Tag("example-template")
@HtmlImport("example-template.html")
public class ExampleTemplate extends PolymerTemplate<ExampleModel>{
    
    @EventHandler
    private void handleClick(){
        try{
            Thread.sleep(2000);
            getModel().setValue("Vaadin!");
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
    
}
