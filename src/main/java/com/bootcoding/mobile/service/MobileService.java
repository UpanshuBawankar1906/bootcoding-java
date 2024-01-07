package com.bootcoding.mobile.service;

import com.bootcoding.mobile.brands.Mobile;
import com.bootcoding.mobile.brands.Survey;
import com.bootcoding.mobile.brands.User;

public class MobileService {
    public void process(){
        User us = new User();

        us.setName("Upanshu");
        us.setAge(23);
        us.setMobileName("Samsung");
        us.setUsageYear(4);

        User us2 = new User();
        us2.setName("Ankusk");
        us2.setAge(23);
        us2.setMobileName("Vivo");
        us2.setUsageYear(4);

        User us3 = new User();
        us3.setName("Sanjay");
        us3.setAge(56);
        us3.setMobileName("Realme");
        us3.setUsageYear(2);

        User us4 = new User();
        us4.setName("Kawyanshi");
        us4.setAge(25);
        us4.setMobileName("OnePlus7");
        us4.setUsageYear(3);


        Mobile m = new Mobile();
        m.setBrand_name("Samsung");
        m.setRam(4);
        m.setRom(64);
        m.setProcessor("Exynos");

        Mobile m2 = new Mobile();
        m2.setBrand_name("Vivo");
        m2.setRam(4);
        m2.setRom(64);
        m2.setProcessor("SnapDragon");

        Mobile m3 = new Mobile();
        m3.setBrand_name("RealMe");
        m3.setRam(4);
        m3.setRom(64);
        m3.setProcessor("SnapDragon");

        Mobile m4 = new Mobile();
        m4.setBrand_name("OnePlus");
        m4.setRam(4);
        m4.setRom(128);
        m4.setProcessor("SnapDragon");

        Survey s = new Survey();
        s.setArea_no(04);
        s.setArea_name("Nadanwan");

    }
}
