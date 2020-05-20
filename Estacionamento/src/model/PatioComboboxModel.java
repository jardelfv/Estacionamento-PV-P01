/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;

/**
 *
 * @author Jardel
 */
public class PatioComboboxModel extends AbstractListModel implements ComboBoxModel{
    private List<Patio> listaPatio;
    private Patio patioSelecionado;
    
    public PatioComboboxModel(){
        this.listaPatio = new ArrayList<>();
    }
    
    @Override
    public int getSize() {
        return listaPatio.size();
    }

    @Override
    public Object getElementAt(int index) {
        return this.listaPatio.get(index);
    }

    @Override
    public void setSelectedItem(Object obItem) {
        if(obItem instanceof Patio){
        this.patioSelecionado = (Patio) obItem;
        fireContentsChanged(listaPatio, 0, listaPatio.size());
        }
    }

    @Override
    public Object getSelectedItem() {
        return this.patioSelecionado;
    }
    
    public void addPatio(Patio pPatio){
        this.listaPatio.add(pPatio);
    }
    public void reset (){
        this.listaPatio.clear();
    }
}
