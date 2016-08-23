package com.mate.poketools.domain.models;

import com.mate.poketools.domain.AppDatabase;
import com.raizlabs.android.dbflow.annotation.Column;
import com.raizlabs.android.dbflow.annotation.PrimaryKey;
import com.raizlabs.android.dbflow.annotation.Table;
import com.raizlabs.android.dbflow.annotation.Unique;
import com.raizlabs.android.dbflow.structure.BaseModel;

/**
 * Created by mtejeda on 23/08/2016.
 */
@Table(database = AppDatabase.class)
public class Pokemon extends BaseModel {

    @PrimaryKey(autoincrement = true)
    long id; // package-private recommended, not required

    @Column
    @Unique
    private  String name; // private with getters and setters

    @Column
    private int spriteURL;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpriteURL() {
        return spriteURL;
    }

    public void setSpriteURL(int spriteURL) {
        this.spriteURL = spriteURL;
    }
}