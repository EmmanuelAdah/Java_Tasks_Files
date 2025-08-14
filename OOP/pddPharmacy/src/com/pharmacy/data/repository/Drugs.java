package com.pharmacy.data.repository;
import com.pharmacy.data.models.Drug;

import java.util.ArrayList;
import java.util.List;

public class Drugs {
    private static List<Drug> drugs = new ArrayList<>();

    public long count(){
        return drugs.size();
    }

    public void saveDrug(Drug drug) {
        if(!isNew(drug)) drugs.add(drug);
    }

    public boolean isNew(Drug drug){
        return drugs.contains(drug);
    }

    public void delete() {
        drugs.removeLast();
    }

    public void deleteById(int id) {
        delete();
    }

    public Drug findById(Long id) {
        for (Drug drug : drugs) if (id.equals(drug.getId())) return drug;
        return null;
    }

    public Drug findByName(String name) {
        for (Drug drug : drugs) if (name.equalsIgnoreCase(drug.getName())) return drug;
        return null;
    }

    public void update(Drug drug) {
        for (int index = 0; index < drugs.size(); index++)
            if (drug.getId() == drugs.get(index).getId())
                drugs.set(index, drug);
    }

    public void clearList() {
        drugs.clear();
    }
}
