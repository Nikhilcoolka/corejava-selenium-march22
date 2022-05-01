package org.matrix.sigma.niksangli.corejava.javaprogram;


interface webdriverid {
    void getupid();
}

interface webdriverbalance {
    void getbalance();
}

class RemoteWebdriver implements webdriverid, webdriverbalance {
    public void getupid() {
        System.out.println("This is getupiid method");
    }

    public void getbalance() {
        System.out.println("This is getbalance method");
    }
}

class ChromeDriver extends RemoteWebdriver {
    void m1() {
        System.out.println("This is m1  method");
    }
}

class WebDriverConcept {
    public static void main(String[] args) {
        /// only  webdriverid interface  method come not chrome driver
        webdriverid id = new ChromeDriver();
        id.getupid();
        // id.getbalance();
        //id.m1();

        // only  webdriverbalance interface  method come not remotewebdriver method
        // webdriverbalance wb=new RemoteWebdriver();
        //wb.getbalance();
        //wb.getupid();

        ///  all chrome driver and interface method will print
        //  ChromeDriver d1=new ChromeDriver();
        //  d1.m1();
        //  d1.getupid();
        //  d1.getbalance();

        // m1 method cannot execute i.e parent  to ch only parent class method execute
        // RemoteWebdriver d2=new ChromeDriver();
        // d2.getbalance();
        // d2.getupid();
        //d2.m1();



        // not possible child to parent
        //ChromeDriver cd=new RemoteWebdriver();
        //cd.getupid();


    }

}

