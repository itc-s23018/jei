class Temper {
    private double temperature;
    public double getTemperature() { return temperature; }
    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
}

public class d52Q2kadai {
    public static void main(String[] args) {
        Temper t = new Temper();
        t.setTemperature(17.2);
        double temp = t.getTemperature(); //温度を取得
        System.out.println(temp);
    }
}

