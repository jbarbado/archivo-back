package org.jb.stockpile;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
@Cacheable
public class Folder extends PanacheEntity {

    public Integer number;
    public Integer page;
    public String description;

}
