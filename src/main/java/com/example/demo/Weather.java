package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Weather {

    @Id
    private String city;

    private String description;

    private String icon;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public void mySqlQuery(String user, String pass ) {
        String user = request.getParameter("user");
        String pass = request.getParameter("pass");
        String query = "SELECT user_id FROM user_data WHERE user_name = '" + user + "' and user_password = '" + pass +"'";
        try {
            Statement statement = connection.createStatement( 
            ResultSet results = statement.executeQuery( query ); // Unsafe!    
        }
    }
}
