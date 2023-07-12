/**
 * @author Simon Chung
 * @version 07/26/2022
 * @purpose This program prints out weather and precipitation data using arrays and printf statements.
 * (Implementation class)
 */
public class M06_02WeatherData {
    private final double[] temp, prec;
    private final String[] month;

    public M06_02WeatherData(double[] temp, double[] prec, String[] month) {
        this.temp = temp;
        this.prec = prec;
        this.month = month;
    }

    public double avgtemp() {
        double aveg = 0;
        for (double temp : temp) {
            aveg += temp;
        }
        return aveg / 12;
    }

    public double totalprec() {
        double total = 0;
        for (double prec : prec) {
            total += prec;
        }
        return total;
    }

    public double[] celsiusconvert() {
        for (int i = 0; i < temp.length; i++) {
            temp[i] = (temp[i] - 32) * 5 / 9;
        }
        return temp;
    }
    
    public double[] cmconvert() {
        for (int i = 0; i < prec.length; i++) {
            prec[i] *= 2.54;
        }
        return prec;
    }

    public String[] addperiod() {
        for (int i = 0; i < month.length; i++) {
            month[i] += ".";
        }
        return month;
    }
}