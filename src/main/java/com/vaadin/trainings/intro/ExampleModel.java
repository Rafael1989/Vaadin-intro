/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vaadin.trainings.intro;

import com.vaadin.flow.templatemodel.TemplateModel;

/**
 *
 * @author User
 */
public interface ExampleModel extends TemplateModel {
    void setValue(String value);
    String getValue();
}
