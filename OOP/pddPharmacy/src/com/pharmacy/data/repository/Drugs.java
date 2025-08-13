package com.pharmacy.data.repository;
import com.pharmacy.data.models.Drug;

import java.util.ArrayList;
import java.util.List;

public class Drugs {
    private List<Drug> drug = new ArrayList<>();

    public long count(){
        return this.drug.size();
    }

    public void saveDrug(Drug drugs) {
        drug.add(drugs);
    }

    public void delete() {
        drug.removeLast();
    }

    public void deleteById(int id) {
        delete();
    }
}
