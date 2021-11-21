/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

/**
 *
 * @author Ivy
 */
public class Address {
    public String streetInfo1;
    public String streetInfo2;
    public String city;
    public String postalCode;
    public String province;
    public String country;

    public Address(String st1, String st2, String city, String postalCode, String pro, String country) {
        streetInfo1 = st1;
        streetInfo2 = st2;
        this.city = city;
        this.postalCode = postalCode;
        province = pro;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Street Info 1: " +  streetInfo1 + "\nStreet Info 2: " + streetInfo2 +
                "\nCity: " + city + "\nPostal Code: " + postalCode + "\nProvince: " + province + "\nCountry: " + country;
    }
}
