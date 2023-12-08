package HWLesson19;

public class Temperatur {
   // double celcius;
    double fahrenheit;

    public Temperatur(double celcius, double fahrenheit) {

        this.fahrenheit = fahrenheit;
     //   this.celcius = celcius;
    }
    public double TempCelcius() {
        return (5*(fahrenheit - 32)/9);
    }
}

