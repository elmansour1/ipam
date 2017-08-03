/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.camtel.ipam.data;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author faouzi el mansour <faouzielmansour@yahoo.com>
 * 
 */
@Entity
public class Vlan implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column
    private int number;
    
    @Column(nullable = false)
    private String name;
    
    @ManyToOne
    @JoinColumn(nullable = false)
    private Batiment batiment;
    
    @ManyToOne
    @JoinColumn(nullable = false)
    private Reseau reseau;
    
    @ManyToOne
    @JoinColumn(nullable = false)
    private Users user;

    public Vlan(int number, String name, Batiment batiment, Reseau reseau, Users user) {
        this.number = number;
        this.name = name;
        this.batiment = batiment;
        this.reseau = reseau;
        this.user = user;
    }

    public Vlan(int number, String name) {
        this.number = number;
        this.name = name;
    }

    
    

    public Vlan() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Batiment getBatiment() {
        return batiment;
    }

    public void setBatiment(Batiment batiment) {
        this.batiment = batiment;
    }

    public Reseau getReseau() {
        return reseau;
    }

    public void setReseau(Reseau reseau) {
        this.reseau = reseau;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }
    
    

    @Override
    public String toString() {
        return "Vlan{" + "number=" + number + ", name=" + name + ", batiment=" + batiment + ", reseau=" + reseau + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + this.number;
        hash = 59 * hash + Objects.hashCode(this.name);
        hash = 59 * hash + Objects.hashCode(this.batiment);
        hash = 59 * hash + Objects.hashCode(this.reseau);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Vlan other = (Vlan) obj;
        if (this.number != other.number) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.batiment, other.batiment)) {
            return false;
        }
        if (!Objects.equals(this.reseau, other.reseau)) {
            return false;
        }
        return true;
    }
    
    
}
