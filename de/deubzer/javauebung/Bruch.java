package de.deubzer.javauebung;

class Bruch {
    int zaehler;
    int nenner;

    void ausgeben() {
        System.out.print(zaehler + "/" + nenner);
    }
    void kuerzen(){
        var m = Math.abs(zaehler);
        var n = Math.abs(nenner);
        var r = m % n;
        while (r > 0) {
            m = n;
            n = r;
            r = m % n;
        }
        zaehler /=n;
        nenner /=n;
    }
    void gekuerztausgeben() {
        kuerzen();
        ausgeben();
    }
    void erweitern(int a){
        zaehler *= a;
        nenner *= a;
    }
    // void erweitern(double a){
    //     zaehler = zaehler * a;
    //     nenner *= a;
    // }
    void multipliziere(Bruch m){
        zaehler *= m.zaehler;
        nenner *= m.nenner;
    }
    void setzte(int z) {
        zaehler = z;
        nenner = 1;
    }
    void setzte(int z, int n) {
        zaehler = z;
        nenner = n;
    }
    // double dezimalwert(int zaehler, int nenner){
    //     return (double) zaehler / nenner;
    // }
    double dezimalwert(){
        return (double) zaehler / nenner;
    }
    int signum(){
        if (this.dezimalwert() == 0.0){
            return 0;
        }if (this.dezimalwert() > 0.0){
            return 1;
        }
        return -1;
    }
}
